<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <!-- Normal JSP syntax -->
        <!-- <form action="add">
            <h2>Result is : <%= session.getAttribute("result") %></h2>
        </form> -->

        <!-- JSTL way -->
        <!-- for calculator -->
        <!-- <h2>Result is : ${result}</h2> -->

        <!-- For Alien by Model Attribute -->
        <div class="card">
            <h2> Welcome to Swats </h2>
            <p> ${alien} </p>
        </div>

    </body>
</html>
