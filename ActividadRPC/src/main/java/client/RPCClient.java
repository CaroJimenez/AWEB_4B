package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import server.Methods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//Michelle Carolina Isabel Corcino Jiménez 3B DSM
public class RPCClient {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Operación a realizar: \n" +
                "0.-Suma de dos números\n" +
                "1.-Calcular IMC\n" +
                "2.-Lista de productos\n" +
                "3.-Sumar números consecutivos\n" +
                "4.-Ordenar números");
        int option = scan.nextInt();
        switch(option){
            case 0:
                Object[] numbers = {5.0,5D};
                Double response = (Double) client.execute("Methods.addition", numbers);
                System.out.println("Result ->"+ response);
                break;
            case 1:
                System.out.println("Escribe tu nombre: ");
                String name = scan.next();
                System.out.println("Escribe tu estatura en metros: ");
                double height = scan.nextDouble();
                System.out.println("Ingresa tu peso en kg: ");
                double weight = scan.nextDouble();
                Object[] data = {name,height,weight};
                String response1 = (String) client.execute("Methods.IMC", data);
                System.out.println(response1);
                break;
            case 2:
                int i;
                Object[] products = new Object[4];

                for(i=0; i<products.length; i++)
                {
                    System.out.printf("Introduzca el precio del producto #%d: ", i+1);
                    products[i] = scan.nextDouble();
                }

                String response2 = (String) client.execute("Methods.products", products);
                System.out.println(response2);
                break;
            case 3:
                System.out.println("Ingresa el primer número: ");
                int number1= scan.nextInt();
                System.out.println("Ingresa el segundo número: ");
                int number2= scan.nextInt();

                Object[] numeros = {number1,number2};
                String response3 = (String) client.execute("Methods.consecutives", numeros);
                System.out.println(response3);
                break;
            case 4:
                int x;
                Object[] ascendentes = new Object[5];

                for(x=0; x<ascendentes.length; x++)
                {
                    System.out.printf("Introduzca el numero #%d: ", x+1);
                    ascendentes[x] = scan.nextInt();
                }

                String response4 = (String) client.execute("Methods.ascendentes", ascendentes);
                System.out.println(response4);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }


    }
}
