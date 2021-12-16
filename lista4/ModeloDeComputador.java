// Guilherme Policarpo de Carvalho

public class ModeloDeComputador {
    double placamae;
    double processador;
    double memoria;
    double disco;
    double monitor;
    double calculo;

    public ModeloDeComputador () {
        placamae = 800;
        processador = 0;
        memoria = 0;
        disco = 0;
        monitor = 0;
        calculo = 0;
    }

    public void setProcessador( double processador){
        if (processador > 0) {
            this.processador = processador;
        }      
    }

    public void setMemoria( double memoria){
        if (memoria > 0) {
            this.memoria = memoria;
        }
    }

    public void setDisco( double disco){
        if (disco > 0) {
            this.disco = disco;
        }
    }

    public void setMonitor( double monitor){
        if (monitor > 0) {
            this.monitor = monitor;
        }
    }

    public double calcularPreco() {
        return calculo = placamae + processador + memoria + disco + monitor;
    }
}
