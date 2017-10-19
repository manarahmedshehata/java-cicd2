<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
   <style>
        body {
            background-image: url("login.PNG");
            background-repeat:no-repeat;
            background-size:cover;        
        }
    </style>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

    <div class="container" align="center">
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
    <form method="POST" action="${contextPath}/login" class="form-signin">
        

        <div class="form-group ${error != null ? 'has-error' : ''}" >
            <table>
                <tr>
                    <td>
                        <h2 class="form-heading" style="font-family: inherit">Log in</h2>
                    </td>
                </tr>
                <tr>
                    <td>
            <span>${message}</span>
            UserName  </td>
                    <td>
            <input name="username" type="text" class="form-control" style="" placeholder="Username"
                   autofocus="true"/>
                    </td>
            </tr>
            <tr>
                <td>
            Password 
                </td>
                <td>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
                </td>
            </tr>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <tr>
                <td>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                </td>
            </tr>
            <tr>
            <h4 class="text-center"><a href="${contextPath}/registration" style="color:white">Create an account</a></h4>
            </tr>
            </table>
        </div>

    </form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
