<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
    <style>
        .table{
            border-collapse: collapse;
            margin: 10px;
            text-align: center;
        }
        #image{
            width: 100px;
            height: 100px;
        }

    </style>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<fieldset>
    <legend>product information</legend>
    <table>
        <tr>
            <td>Id: </td>
            <td>${requestScope["product"].getId()}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${requestScope["product"].getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${requestScope["product"].getPrice()}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${requestScope["product"].getDescription()}</td>
        </tr>
        <tr>
            <td>Maker: </td>
            <td>${requestScope["product"].getMaker()}</td>
        </tr>
        <tr>
            <td>Avatar: </td>
            <td>
                <img src="<%request.getServletContext().getRealPath("");%>/image/${product.getAvatar()}" id="image">
            </td>
        </tr>
    </table>
</fieldset>
</body>
</html>