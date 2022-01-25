public class Paciente {

    private String nome;

    private PacienteEstado estado;

    public Paciente() {
        this.estado = PacienteEstadoConsultado.getInstance();
    }

    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
    }

    String consultar(Paciente paciente){
        return estado.consultar(this);
    };

    String internar(){
        return estado.internar(this);
    };

    String transferirNecroterio(){
        return estado.transferirNecroterio(this);
    };

    String receberAlta(){
        return estado.dispensar(this);
    };

    String transferir(){
        return estado.transferir(this);
    };

    public PacienteEstado getEstado() {
        return estado;
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }

}
