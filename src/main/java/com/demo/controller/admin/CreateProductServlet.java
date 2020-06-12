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
import javax.ws.rs.Path;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateProductServlet", urlPatterns = "/admin/product/create")
public class CreateProductServlet extends HttpServlet {
    @EJB
    ProductDao productDao;
    @EJB
    CategoryDao categoryDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = new Product();
        product.setName(request.getParameter("name"));
        product.setPrice(Integer.parseInt(request.getParameter("price")));
//        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        product.setCategoryId(1);
        product.setImage(request.getParameter("image"));
        product.setDescription(request.getParameter("description"));
        productDao.insertProduct(product);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Categories> list = categoryDao.getCategory();
        request.setAttribute("category",list);
        request.getRequestDispatcher("/admin/product/create.jsp").forward(request, response);

    }
}
