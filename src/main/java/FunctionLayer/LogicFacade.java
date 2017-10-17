package FunctionLayer;


import DBAccess.UserMapper;
import DBAccess.OrderMapper;
import FunctionLayer.Exceptions.LegohouseException;
import FunctionLayer.Exceptions.PlaceOrderException;


public class LogicFacade {

    public static User login(String email, String password) throws LegohouseException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LegohouseException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static Order createOrder(User user, int length, int width, int height) throws PlaceOrderException {
        Order order = new Order(user.getId(), length, width, height);
        OrderMapper.createOrder(order);
        user.putOrderIntoMap(order);
        
        House house = new House(length, width, height); // Create house (calculating bill of materials).
        order.setHouse(house); // Assign the house to the order.
        
        return order;
    }
}