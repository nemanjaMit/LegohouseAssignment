//
//package FunctionLayer;
//
//import java.util.HashMap;
//
//public class RenderUtil {
//    
//    public static String showAllUserInvoices(User user) {
//        StringBuilder sb = new StringBuilder();     
//        HashMap<String, Order> orderList = user.getOrderMap();
//        sb.append("<h2>List of Invoices</h2>");   
//        sb.append("<table class=\"table table-striped table-hover invoice-table\">");
//        sb.append("<thead>");
//        sb.append("<tr>"
//                    + "<th>#</th>"
//                + "</tr>"
//            + "</thead>"         
//        ); 
//            
//        sb.append("<tbody>"); 
//        int counter = 0;
//        double totalPrice = 0;
//        for(House house : orderList) {
//            sb.append("<tr class=\"userinvoices\" data-id=\"").append(house.getWidth()).append("\">"
//                        + "<th scope=\"row\">").append(++counter).append("</th>"       
//                        + "<td>").append(invoice.getCupcakeAmount()).append("</td>"
//                        + "<td>").append(invoice.getPrice()).append("</td>"
//                        + "<td>").append(invoice.getDate()).append("</td>"
//                    + "</tr>"
//            );
//            totalPrice += invoice.getPrice();
//        }
//        sb.append("</tbody>"
//            + "</table>"
//        );          
//        return sb.toString();
//    }
//
//}
