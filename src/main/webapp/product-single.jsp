<%@ page import="com.demo.entity.Product" %>
<% Product p = (Product) request.getAttribute("product");%>
<div class="breadcrumb">
    <div class="container">
        <a class="breadcrumb-item" href="index.jsp">Home</a>
        <span class="breadcrumb-item active">Shop</span>
    </div>
</div>
<section class="product-sec">
    <div class="container">
        <h1><%=p.getName()%></h1>
        <div class="row">
            <input type="text" value="<%=p.getId()%>"style="display: none">
            <div class="col-md-6 slider-sec">
                <!-- main slider carousel -->
                <div id="myCarousel" class="carousel slide">
                    <!-- main slider carousel items -->
                    <div class="carousel-inner">
                        <div class="active item carousel-item" data-slide-number="0">
                            <img src="<%=p.getImage()%>" class="img-fluid">
                        </div>
                    </div>
                    <!-- main slider carousel nav controls -->
                </div>
                <!--/main slider carousel-->
            </div>
            <div class="col-md-6 slider-content">
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's printer took a galley of type and Scrambled it to make a type and typesetting industry. Lorem Ipsum has been the book. </p>
                <p>t has survived not only fiveLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's printer took a galley of type and</p>
                <ul>
                    <span class="price">$<%=p.getPrice()%></span>
                </ul>
                <div class="btn-sec">
                    <button class="btn ">Add To cart</button>
                    <button class="btn black">Buy Now</button>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="related-books">
    <div class="container">
        <h2>You may also like these book</h2>
        <div class="recomended-sec">
            <div class="row">
                <div class="col-lg-3 col-md-6">
                    <div class="item">
                        <img src="images/img1.jpg" alt="img">
                        <h3>how to be a bwase</h3>
                        <h6><span class="price">$49</span> / <a href="#">Buy Now</a></h6>
                        <div class="hover">
                            <span><i class="fa fa-long-arrow-right" aria-hidden="true"></i></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="item">
                        <img src="images/img2.jpg" alt="img">
                        <h3>How to write a book...</h3>
                        <h6><span class="price">$19</span> / <a href="#">Buy Now</a></h6>
                        <span class="sale">Sale !</span>
                        <div class="hover">
                            <span><i class="fa fa-long-arrow-right" aria-hidden="true"></i></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="item">
                        <img src="images/img3.jpg" alt="img">
                        <h3>7-day self publish...</h3>
                        <h6><span class="price">$49</span> / <a href="#">Buy Now</a></h6>
                        <div class="hover">
                            <span><i class="fa fa-long-arrow-right" aria-hidden="true"></i></span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="item">
                        <img src="images/img4.jpg" alt="img">
                        <h3>wendy doniger</h3>
                        <h6><span class="price">$49</span> / <a href="#">Buy Now</a></h6>
                        <div class="hover">
                            <span><i class="fa fa-long-arrow-right" aria-hidden="true"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>