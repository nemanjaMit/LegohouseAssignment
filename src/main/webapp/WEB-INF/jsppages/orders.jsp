<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<html lang="en">
    <head>
        <title>Legohus</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp">Lego house</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="FrontController?command=legohousebuilder">Builder</a></li>
                    <li class="active"><a href="FrontController?command=orders">Orders</a></li>
                </ul>
            </div>
        </nav>


        <div class="container">
            <div class="row">
                <div class="mx-auto text-center">
                    <h3><strong>Orderdetails for</strong></h3>
                    <h4><c:out value="${user.getEmail()}"/></h4>

                    <br><h4>Here you can see all your placed orders!</h4 >

                    <hr>

                    <table class="table">
                        <thead class="thead-inverse">
                            <tr>
                                <th class="text-center"><strong>Order ID</strong></th>
                                <th class="text-center"><strong>Length</strong></th>
                                <th class="text-center"><strong>Width</strong></th>
                                <th class="text-center"><strong>Height</strong></th>
                                <th class="text-center"><strong>Order Submitted</strong></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${orders}" var="order">    
                                <tr>
                                    <td class="text-center"><c:out value="${order.getId()}"/></td>
                                    <td class="text-center"><c:out value="${order.getLength()}"/></td>
                                    <td class="text-center"><c:out value="${order.getWidth()}"/></td>
                                    <td class="text-center"><c:out value="${order.getHeight()}"/></td>
                                    <td class="text-center"><c:out value="${order.getReceivedDate()}"/></td>
                                </tr>
                            </c:forEach> 
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>