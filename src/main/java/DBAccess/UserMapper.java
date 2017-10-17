package DBAccess;

import Exceptions.LegohouseException;
import FunctionLayer.User;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {

    public static void createUser(User user) throws LegohouseException {
        try {
            Connection connection = Connector.getConnection();
            String SQL = "INSERT INTO `user` (email, password, role) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS); // Get the auto incremented id from the database with Statement.RETURN_GENERATED_KEYS.

            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getRole());
            statement.executeUpdate();
            
            ResultSet rsId = statement.getGeneratedKeys(); // Get the 'id' from the INSERT INTO operation.
            rsId.next();
            int id = rsId.getInt(1);
            user.setId(id);
        } 
        catch (SQLException ex) {
           if (ex.getSQLState().startsWith("23")) { // ErrorCode 23: Duplicate Primary Key.
                throw new LegohouseException("Email already exists!");
           }
        }
        catch (Exception ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws LegohouseException {
        try {
            Connection connection = Connector.getConnection();
            String SQL = "SELECT id, role FROM `user` WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(SQL);

            statement.setString(1, email);
            statement.setString(2, password);         
            
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String role = rs.getString("role");
                
                User user = new User(email, password, role);
                user.setId(id);
                return user;
            } 
            else {
                throw new LegohouseException("Could not validate user!");
            }
        } 
        catch (Exception ex) {
            throw new LegohouseException(ex.getMessage());
        }
    }
}