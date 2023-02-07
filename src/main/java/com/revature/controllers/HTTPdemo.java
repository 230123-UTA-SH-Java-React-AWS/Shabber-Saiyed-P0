package com.revature.controllers;

import com.sun.net.httpserver.HttpServer;

import controllers.Controller;

import java.net.InetSocketAddress;

public class HTTPdemo {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");
        //starting backend server to enable receiving and responding to requests
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/someUrl", new Controller());
        server.setExecutor(null);
        server.start();

    }
    
}
