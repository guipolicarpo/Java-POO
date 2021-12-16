//Guilherme Policarpo de Carvalho

public class Prestador {
    protected String nome;
    protected String endereco;
    protected String horainicio;
    protected String horafim;
    protected String contato;

    public Prestador(String nome, String endereco, String horainicio, String horafim, String contato){
        setNome(nome);
        setEndereco(endereco);
        setHoraInicio(horainicio);
        setHoraFim(horafim);
        setContato(contato);
    }

    public Prestador(){
        super();
        setNome(nome);
        setEndereco(endereco);
        setHoraInicio(horainicio);
        setHoraFim(horafim);
        setContato(contato);
    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public void setEndereco( String endereco){
        this.endereco = endereco;
    }

    public void setHoraInicio( String horainicio){
        this.horainicio = horainicio;
    }

    public void setHoraFim( String horafim){
        this.horafim = horafim;
    }

    public void setContato( String contato){
        this.contato = contato;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getHoraInicio(){
        return horainicio;
    }

    public String getHoraFim(){
        return horafim;
    }

    public String getContato(){
        return contato;
    }

    public String Agendado(){
        return "";
    }

    @Override
    public String toString(){
        return "[Nome: " + nome + ", Endereco: " + endereco + ", Abre: " + horainicio + ", Fecha: " + horafim + ", Contato: " + contato + "]";
    }
}
