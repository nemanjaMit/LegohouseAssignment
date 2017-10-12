
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LegohouseException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PlaceOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegohouseException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        ArrayList<Order> orderId = OrderMapper.getAllOrders(user);
        OrderMapper.getAllOrders(user);
        
        return user.getRole() + "page";
    
    }
    
}