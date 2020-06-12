package com.demo.controller.admin;

import com.demo.dao.CategoryDao;
import com.demo.dao.ProductDao;
import com.demo.entity.Categories;
import com.demo.entity.Product;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UpdateProductServlet", urlPatterns = "/admin/product/edit")
public class UpdateProductServlet extends HttpServlet {
    @EJB
    ProductDao productDao;
    @EJB
    CategoryDao categoryDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        String image = request.getParameter("image");
        String description = request.getParameter("description");

        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setCategoryId(categoryId);
        product.setPrice(price);
        product.setDescription(description);
        product.setImage(image);
        productDao.updateProduct(id,product);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        Product p = productDao.getProductById(id);

        List<Categories> list = categoryDao.getCategory();
        request.setAttribute("product",p);
        request.setAttribute("category",list);
        request.getRequestDispatcher("/admin/product/update.jsp").forward(request, response);


    }
}
