<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/templates/header.jsp" %>
<p>
<p>
<br>
<br>
<br>
<br>
    <div class="container-wrapper">
    
  
    	 <div class="container">
 		 <div class="page-header">
    	 <h1>All Products:</h1>
   		 <p class="lead"> Check out all the items </p>
    	 </div>
    	 
    		<table class="table">
    		<tr>
			<th>Product Name</th>
			<th>Product Category</th>
			<th>Product Description</th>
			<th>Product Price</th>
			<th>Product Condition</th>
			<th>Product Status</th>
			<th>Units in Stock</th>
			<th>Product Manufacturer</th>

	<c:forEach items="${productlist}" var="product">
	<tr>
	<td>${product.productName}</td>
	<td>${product.productCategory}</td>
	<td>${product.productDescription}</td>
	<td>${product.productPrice}</td>
	<td>${product.productCondition}</td>
	<td>${product.productStatus}</td>
	<td>${product.unitsinStock}</td>
	<td>${product.productManufacturer}</td>
	</tr>
	</c:forEach>
    
    </table>
  
<%@include file="/WEB-INF/views/templates/footer.jsp" %>