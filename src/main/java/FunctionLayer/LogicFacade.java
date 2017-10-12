package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LegohouseException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LegohouseException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static Order createOrder(int length, int width, int height, int userId) throws LegohouseException, ClassNotFoundException {
        Order order = new Order(length, width, height, userId);
        OrderMapper.createOrder(order);
        
        return order; 
        
    }
        

}
