package ERM;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class ViewStudent extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public ViewStudent()
    {
        ArrayList<String> columnNames = new ArrayList<String>();
        ArrayList<ArrayList<Object>> data = new ArrayList<ArrayList<Object>>();

        //  Connect to an MySQL Database, run query, get result set
        java.sql.Connection con =DBInfo.getConnection();
        String sql = "SELECT * FROM addstudent";

        // Java SE 7 has try-with-resources
        // This will ensure that the sql objects are closed when the program 
        // is finished with them
        try 
        {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
       
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            while (rs.next())
            {
                @SuppressWarnings("rawtypes")
				ArrayList row = new ArrayList<Object>(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        Vector<String> columnNamesVector = new Vector<String>();
        @SuppressWarnings("rawtypes")
		Vector<Vector> dataVector = new Vector<Vector>();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList<?> subArray = data.get(i);
            Vector<?> subVector = new Vector<Object>();
            for (int j = 0; j < subArray.size(); j++)
            {
                extracted(subArray, subVector, j);
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Class<?> getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean extracted(ArrayList subArray, Vector subVector, int j) {
		return subVector.add(subArray.get(j));
	}

    public static void main(String[] args)
    {
        ViewStudent frame = new ViewStudent();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }
}