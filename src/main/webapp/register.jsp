<div class="breadcrumb">
    <div class="container">
        <a class="breadcrumb-item" href="index.jsp">Home</a>
        <span class="breadcrumb-item active">Register</span>
    </div>
</div>
<section class="static about-sec">
    <div class="container">
        <h1>My Account / Register</h1>
        <div class="form">
            <form  action="register" method="post">
                <div class="row">
                    <div class="col-md-4">
                        <input type="text" name="username" placeholder="username" required>
                        <span class="required-star">*</span>
                    </div>
                    <div class="col-md-4">
                        <input type="password" name="password" placeholder="password" required>
                        <span class="required-star">*</span>
                    </div>
                    <div class="col-md-4">
                        <input type="text" name="phone" placeholder="phone" required>
                        <span class="required-star">*</span>
                    </div>
                    <div class="col-lg-8 col-md-12">
                        <button class="btn btn-primary align-content-center" type="submit">Register</button>
                        <h5>not Registered? <a href="login.jsp">Login here</a></h5>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>