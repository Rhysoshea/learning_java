import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class App {
    public static void main(String[] args) throws Exception {

        // uses datagrams, a self contained message which isn't guaranteed to reach the other end
        // speed is more important here, not arrival of the packets
        // overhead involved with TCP is more significant than UDP due to handshaking etc
        // not demonstrating use of threads here, that is demonstrated in the FirstClientServer project

        try {
            DatagramSocket socket = new DatagramSocket(5000);

            while(true) {
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                System.out.println("Text received is: " + new String(buffer, 0, packet.getLength()));
                // this will only show parts of packet that are used and not dump the whole null packet to sysout


                //  normally wouldn't expect a response with UDP, setting it up here for demo
                String returnString = "echo: " + new String(buffer,0,packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer2, buffer2.length, address, port);
                socket.send(packet);
            }

        } catch(SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

    }
}
