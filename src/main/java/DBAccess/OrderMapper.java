
package DBAccess;

import FunctionLayer.LegohouseException;
import FunctionLayer.Order;
import FunctionLayer.User;

import java.util.ArrayList;
import java.time.LocalDate;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper {

    public static void createOrder(Order order) throws LegohouseException, ClassNotFoundException {
        try {
            Connection connection = Connector.connection();
            String SQL = "INSERT INTO `orders` (userid, length, width, height, date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, order.getUserid());
            statement.setInt(2, order.getLength());
            statement.setInt(3, order.getWidth());
            statement.setInt(4, order.getHeight());
            statement.setObject(5, order.getDate());
            statement.executeUpdate();
            
            ResultSet rsId = statement.getGeneratedKeys();
            rsId.next();
            int id = rsId.getInt(1);
            
        }
        catch (SQLException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }
    public static ArrayList<Order> getAllOrders(User user) throws LegohouseException {
        ArrayList<Order> list;
        try {
            Connection connection = Connector.connection();
            String SQL = "SELECT * FROM `orders` WHERE userid = ?";
            PreparedStatement statement = connection.prepareStatement(SQL);
            
            statement.setInt(1, user.getId());
            ResultSet rs = statement.executeQuery();
            
            list = new ArrayList<>();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                int userID = rs.getInt("user");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                LocalDate date = rs.getObject("date", LocalDate.class);
                
            }
            return list;
        }
        catch (ClassNotFoundException | SQLException ex) {
            throw new LegohouseException((ex.getMessage()));
        }
    }
}
        