
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/teste.html", "/teste2.html"})
public class TesteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = "Fulano";
        String titulo = "Titulo";
        Integer idade = 10;
        req.setAttribute("titulo", titulo);
        req.setAttribute("nome", nome);
        req.setAttribute("idade", idade);
        
        String jsp = "";
        if ("/teste2.html".equals(req.getServletPath()))
        {
            List<Integer> numeros = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 10; i++)
            {
                numeros.add(r.nextInt(100)+1);
            }
            req.setAttribute("numeros", numeros);
        }
            
        if (nome==null || nome.isEmpty())
        {
            nome = "Desconhecido";
        }
        RequestDispatcher despachante =  req.getRequestDispatcher("/WEB-INF/teste.jsp");
            despachante.forward(req, resp);
            
    }

    
}
