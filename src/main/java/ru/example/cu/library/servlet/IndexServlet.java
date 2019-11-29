package ru.example.cu.library.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexServlet extends HttpServlet {
    private static final String page = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title>Моя страница на localhost</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h1>Все что угодно</h1>\n" +
            "\t<p>\n" +
            "\t\t<a href=\"/page1\">Список ...</a>\n" +
            "\t</p>\n" +
            "</body>\n" +
            "</html>";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter printWriter = response.getWriter();
        printWriter.print(page);
        printWriter.flush();
    }
}