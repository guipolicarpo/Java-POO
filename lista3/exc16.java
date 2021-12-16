/*
Guilherme Policarpo de Carvalho
 */
import java.util.Scanner;
public class exc16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int esc;
        double temp, fah, cel, kel;

        do{
            System.out.printf("\nQual temperatura de entrada?");
            System.out.printf("\n[1] - Celsius, [2] - Fahrenheit, [3] Kelvin e [4] Sair : ");
            esc = ler.nextInt(); 

            System.out.printf("\nQual a temperatura: ");
            temp = ler.nextFloat();

            if(esc == 1){
                System.out.println("A temperatura em Kelvin e: " + getKelvinByC(temp));
                System.out.println("A temperatura em Fahrenheit e: " + getFahrenheitByC(temp));
            }

            if(esc == 2){
                
                System.out.println("A temperatura em Kelvin e: " + getKelvinByF(temp));
                System.out.println("A temperatura em Celsius e: " + getCelsiusByF(temp));
            }

            if(esc == 3){
                System.out.println("A temperatura em Fahrenheit e: " + getFahrenheitByK(temp));
                System.out.println("A temperatura em Celsius e: " + getCelsiusByK(temp));
            }

            if(esc == 4){
                System.out.println("Fim");
            }


        }while(esc != 4);
    }

    // Celsius

    public static double getFahrenheitByC (double temp){   
        return (9*temp/5)+32;          
    }

    public static double getKelvinByC (double temp){
        return temp + 273;
    }

    // Fahrenheit

    public static double getCelsiusByF (double temp){
        return 5*(temp - 32)/9;
    }

    public static double getKelvinByF (double temp){
        return 273.15+(temp-32)/1.8000;
    }

    // Kelvin

    public static double getCelsiusByK (double temp){
        return temp - 273.15;
    }

    public static double getFahrenheitByK (double temp){
        return 1.8 * (temp - 273) + 32;
    }
    


}
