public class PacienteEstadoMorto implements PacienteEstado{

    private PacienteEstadoMorto() {};
    private static PacienteEstadoMorto instance = new PacienteEstadoMorto();
    public static PacienteEstadoMorto getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Paciente morto";
    }

    @Override
    public String consultar(Paciente paciente) {
        return "Consulta não realizada";
    }

    @Override
    public String internar(Paciente paciente) {
        return "Internação não realizada";
    }

    @Override
    public String transferirNecroterio(Paciente paciente) {
        return "Transferência para necrotério não realizada";
    }

    @Override
    public String dispensar(Paciente paciente) {
        return "Paciente faleceu";
    }

    @Override
    public String transferir(Paciente paciente) {
        return "Paciente faleceu";
    }
}
