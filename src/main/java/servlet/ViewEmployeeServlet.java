import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.EmployeeDAO;
import model.Employee;
import java.util.List;

@WebServlet("/viewEmployees")
public class ViewEmployeeServlet extends HttpServlet {
    private EmployeeDAO dao = new EmployeeDAO();

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") == null) {
            res.sendRedirect("index.jsp");
            return;
        }

        List<Employee> employees = dao.getAllEmployees();
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("dashboard.jsp").forward(req, res);
    }
}
