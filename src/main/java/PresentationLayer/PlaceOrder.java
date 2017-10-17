package PresentationLayer;

import FunctionLayer.Exceptions.PlaceOrderException;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PlaceOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws PlaceOrderException {
        int length, width, height;

        length = Integer.parseInt(request.getParameter("length"));
        width = Integer.parseInt(request.getParameter("width"));
        height = Integer.parseInt(request.getParameter("height"));

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        Order order = LogicFacade.createOrder(user, length, width, height);
      
        request.setAttribute("order", order); // Set the order.
        
        return "confirmation";
    }
}