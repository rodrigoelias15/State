public class PacienteEstadoConsultado implements PacienteEstado{

    private PacienteEstadoConsultado() {};
    private static PacienteEstadoConsultado instance = new PacienteEstadoConsultado();
    public static PacienteEstadoConsultado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Consultado";
    }

    @Override
    public String consultar(Paciente paciente) {
        return "Consulta não realizada";
    }

    @Override
    public String internar(Paciente paciente) {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        return "Internação realizada";
    }

    @Override
    public String transferirNecroterio(Paciente paciente) {
        return "Paciente não está morto";
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
