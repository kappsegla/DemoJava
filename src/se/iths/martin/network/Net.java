package se.iths.martin.network;

import java.io.*;
import java.net.*;
public class Net {

    public static void main(String[] args) {

        Socket socket = new Socket();

        try {
            socket.connect(new InetSocketAddress("www.google.se",80));

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
            BufferedInputStream dataInputStream = new BufferedInputStream(inputStream);

            String request = "GET / HTTP/1.1\r\n" +
                    "Host: www.google.se\r\n\r\n";

            dataOutputStream.write(request.getBytes());
            dataOutputStream.flush();


            //If you handle larger data use a bigger buffer size
            byte[] buffer = new byte[1024];
            int read;
            while((read = dataInputStream.read(buffer)) != -1) {
                String s = new String(buffer);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
