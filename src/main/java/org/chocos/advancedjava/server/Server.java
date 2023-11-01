package org.chocos.advancedjava.server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket  socket;
    private ServerSocket serverSocket;
    private DataInputStream in;

    public Server(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server Started on port " + port);
            System.out.println("Waiting for client......");
            socket = serverSocket.accept();
            System.out.println("ChildMain Accepted");
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equalsIgnoreCase("over")) {
                line = in.readUTF();
                System.out.println(line);
            }
            System.out.println("Closing Connection");
            in.close();
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public Server setSocket(Socket socket) {
        this.socket = socket;
        return this;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public Server setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        return this;
    }

    public DataInputStream getIn() {
        return in;
    }

    public Server setIn(DataInputStream in) {
        this.in = in;
        return this;
    }
}
