<%--
  Created by IntelliJ IDEA.
  User: 1234567890
  Date: 7/25/2018
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style type="text/css">
    .input {
        height: 180px;
        width: 450px;
        margin-left: 37%;
        padding: 10px;
        border: 3px blue solid;
    }

    .input h1 {
        color: blue;
    }
</style>
<body>
<form method="post" action="discount">
    <div class="input">
        <h1>Product Discount Calculator</h1>
        <table>
            <tr>
                <td>Product Description:</td>
                <td><input type="text" name="Description" size="30"/></td>
            </tr>
            <tr>
                <td>List Price:</td>
                <td><input type="text" name="Price" size="30"/></td>
            </tr>
            <tr>
                <td>Discount Percent:</td>
                <td><input type="text" name="Discount" size="30"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" size="30" value="Calculate Discount"/></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
