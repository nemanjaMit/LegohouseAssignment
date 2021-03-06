package DBAccess;

import Exceptions.LegohouseException;
import Exceptions.PlaceOrderException;

import FunctionLayer.Order;
import FunctionLayer.User;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.sql.Date;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderMapper {

    public static void createOrder(Order order) throws PlaceOrderException {
        try {
            Connection connection = Connector.getConnection();
            String SQL = "INSERT INTO `order` (userId, length, width, height, receivedDate) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, order.getUserId());
            statement.setInt(2, order.getLength());
            statement.setInt(3, order.getWidth());
            statement.setInt(4, order.getHeight());
            statement.setObject(5, order.getReceivedDate().toString());
            statement.executeUpdate();

            ResultSet rsId = statement.getGeneratedKeys();
            rsId.next();
            int id = rsId.getInt(1);
            order.setId(id);
        } catch (Exception ex) {
            throw new PlaceOrderException(ex.getMessage());
        }
    }

    public static List<Order> getAllUserOrders(User user) throws LegohouseException {
        List<Order> orderList;
        try {
            Connection connection = Connector.getConnection();
            String SQL = "SELECT * FROM `order` WHERE userId = ?";
            PreparedStatement statement = connection.prepareStatement(SQL);

            statement.setInt(1, user.getId());
            ResultSet rs = statement.executeQuery();

            orderList = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                int userId = rs.getInt("userId");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                LocalDate receivedDate = rs.getObject("receivedDate", LocalDate.class);

                orderList.add(new Order(id, userId, length, width, height, receivedDate));
            }

            return orderList;
        } catch (Exception ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }
    public static List<Order> getAllOrders() throws LegohouseException {
        List<Order> orderList;
        try {
            Connection connection = Connector.getConnection();
            String SQL = "SELECT * FROM `order`";
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(SQL);

            orderList = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                int userId = rs.getInt("userId");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                LocalDate receivedDate = rs.getObject("receivedDate", LocalDate.class);
                
                orderList.add(new Order(id, userId, length, width, height, receivedDate));
            }

            return orderList;
        } catch (Exception ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }
    
}