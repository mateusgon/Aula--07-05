package br.ufjf.dcc192;

import br.ufjf.dcc192.IndexCommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/index.html", "/tarefas.html", "/tarefa.html"})
public class TarefasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map <String, String> rotas = new HashMap<>();
        rotas.put("/index.html", "br.ufjf.dcc192.IndexCommand");
        rotas.put("/tarefas.html", "br.ufjf.dcc192.TarefasListCommand");
        
        String className = rotas.get(request.getServletPath());
        
        try {
            try {
                Comando comando = (Comando) Class.forName(className).newInstance();
                comando.exec(request, response);
            } catch (InstantiationException ex) {
                Logger.getLogger(TarefasServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(TarefasServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TarefasServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
