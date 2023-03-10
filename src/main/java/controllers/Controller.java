package controllers;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Controller implements HttpHandler{

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        
        String someResponse = "Hello world I just sent a response using string!";

        // Create a response
        exchange.sendResponseHeaders(200,someResponse.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(someResponse.getBytes());
        os.close();
        
    }
    
}
