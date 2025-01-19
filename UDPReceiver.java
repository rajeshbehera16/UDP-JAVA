import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPReceiver{
    public static void main(String[] args)
    {
        try{
            DatagramSocket s = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            s.receive(receivePacket);
            String receivedMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received: " + receivedMsg);
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
