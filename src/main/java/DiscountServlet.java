import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("Description");
        double price = Double.parseDouble(request.getParameter("Price"));
        double discount = Double.parseDouble(request.getParameter("Discount"));
        double amount = price * discount * 0.1;
        double discount_price = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Product Discount Calculator</h1>" + "<br>");
        writer.println("Product Description:" + description + "<br>");
        writer.println("Price:" + "$" + price + "<br>");
        writer.println("Discount Percent:" + discount + "%" + "<br>");
        writer.println("Discount Amount:" + "$" + amount + "<br>");
        writer.println("Discount Price:" + "$" + discount_price + "<br>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
