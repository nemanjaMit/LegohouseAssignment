<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<c:if test="${not empty user}">
    <jsp:forward page="WEB-INF/jsppages/legohousebuilder.jsp" />
</c:if>

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
            </div>
        </nav>
        

        <div class="container">
            <div>
                <div class="mx-auto text-center">

                    <h2>Welcome to the lego house register and login page!</h2>

                    <p>This is the login & register page, so please read the information below!</p><br>
                    <div>
                        <div>
                            <h3>Login</h3>
                            <p>Fill out your email and your password to log on your account:</p>
                            <center><form name="login" action="FrontController" method="POST">
                                    <input type="hidden" name="command" value="login">
                                    <div class="form-group" style="width: 250px">
                                        <input class="form-control" type="email" name="email" placeholder="Email..." required autofocus>
                                    </div>
                                    <div class="form-group" style="width: 250px">
                                        <input class="form-control" type="password" name="password" placeholder="Password..." required>
                                    </div>
                                    <button type="submit">Login</button>
                                </form>
                        </div> <br>

                        <div>    
                            <h3>Register</h3>
                            <p>Fill out your details:</p>

                            <center><form name="register" action="FrontController" method="POST">
                                    <input type="hidden" name="command" value="register">
                                    <div class="form-group" style="width: 250px">
                                        <input class="form-control" type="email" name="email" placeholder="Email..." required>
                                    </div>
                                    <div class="form-group" style="width: 250px">
                                        <input class="form-control" type="password" name="password1" placeholder="Password..." pattern=".{5,15}" title="Password must be from 5 to 15 characters!" required>
                                    </div>
                                    <div class="form-group" style="width: 250px">
                                        <input class="form-control" type="password" name="password2" placeholder="Retype Password....." pattern=".{5,15}" title="Password must be from 5 to 15 characters!" required>
                                    </div>
                                    <button type="submit">Register</button>
                                </form>   
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
