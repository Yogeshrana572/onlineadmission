
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
    function myFunction() {
    var x = document.getElementById("myinput");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}
</script>
    </head>
    <body>
        <form style="margin: auto; width: 50%;" >
            <h1 style="text-align: center; border: 2px solid black; font-family: sans-serif, arial, verdana; background-color: whitesmoke">
                Student Registration</h1>
            <input type="text" name="fname" placeholder="First Name" class="form-control" required="Mandatory to fill">
            <br>
            <input type="text" name="lname" placeholder="last Name" class="form-control" required="Mandatory to fill">
            <br>
            <input type="Email" name="mail" placeholder="Email id" class="form-control" required="Mandatory to fill">
            <br>
            <input type="password" name="pass" placeholder="Password" class="form-control" id="myinput" required="Mandatory to fill">
            <input type="checkbox" onclick="myFunction()">Show Password
            <br><br>
            <input type="number" name="cont" placeholder="Mobile number" class="form-control" required="Mandatory to fill">
            <br>
            <textarea name="address" placeholder="Address" class="form-control" required="Mandatory to fill"></textarea>
            <br>
            <button class="btn btn-success" style="position: relative; left: 350px;"> Submit </button>
        </form>
    </body>
</html>
