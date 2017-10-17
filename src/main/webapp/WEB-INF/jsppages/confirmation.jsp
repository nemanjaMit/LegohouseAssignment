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
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up & Login</a></li>
                </ul>
            </div>
        </nav>

<div class="container">
    <div class="row">
        <div class="mx-auto text-center">
            <h1 class="mt-3">Order Submitted!</h1>
            
            <hr>

            <img src="resources/img/order.png" alt="order.png" height="250" width="250">

            <h3>Order #<c:out value="${order.getId()}"/></h3>

            <hr>

            <div class="row">
                <div class="col-sm-12">
                    <h3>Order Summary</h3>
                    <strong>Email: <c:out value="${user.getEmail()}"/></strong>
                </div>
            </div>

            <br>

            <table class="table table-responsive table-striped table-bordered">
                <thead class="thead-inverse">
                    <tr>
                        <th class="text-center"><strong>Length</strong></th>
                        <th class="text-center"><strong>Width</strong></th>
                        <th class="text-center"><strong>Height</strong></th>
                        <th class="text-center"><strong>Submitted</strong></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="text-center"><strong><c:out value="${order.getLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHeight()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getReceivedDate()}"/></strong></td>
                    </tr>
                </tbody>
            </table>
                    
            <table class="table table-responsive table-striped table-bordered">
                <thead class="thead-inverse">
                    <tr>
                        <th class="text-center"><strong>Type</strong></th>
                        <th class="text-center"><strong>Side 1 (Length)</strong></th>
                        <th class="text-center"><strong>Side 2 (Width)</strong></th>
                        <th class="text-center"><strong>Side 3 (Length)</strong></th>
                        <th class="text-center"><strong>Side 4 (Width)</strong></th>
                        <th class="text-center"><strong>Total Bricks x Height</strong></th>
                    </tr>
                </thead>
                <tbody>
                    <!-- A house can only be rectangle, which means that the amount of bricks that one side have of a brick type, the other side must have as well. -->
                    <tr> 

                        <td class="text-center"><strong><c:out value="2x4"/></strong></td> 
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickFourLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickFourWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickFourLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickFourWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalHeightBrickFour()}"/></strong></td>
                    </tr>

                    <tr>
                        <td class="text-center"><strong><c:out value="2x2"/></strong></td>               
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickTwoLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickTwoWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickTwoLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickTwoWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalHeightBrickTwo()}"/></strong></td>
                    </tr>
                    
                    <tr>
                        <td class="text-center"><strong><c:out value="1x2"/></strong></td> 
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickOneLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickOneWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickOneLength()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalBrickOneWidth()}"/></strong></td>
                        <td class="text-center"><strong><c:out value="${order.getHouse().getTotalHeightBrickOne()}"/></strong></td>
                    </tr>
                </tbody>
            </table>

            <h3><strong><c:out value="Total Bricks: ${order.getHouse().getTotalBricks()}"/></strong></h3>
            
            <br>

            <form action="FrontController" method="POST">
                <button type="submit" name="command" value="builder" class="btn btn-secondary">Build Again</button>      
                <button type="submit" name="command" value="orders" class="btn btn-secondary">View Orders</button>
            </form>

        </div>
    </div>
</div>