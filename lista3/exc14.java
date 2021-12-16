/*
Guilherme Policarpo de Carvalho
 */
import java.util.Scanner;
public class exc14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float cel;

        System.out.printf("Digite uma temperatura em Celsius: ");
        cel = ler.nextFloat();

        System.out.println("A temperatura em Fahrenheit e: " + getFahrenheit(cel));
       

    }

    public static float getFahrenheit (float cel){
        return cel = (9*cel/5)+32;
    }
    
}