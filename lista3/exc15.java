/*
Guilherme Policarpo de Carvalho
 */
import java.util.Scanner;

public class exc15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int esc;
        float temp;

        System.out.printf("Deseja converter para qual temperatura?");
        System.out.printf("\n[1] - Celsius, [2] - Fahrenheit e [3] Sair : ");
        esc = ler.nextInt();

        switch (esc) {
            case 1:
                System.out.printf("\nQual a temperatura em Celsius?: ");
                temp = ler.nextFloat();
                System.out.println("A temperatura em Celsius e: " + getCelsius(temp));
                break;

            case 2:
                System.out.printf("\nQual a temperatura em Fahrenheit?: ");
                temp = ler.nextFloat();
                System.out.println("A temperatura em Fahrenheit e: " + getFahrenheit(temp));
                break;

            case 3:
                break;
        
            default:
                System.out.println("Opcao Invalida!");
                break;
        }
    }

    public static float getFahrenheit (float temp){
        return temp = (9*temp/5)+32;
    }

    public static float getCelsius (float temp){
        return temp = 5*(temp - 32)/9;
    }
}
