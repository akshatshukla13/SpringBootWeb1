<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Number Input Form</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Enter Two Numbers</h2>
        <form action="result">
            <input type="number" name="number1" placeholder="Enter first number" required>
            <input type="number" name="number2" placeholder="Enter second number" required>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
