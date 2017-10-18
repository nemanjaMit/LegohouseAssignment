<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<html lang="en">
    <head>
        <title>Order submitted!</title>
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
            <div>
                <div class="mx-auto text-center">

                    <hr>

                    <h3>Order Details</h3>
                    <strong>Email:</strong> <c:out value="${user.getEmail()}"/><br>
                    <strong>Order ID:</strong> #<c:out value="${order.getId()}"/>

                    <br><br><img src="media/submit.png" alt="Legohouse" height="250" width="250"><br><br>

                    <div>
                        <div>
                        </div>
                    </div>

                    <h3>Entered data</h3>
                    <p>This is your entered data - your length, width and height of the lego house!</p><br>


                    <table class="table">
                        <thead>
                            <tr>
                                <th class="text-center">Length</th>
                                <th class="text-center">Width</th>
                                <th class="text-center">Height</th>
                                <th class="text-center">Order Submitted</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="text-center"><c:out value="${order.getLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHeight()}"/></td>
                                <td class="text-center"><c:out value="${order.getReceivedDate()}"/></td>
                            </tr>
                        </tbody>
                    </table>

                    <table class="table">
                        <thead class="thead-inverse">
                            <tr>
                                <th class="text-center">Size</th>
                                <th class="text-center"><strong>Side 1 (Length)</strong></th>
                                <th class="text-center"><strong>Side 2 (Width)</strong></th>
                                <th class="text-center"><strong>Side 3 (Length)</strong></th>
                                <th class="text-center"><strong>Side 4 (Width)</strong></th>
                                <th class="text-center"><strong>Total Bricks</strong></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr> 
                                <td class="text-center"><strong><c:out value="2x4"/></strong></td> 
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickFourLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickFourWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickFourLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickFourWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalHeightBrickFour()}"/></td>
                            </tr>

                            <tr>
                                <td class="text-center"><strong><c:out value="2x2"/></strong></td>               
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickTwoLength()}"/></strong></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickTwoWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickTwoLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickTwoWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalHeightBrickTwo()}"/></td>
                            </tr>

                            <tr>
                                <td class="text-center"><strong><c:out value="1x2"/></strong></td> 
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickOneLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickOneWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickOneLength()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalBrickOneWidth()}"/></td>
                                <td class="text-center"><c:out value="${order.getHouse().getTotalHeightBrickOne()}"/></td>
                            </tr>
                        </tbody>
                    </table>

                    <br><h4><strong>Total: </strong><c:out value="${order.getHouse().getTotalBricks()}"/> bricks.</h4>
                    
                    <form>
                        <br><button type="submit" name="command" value="orders">View all orders</button>
                    </form>

                    <br>
                </div>
            </div>
        </div>
    </body>
</html>