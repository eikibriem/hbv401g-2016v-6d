
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Arrays;


public class HelloWorld
{
	
	public static void main(String[] args)
	{
            SQLiteJDBC connection = new SQLiteJDBC();
            
            System.out.println("Hello World");

            System.out.println("Hello World!!!!! þessu er breytt héraaaaaaaaaaaaa");

            //tours.setPrice(100);
            //System.out.println("verdid er = " + tours.getPrice());
            
            List<Tours> results = null;

            ResultSet data = connection.getData();
            try {
                while (data.next()) {
                	Tours tour = new Tours();

                    tour.setId(data.getInt("name"));
                    tour.setPrice(data.getInt("username"));
                    tour.setLanguage(data.getInt("password"));
                    
                    results.add(tour);
                        
                    System.out.println( tour.getId() + " " + tour.getPrice() + " " + tour.getLanguage() );
                }
                System.out.println("Thetta tokst");
                System.out.println(results);
            } catch (SQLException ex) {
                Logger.getLogger(HelloWorld.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
	}
}

