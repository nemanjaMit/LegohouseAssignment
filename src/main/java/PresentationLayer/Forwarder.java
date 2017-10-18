/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import Exceptions.LegohouseException;
import Exceptions.PlaceOrderException;
import FunctionLayer.LogicFacade;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nemanja
 */
public class Forwarder extends Command {

    public Forwarder() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LegohouseException, PlaceOrderException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        String forward = request.getParameter("command");
        
        if("orders".equals(forward)) {
            List<Order> orders = LogicFacade.getUserOrders(user);
            request.setAttribute("orders",orders);
        }
        
        return forward;
        
    }
    
}
