public class PacienteEstadoInternado implements PacienteEstado{

    private PacienteEstadoInternado() {};
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();
    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Internado";
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
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        return "Corpo do paciente transferido";
    }

    @Override
    public String dispensar(Paciente paciente) {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        return "Paciente dispensado";
    }

    @Override
    public String transferir(Paciente paciente) {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        return "Transferência realizada";
    }
}
