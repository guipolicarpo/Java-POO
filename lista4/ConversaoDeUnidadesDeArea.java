// Guilherme Policarpo de Carvalho

public class ConversaoDeUnidadesDeArea {
    double metro;
    double pe;
    double milha;
    double acre;

    public ConversaoDeUnidadesDeArea() {
        metro = 0;
        pe = 0;
        milha = 0;
        acre = 0;
    }

    public void setMetro(double metro){
        this.metro = metro;
    }

    public void setPe(double pe){
        this.pe = pe;
    }

    public void setMilha(double milha){
        this.milha = milha;
    }

    public void setAcre(double acre){
        this.acre = acre;
    }

    public String ConverteMetro(){
        return "[Pe: " + metro * 3.28084 + ", Milha: " + metro * 0.000621371 + ", Acre: " + metro * 0.000247105 + "]";
    }

    public String ConvertePe(){
        return "[Metro: " + pe * 0.3048 + ", Milha: " + pe * 0.000189394 + ", Acre: " + pe * 2.29568e-5 + "]";
    }

    public String ConverteMilha(){
        return "[Metro: " + milha * 1609.34 + ", Pe: " + milha * 5280 + ", Acre: " + milha * 640 + "]";
    }

    public String ConverteAcre(){
        return "[Metro: " + acre * 4046.86 + ", Pe: " + acre * 43560 + ", Milha: " + acre * 0.0015625 + "]";
    }
}
