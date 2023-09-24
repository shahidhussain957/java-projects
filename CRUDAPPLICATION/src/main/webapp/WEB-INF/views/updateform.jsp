<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>


    <div class="container mt-4">
    <div class="row">
    <div class="col-md-6 offset-md-3 ">
        <h2 class="text-center">Change Product Detail</h2>
        <form action="${pageContext.request.contextPath}/saveProduct" method="post">

        <input type="hidden" name="id" value="${product.id }"/>
            <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" class="form-control" id="productName" name="name" required placeholder="Enter Product Name" value="${product.name }">
            </div>
            <div class="form-group">
                <label for="productDescription">Product Description</label>
                <textarea class="form-control" id="productDescription" name="description" rows="3" required placeholder="Product Description">${product.description}</textarea>
            </div>
            <div class="form-group">
                <label for="productPrice">Price</label>
                <input type="text" class="form-control" id="productPrice" name="price" placeholder="Enter Price" value="${product.price }" >
            </div>
             <div class="container text-center">
            <a href="${pageContext.request.contextPath }/" class="btn btn-secondary">Back</a>
            <button type="submit" class="btn btn-danger">Submit</button>
            </div>
           
        </form>
        </div>
        </div>
    </div>
</body>
</html>