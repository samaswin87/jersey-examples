package com.jersey.application;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Hello world!
 *
 */
public class Application
{
	public static void main(String [] args) throws IOException {
        HttpServer server = startServer();
        System.out.println("Server runnning...");
        System.in.read();
        server.shutdown();
    }

    static HttpServer startServer(){
        ResourceConfig config = new ResourceConfig().packages("com.jersey.application");
        URI uri = URI.create("http://localhost:8080/");
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
        return server;
    }
}
