<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>

<link rel="stylesheet" type="text/css" href="/resources/css/pp.css">



</head>
<body>
    <div class="container mt-4">
    <div class="row">
    <div class="col-md-6 offset-md-3 ">
        <h2 class="text-center">Add Products</h2>
        <form action="saveProduct" method="post">
            <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" class="form-control" id="productName" name="name" required placeholder="Enter Product Name" >
            </div>
            <div class="form-group">
                <label for="productDescription">Product Description</label>
                <textarea class="form-control" id="productDescription" name="description" rows="3" required placeholder="Product Description"></textarea>
            </div>
            <div class="form-group">
                <label for="productPrice">Price</label>
                <input type="text" class="form-control" id="productPrice" name="price" placeholder="Enter Price">
            </div>
             <div class="container text-center">
            <a href="${pageContext.request.contextPath }/" class="btn btn-secondary">Back</a>
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
           
        </form>
        </div>
        </div>
    </div>
    
</body>
</html>