package e_m_s;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLDatabase {
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;

    void readData() {
        try {
            connect = ApiClient.getInstance();
            sc = new Scanner(System.in);
            
            //statement = connect.createStatement();
            // result = statement.executeQuery("SELECT * FROM blood_donation.donor");
            /*
            preparedStatement = connect.prepareStatement("SELECT id,name,title FROM e_list WHERE e_m_s = ?;");

            preparedStatement.setString(1, sc.nextLine());
            result = preparedStatement.executeQuery();

            while (result.next()) {
                System.out.println("name: " + result.getString("name"));
                System.out.println("age: " + result.getString("age"));
                System.out.println("gender: " + result.getString("gender"));
            }
            */
            /*String sql = "insert into e_list(name,age,gender,title)values(?,?,?,?)";
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.setString(1, "Anuek");
            statement.setInt(2, 20);
            statement.setString(3, "male");
            statement.setString(4, "CoFounder");
            
            int rows = statement.executeUpdate();
            if(rows>0){
                System.out.println("A row has been inserted.");
            }
            statement.close();*/
            
            /*sql = "Select *from e_list";
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            
            while(result.next()){
                String name = result.getString("name");
                String title = result.getString("title");
                count ++;
                System.out.println("All Empolyee list");
                System.out.println("NO "+count+": "+name+" "+ title );
            }*/
            
            connect.close();

        } catch (ClassNotFoundException | SQLException e) {

        } 

    }

}
