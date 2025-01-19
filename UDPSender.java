import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPSender{
    public static void main(String[] args)
    {
        try{
            DatagramSocket s = new DatagramSocket();
            String msg = "Hello, UDP Server!";
            byte[] sendData = msg.getBytes();
            InetAddress IPAddress = InetAddress.getByName("localhost");
            int port = 9876;
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            s.send(sendPacket);
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
