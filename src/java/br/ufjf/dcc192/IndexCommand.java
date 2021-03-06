package br.ufjf.dcc192;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand implements Comando{
    @Override
        public void exec (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/index.jsp");
            request.setAttribute("titulo", "Página Inicial");
            despachante.forward(request, response);
        }
    }