<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.demo.entity.Product" %>
<%@ page import="java.util.List" %>
<%
    List<Product> productList = (List<Product>) request.getAttribute("productList");
%>
<div class="breadcrumb">
    <div class="container">
        <a class="breadcrumb-item" href="index.html">Home</a>
        <span class="breadcrumb-item active">Products</span>
    </div>
</div>
<section class="static about-sec">
    <div class="container">
        <h2>highly recommendes books</h2>
        <div class="recomended-sec">
            <div class="row">
                <c:forEach items="<%=productList%>" var="product">
                    <div class="col-lg-2 col-md-3 col-sm-4">
                        <div class="item">
                            <img src="${product.image}" alt="img">
                            <h3><a href="product?id=${product.id}">${product.name}</a></h3>
                            <h6><span class="price">${product.price}</span> / <a href="#">Buy Now</a></h6>
                        </div>
                    </div>
                </c:forEach>

        </div>
</section>
