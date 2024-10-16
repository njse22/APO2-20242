package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);

            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg = in.readLine();

                System.out.println("RESPUESTA DEL CLIENTE:" + socket.getInetAddress() + ":" + socket.getPort());
                System.out.println(msg);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
