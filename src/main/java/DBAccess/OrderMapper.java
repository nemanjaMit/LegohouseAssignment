
package DBAccess;

import FunctionLayer.LegohouseException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMapper {

    public static void createOrder(User user) throws LegohouseException {
        try {
            String SQL = "INSERT INTO orders set userid = ?;";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(SQL);
            userPstmt.setInt(1, user.getId());
            userPstmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

    public static int getOrder(User user) throws LegohouseException {
        Statement stm;
        try {
            stm = Connector.connection().createStatement();
            String SQL = "SELECT orderid FROM orders WHERE status = 'Open' AND userid = " + user.getId() + ";";
            ResultSet rs = stm.executeQuery(SQL);
            if (rs.next()) {
                return rs.getInt("orderid");
            } else {
                throw new LegohouseException("Could not find order");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

    public static void createLineItem(int orderId) throws LegohouseException {
        try {
            String SQL = "INSERT INTO orders set userid = ?;";
            PreparedStatement userPstmt = Connector.connection().prepareStatement(SQL);
            userPstmt.setInt(1,orderId);
            userPstmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

}