package co.leal;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EtlExecutionTest {

    public String someLibraryMethod() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("host:" + addr.getHostName());
        System.out.println("ip:" + addr.getHostAddress());
        return "Correcta ejecucion de la libreria de prueba";
    }
}

