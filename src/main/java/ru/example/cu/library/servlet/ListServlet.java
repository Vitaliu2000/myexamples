package ru.example.cu.library.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListServlet extends HttpServlet {
    private static final String page = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title>Вложенная страница</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\t<h1>Напиши что хочешь</h1>\n" +
            "\t<p>\n" +
            "\t\tИнфа после перехода по ссылке\n" +
            "\t</p>\n" +
            "\t\t<a href=\"/\">Назад</a>\n" +
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