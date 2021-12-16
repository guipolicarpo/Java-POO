//Guilherme Policarpo de Carvalho

public class exc13 {

    static int jogardado (int numero){
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        int numero = 0, n = 0;
        double um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0;

        for(int c = 1; c <= 1000000; c++){
            n = jogardado(numero);

            if(n == 1){
                um++;
            }

            if(n == 2){
                dois++;
            }

            if(n == 3){
                tres++;
            }

            if(n == 4){
                quatro++;
            }

            if(n == 5){
                cinco++;
            }

            if(n == 6){
                seis++;
            }
        }

        System.out.println("1: " + um + " - " + um / 10000 + "%%");
        System.out.println("2: " + dois + " - " + um / 10000 + "%%");
        System.out.println("3: " + tres + " - " + um / 10000 + "%%");
        System.out.println("4: " + quatro + " - " + um / 10000 + "%%");
        System.out.println("5: " + cinco + " - " + um / 10000 + "%%");
        System.out.println("6: " + seis + " - " + um / 10000 + "%%");
  
    }
}
