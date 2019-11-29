package ru.example.cu.library;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import ru.example.cu.library.servlet.IndexServlet;
import ru.example.cu.library.servlet.ListServlet;

public class StarterWeb {
    private final static int PORT = 8088;

    public static void main(String[] args) throws Exception {

        new StarterWeb().start();
    }

    private void start() throws Exception {
        Server server = createServer( PORT );
        server.start();
        server.join();
    }

    private Server createServer( int port ) {
        ServletContextHandler context = new ServletContextHandler( ServletContextHandler.SESSIONS );
        context.addServlet( new ServletHolder( new IndexServlet() ), "/" );
        context.addServlet( new ServletHolder( new ListServlet() ), "/page1" );

        Server server = new Server( port );
        server.setHandler( new HandlerList( context ) );
        return server;
    }
}