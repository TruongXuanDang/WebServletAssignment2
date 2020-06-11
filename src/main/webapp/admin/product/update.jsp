<%@ page import="com.demo.entity.Product" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% Product p = (Product) request.getAttribute("product");%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Update Product Form</h1>
                </div>
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">General Form</li>
                    </ol>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title"> Create Book</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form role="form" method="post" action="update">
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" name="name" id="name" value="<%= p.getName() %>" placeholder="Enter name">
                                </div>
                                <div class="form-group">
                                    <label for="price">Price</label>
                                    <input type="number" class="form-control" name="price" id="price" value="<%= p.getPrice() %>" placeholder="Enter price">
                                </div>
                                <div class="form-group">
                                    <label for="price">Description</label>
                                    <input type="text" class="form-control" name="description" value="<%= p.getDescription() %>" id="description" placeholder="Enter description">
                                </div>
                                <div class="form-group">
                                    <label for="image">Image</label>
                                    <input type="text" class="form-control" style="display: none" id="image" name="image">
                                </div>
                                <div class="form-group">
                                    <img id="previous" style="display: none"  src="<%= p.getImage() %>" class="hidden img-thumbnail" alt="Alternate Text" style="width: 100px" />
                                    <div style="margin-top: 5px">
                                        <button type="button" id="upload_widget" class="genric-btn info radius">Upload files</button>
                                    </div>
                                </div>


                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>

                    </div>
                    <!-- /.card -->
                </div>
                <!--/.col (right) -->
            </div>
            <!-- /.row -->
        </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
</div>
<script src="https://widget.cloudinary.com/v2.0/global/all.js" type="text/javascript"></script>

<script type="text/javascript">
    var myWidget = cloudinary.createUploadWidget({
            cloudName: 'hanv11',
            uploadPreset: 'bpmopgln'}, (error, result) => {
            if (!error && result && result.event === "success") {
                console.log('Done! Here is the image info: ', result.info);
                var imgLink = result.info.secure_url;
                document.querySelector("input[name='image']").value = imgLink;
                var imgPrevious = document.getElementById("previous");
                imgPrevious.src = imgLink;
                imgPrevious.style.display = "inline";
            }
        }
    )

    document.getElementById("upload_widget").addEventListener("click", function(){
        myWidget.open();
    }, false);
</script>