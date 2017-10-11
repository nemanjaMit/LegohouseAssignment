
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LegohouseException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PlaceOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegohouseException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        OrderMapper.createOrder(user);
        int orderId = OrderMapper.getOrder(user);
        OrderMapper.createLineItem(orderId);
    
        return null;
    }
    
}