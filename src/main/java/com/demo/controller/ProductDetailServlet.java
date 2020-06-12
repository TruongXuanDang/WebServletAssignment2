package com.demo.controller;

import com.demo.dao.ProductDao;
import com.demo.entity.Product;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDetailServlet",urlPatterns = "/product")
public class ProductDetailServlet extends HttpServlet {
    @EJB
    ProductDao productDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = productDao.getProductById(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("product",product);
        request.getRequestDispatcher("/product-single.jsp").forward(request, response);

    }
}
