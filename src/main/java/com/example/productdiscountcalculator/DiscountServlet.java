package com.example.productdiscountcalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/123")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String nameProduct = request.getParameter("txtInput");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));

        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("Name product (Tên sản phẩm): " + nameProduct);
        writer.println("<br>");
        writer.println("Discount Amount (Lượng chiết khấu) :" + discountAmount);
        writer.println("<br>");
        writer.println("Discount Price (Giá sau khi đã được chiết khấu): " + discountPrice);

        writer.println("</html>");

    }
}
