package PresentationLayer;

import Exceptions.LegohouseException;

import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SeeAllOrders extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegohouseException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String role = user.getRole();
        
        if (role.equals("employee")){
            
            List<Order> AllOrders = LogicFacade.getUserOrders(user);
            request.setAttribute("orders", AllOrders);
            
        } else {
            
            List<Order> orders = LogicFacade.getUserOrders(user);
            request.setAttribute("orders",orders);
        }
        return "orders";
    }

    
    
}