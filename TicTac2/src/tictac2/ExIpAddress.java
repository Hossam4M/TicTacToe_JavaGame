
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Enumeration;

public class ExIpAddress {

        public static void main(String args[]) throws SocketException, MalformedURLException, IOException {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            URLConnection connection = whatismyip.openConnection();
            connection.addRequestProperty("Protocol", "Http/1.1");
            connection.addRequestProperty("Connection", "keep-alive");
            connection.addRequestProperty("Keep-Alive", "1000");
            connection.addRequestProperty("User-Agent", "Web-Agent");

            BufferedReader in = 
                new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String ip = in.readLine(); //you get the IP as a String
            System.out.println(ip);
//            Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
//            for (NetworkInterface netint : Collections.list(nets))
//                displayInterfaceInformation(netint);
        }

        static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
            Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                out.printf("InetAddress: %s\n", inetAddress);
            }
            out.printf("\n");
        }
    } 
