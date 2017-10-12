package PresentationLayer;

import FunctionLayer.LegohouseException;
import FunctionLayer.LogicFacade;
import FunctionLayer.User;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The purpose of Command is to...
 *
 * @author kasper
 */
abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("PlaceOrder", new PlaceOrder());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    String execute(HttpServletRequest request, HttpServletResponse response) throws LegohouseException, ClassNotFoundException {
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        
        LogicFacade.createOrder(length, width, height, height);
        
        return "confirmation";

    }
}
