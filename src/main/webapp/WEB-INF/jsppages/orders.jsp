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
                    <li class="active"><a href="legohousebuilder.jsp">Builder</a></li>
                    <li class="active"><a href="orders.jsp">Orders</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="mx-auto text-center">
                    <h1 class="mt-3">My Orders</h1>

                    <hr>

                    <c:if test="${empty orderList}">
                        <h3>You have no submitted orders!</h3>
                    </c:if>

                    <c:if test="${not empty orderList}">                  
                        <table class="table table-responsive table-striped table-bordered">
                            <thead class="thead-inverse">
                                <tr>
                                    <th class="text-center"><strong>Order ID</strong></th>
                                    <th class="text-center"><strong>Length</strong></th>
                                    <th class="text-center"><strong>Width</strong></th>
                                    <th class="text-center"><strong>Height</strong></th>
                                    <th class="text-center"><strong>Submitted</strong></th>
                                    <th class="text-center"><strong>Shipped</strong></th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${orderList}" var="order">    
                                <tr>
                                    <td class="text-center"><strong><c:out value="${order.getId()}"/></strong></td>
                                    <td class="text-center"><strong><c:out value="${order.getLength()}"/></strong></td>
                                    <td class="text-center"><strong><c:out value="${order.getWidth()}"/></strong></td>
                                    <td class="text-center"><strong><c:out value="${order.getHeight()}"/></strong></td>
                                    <td class="text-center"><strong><c:out value="${order.getReceivedDate()}"/></strong></td>

                                <c:if test="${order.getShippedDate() == null}">     
                                    <td class="text-center" id="notShipped"><strong><c:out value="Not shipped yet"/></strong></td>
                                </c:if>

                                <c:if test="${order.getShippedDate() != null}">  
                                    <td class="text-center" id="shipped"><strong><c:out value="${order.getShippedDate()}"/></strong></td>
                                </c:if>

                                </tr>
                            </c:forEach> 
                            </tbody>
                        </table>
                    </c:if>
                </div>
            </div>
        </div>
</html>