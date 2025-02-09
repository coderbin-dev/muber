package dev.coderbin;

import io.muserver.MuServer;
import io.muserver.handlers.ResourceHandlerBuilder;

import static io.muserver.MuServerBuilder.muServer;

public class Main {
    public static void main(String[] args) {

        MuServer server = muServer()
                .withHttpPort(8080)
                .addHandler(ResourceHandlerBuilder.fileOrClasspath("src/main/resources/web", "/web"))
                .start();

        System.out.println("Started at " + server.uri());

    }
}