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

@WebServlet(name = "ListProductServlet", urlPatterns = "/admin/product/list")
public class ListProductServlet extends HttpServlet {
    @EJB
    ProductDao productDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productDao.getProduct();
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("/admin/product/index.jsp").forward(request, response);

    }
}
