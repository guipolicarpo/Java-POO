//Guilherme Policarpo de Carvalho

public class Cabeleireira extends Prestador{
    
    public Cabeleireira(String nome, String endereco, String horainicio, String horafim, String contato){
        super("Wanda Cabeleireira", "Avenida Basf 1234 - Guaratinguetá", "08:00", "18:00" , "(12) 99787-8998");
    }

    public Cabeleireira() {
        super("Wanda Cabeleireira", "Avenida Basf 1234 - Guaratinguetá", "08:00", "18:00" , "(12) 99787-8998");
    }

    public String Agendado(){
        return "Horario agendado com Wanda Cabeleireira";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
