<head>
<%@ page isELIgnored="false" %>
</head>
<html>
<head>
<title> Spring Project </title>
</head>
<body>
<h2>Hello World! welcome to my SpringMvc website</h2>
<form action="event_page">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to see your credentials.</p>
    <hr>

    <label for="Name"><b>Email</b></label>
    <input type="text" placeholder="Enter UserName" name="userName" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="givenPassword" required>
    <hr>

    <button type="submit" class="registerbtn">Register</button>
  </div>
</form>
</body>
</html>
