<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your test</title>
</head>
<body>
<h1><%= "Your test" %>
</h1>

<form action="/question" method="POST">

    What is your gender?
    <br/><input type="radio" name="question1" value="male" /> Male
    <br/><input type="radio" name="question1" value="female" /> Female

    <br/>Do you have a child?
    <br/><input type="radio" name="question2" value="yes" /> Yes
    <br/><input type="radio" name="question2" value="no" /> No

    <br/>Are you married?
    <br/><input type="radio" name="question3" value="yes" /> Yes
    <br/><input type="radio" name="question3" value="no" /> No

    <br/>Do you have a work?
    <br/><input type="radio" name="question4" value="yes" /> Yes
    <br/><input type="radio" name="question4" value="no" /> No

    <br/>Are you a programmer?
    <br/><input type="radio" name="question5" value="yes" /> Yes
    <br/><input type="radio" name="question5" value="no" /> No

    <br/>Do you want to learn something new?
    <br/><input type="radio" name="question6" value="yes" /> Yes
    <br/><input type="radio" name="question6" value="no" /> No

    <br/>Do you want to study at Prog Academy?
    <br/><input type="radio" name="question7" value="yes" /> Yes
    <br/><input type="radio" name="question7" value="no" /> No

    <br/><input type="submit" />
</form>

<br/>
<a href="/about">About author</a>
</body>
</html>