// Guilherme Policarpo de Carvalho

public class Equacao {
    double a;
    double b;
    double c;
    double delta;

    public Equacao() {
        a = 0;
        b = 0;
        c = 0;
        delta = 0;
    }

    public void setA ( double a) {
        this.a = a;
    }

    public void setB ( double b) {
        this.b = b;
    }

    public void setC ( double c) {
        this.c = c;
    }

    public void Calculo(){
        this.delta = (b*b) - 4*a*c;
    }

    public double Delta(){
        return delta;
    }
}
