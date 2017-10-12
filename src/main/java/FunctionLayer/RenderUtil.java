
package FunctionLayer;

public class RenderUtil {
    
    public static String showOrder(User user) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("<table class=\"table table-striped\">");
        sb.append("<thead>");
        sb.append("<tr>" 
                +  "<th#</th>"
                + "<th>Length</th>"
                + "<th>Width</th>"
                + "<th>Height</th>"
                + "<th>Date</th>"
            + "<tr>"
        + "</thead>"
        );
        
//        sb.append("<tbody>");
//        int counter = 0;
//        for (Order order : orderList) {
//            sb.append("<tr>"
//                    + "<th scope=\"row\">").append(++counter).append("</th>"
//                            + "<td>").append(order.getLength()).append("<td>").append(order.getWidth()).append("<td>").append(order.getHeight()).append("<td>").append(order.getUserid()
//                    + "</tr>"
//            );
//                    
//        }
//        
//        
        return sb.toString();
            
    
    } 
}
