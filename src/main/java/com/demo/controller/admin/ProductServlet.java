package com.demo.controller.admin;

import com.demo.dao.ProductDao;
import com.demo.entity.Product;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ProductServlet",urlPatterns = "/products")

public class ProductServlet extends HttpServlet {
    @EJB
    ProductDao productDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productDao.getProduct();
        request.setAttribute("productList",productList);

//        request.getRequestDispatcher("index.jsp").forward(request, response);
        request.getRequestDispatcher("product.jsp").forward(request, response);

    }
}
