package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;
//Michelle Carolina Isabel Corcino Jiménez 4B
public class RPCServer {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("iniciando servidor...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("Methods",Methods.class);
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Esperando peticiones...");
    }
}
