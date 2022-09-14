package server;

import java.util.Arrays;
import java.util.Collections;

public class Methods {
    //Michelle Carolina Isabel Corcino Jiménez 4B
    public String ascendentes(int n1, int n2, int n3, int n4, int n5){
        int [] numeros = {n1,n2,n3,n4,n5};
        Arrays.sort(numeros);
           n1 = numeros[0];
           n2 = numeros[1];
            n3 = numeros[2];
            n4 = numeros[3];
            n5 = numeros[4];
        return "lista ordenada: \n"+n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n";

    }

    public double addition(double num1, double num2){
        return (num1+num2);
    }

    public String IMC(String name, double height, double weight){
        double imc = weight/(height*height);

        return "Nombre: " +name + "\n" +"Tu IMC es: " + imc;
    }

    public String products(double product1, double product2,double product3,double product4){
        double sum= 0;
        double producto=0;
        sum = product1 +product2+product3+product4;
        producto = product1 *product2*product3*product4;
        double prom = sum/4;

        return "Hola, el producto es: "+ producto+"\n"+"La suma de los productos es: "+sum+"\n"+
                "Y el promedio es: "+prom;
    }

    public String consecutives(int number1, int number2){
        int sum=0;
        int numeronuevo = number1;
        for (int i=number1;i<number2;i++){
            number1 = number1 + 1;
            sum = sum + number1;
        }
        sum = sum + numeronuevo;
        return "La suma es: "+sum;
    }

}
