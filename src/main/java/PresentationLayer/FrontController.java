package PresentationLayer;

import Exceptions.LegohouseException;
import Exceptions.PlaceOrderException;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Command action = Command.from(request);
            String view = action.execute(request, response);
            if("index".equals(view)) {
                request.getRequestDispatcher(view + ".jsp").forward(request, response);
            }
            else {
                request.getRequestDispatcher("/WEB-INF/jsppages/" + view + ".jsp").forward(request, response);
            }
        } catch (LegohouseException ex) {
            request.setAttribute("error", ex.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (PlaceOrderException ex) {
            request.setAttribute("error", ex.getMessage());
            request.getRequestDispatcher("WEB-INF/jsppages/legohousebuilder.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "FrontController";
    }
}