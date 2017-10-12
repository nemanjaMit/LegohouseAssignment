
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <h1>Order succesfull!</h1>
                    <i class="fa fa-thumbs-o-up" aria-hidden="true"></i>              
                    <hr>
                    
                    <div>
                        <div class="col-sm-12">
                            <h3>Order Sumarry</h3>
                            <strong>Email: <c:out value="${user.getEmail()}"/></strong>
                    </div>
                    
                </div>
                    
                    <br>
                
                <table class="table table-responsive table-striped table-bordered">
                    <thead class="thead-inverse">
                        <tr>
                            <th class="text-center">Length</th>
                            <th class="text-center">Width</th>
                            <th class="text-center">Height</th>
                            <th class="text-center">Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="text-center"><c:out value="${order.getLength()}"/></td>
                            <td class="text-center"><c:out value="${order.getWidth()}"/></td>
                            <td class="text-center"><c:out value="${order.getHeight()}"/></td>
                            <td class="text-center"><c:out value="${order.getDate()}"/></td>
                        </tr>
                    </tbody>
                 </div>
            </div>
        </div>
</body>
</html>
</div>
