//import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class jtable {
    
     JFrame frame; //frame
     JTable table; //table
     int numOne =1;
     int[] mileArray = new int[10];
     int[] mile ={1,2,3,4,5,6,7,8,9,10};//array for miles initialized
     double[] kilometers = {1.609, 3.218, 4.828, 6.437, 8.046, 9.656, 11.265, 12.874, 14.484, 16.093};//array for kilmometers initalized
             
     //constructor
     jtable()
     {
     
        //Frame initialization
        frame = new JFrame();
        
        //frame Title
        frame.setTitle("Miles to kilometers");

    
        
        
        
        
        
        //Date to be displayed in the JTable
        Object [][] data = {
               {mile[0], kilometers[0]},
              {mile[1], kilometers[1]},
              {mile[2], kilometers[2]},
              {mile[3], kilometers[3]},
              {mile[4], kilometers[4]},
              {mile[5], kilometers[5]},
              {mile[6], kilometers[6]},
              {mile[7], kilometers[7]},
              {mile[8], kilometers[8]},
              {mile[9], kilometers[9]}
        };  
     
       //Column Names
       String[] columnNames ={"Miles", "Kilometers"};
     
       // Initalzing the JTable
       table = new JTable(data, columnNames);
       table.setBounds(150, 60, 200, 150);

       // adding it to JScrollpane
        JScrollPane sp =  new JScrollPane(table);
        frame.add(sp);
        // Frame Size
        frame.setSize(500, 200);
        // Frame Visible = true
        frame.setVisible(true);
      }

      // Driver method 
      public static void main (String[]args)
      {
         new jtable();
      }
    };
   





     
