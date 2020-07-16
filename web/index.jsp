<%--
  Created by IntelliJ IDEA.
  User: pearlg
  Date: 2020/06/06
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Servlets: Graham Pearl</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="./images/logo.ico">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karla&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat&display=swap">
    <link href="${pageContext.request.contextPath}/css/small.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/validate.js"></script>
</head>
<body>

<h1>Java Servlets within TomCat Using Hibernate</h1>
<p>User Story: Site is used for the registration of Permits for eThekwini - Control Utility Zone</p>

<section><h2>View Report</h2>
    <p>Demonstrates the using MySQL and Hibernate with Servlets</p>
    <p>User Story: Report is produced for online access to reflect the current Permits</p>
    <form action="PermitsReport" method="GET">
        <fieldset>
            <legend> Permit Information Registration</legend>
            <article class="container">
                <input type="submit" class="htmlButton" value="Submit"/>
            </article>
        </fieldset>
    </form>
</section>

<section><h2>Search of Permit</h2>
    <p>Demonstrates the using of the Form components for various Servlets</p>
    <p>User Story: Searching of Permits performed on Filtered Criteria</p>
    <form action="PermitsSearch" method="GET">
        <fieldset>
            <legend> Permit Information To Filter By (PermitNo OR Region OR Type)</legend>
            <article class="container">
                <label for="permitNo" class="inputfield lhs">Permit Number*:</label>
                <input id="permitNo" class="rhs" type="text rhs" name="regPermit"
                       pattern="[a-zA-Z]{2}[0-9]{3}[a-zA-Z +/d]*" accept="XX999" required="">

                <label for="permitRegion" class="lhs">Region:</label>
                <select id="permitRegion" class="rhs">
                </select>

                <label for="permitType" class="lhs">Type:</label>
                <select id="permitType" class="rhs">
                </select>
                <input type="submit" class="htmlButton" value="Submit"/>
            </article>
        </fieldset>
    </form>
</section>

<section><h2>Searching of Permit (Authorized)</h2>
    <p>Demonstrates the Searching of Permits </p>
    <form action="ErrorGenerator" method="GET">
        <fieldset>
            <legend> Permit Information Registration (Authorized only)</legend>
            <article class="container">
                <label for="permitNoToFind" class="inputfield lhs">Permit Number*:</label>
                <input id="permitNoToFind" class="rhs" type="text rhs" accept="XX999" name="regPermit"
                       pattern="[a-zA-Z]{2}[0-9]{3}[a-zA-Z +/d]*" required="">
                <input type="submit" class="htmlButton" value="Submit"/>
            </article>
        </fieldset>
    </form>
</section>
</body>
<footer>
    <script>
        loadJSONOptions("permitRegion", "https://grahampearl.github.io/json/region.json");
        loadJSONOptions("permitType", "https://grahampearl.github.io/json/permit.json");
    </script>
</footer>
</html>
