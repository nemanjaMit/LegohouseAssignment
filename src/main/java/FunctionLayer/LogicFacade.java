package FunctionLayer;


import DBAccess.UserMapper;
import DBAccess.OrderMapper;
import Exceptions.LegohouseException;
import Exceptions.PlaceOrderException;
import java.util.List;


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
        
        House house = new House(length, width, height);
        order.setHouse(house);
        
        return order;
    }
        public static List<Order> getUserOrders(User user) throws LegohouseException {
        List<Order> orderList = OrderMapper.getAllUserOrders(user);
        return orderList;
    }
}