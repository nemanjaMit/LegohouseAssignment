
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
                    <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up & Login</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="mx-auto text-center">
                    
                    <h2>Lego house builder</h2>

                    <p>This is the page where you can build your own lego house.</p><br>
                    <p>1 - Make sure to insert the correct length, width and height for your own lego house </p>
                    <p>2 - You can use your keyboard to insert values or you can use the arrows on the right side of the bars</p>
                    <p>3 - The minimum value is 1 meter and the maximum is at 100 meters</p>
                    <p>4 - Click on the 'Order' button as soon as all the values are entered</p>
                    <p>5 - Enjoy your own selfconstructed legohouse!</p><br>
                    <div>
                        <center><form name="order" action="FrontController" method="POST">
                                <input type="hidden" name="command" value="placeOrder">
                                <div class="form-group" style="width: 200px">
                                    <b>Length:</b>
                                    <input class="form-control" type="number" name="length" min="1" max="100" required autofocus>
                                </div>
                                <div class="form-group" style="width: 200px">
                                    <b>Width:</b>
                                    <input class="form-control" type="number" name="length" min="1" max="100" required autofocus>
                                </div>
                                <div class="form-group" style="width: 200px">
                                    <b>Height:</b>
                                    <input class="form-control" type="number" name="length" min="1" max="100" required autofocus><br>
                                    <button type="submit">Order</button><br><br>
                                    
                                    <br><img src="media/builder.png" alt="Lego builder" height="250" width="250">
                            </form>
                    </div> <br><br>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
</div>
