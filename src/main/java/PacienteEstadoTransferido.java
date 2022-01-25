public class PacienteEstadoTransferido implements PacienteEstado{

    private PacienteEstadoTransferido() {};
    private static PacienteEstadoTransferido instance = new PacienteEstadoTransferido();
    public static PacienteEstadoTransferido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Transferido";
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
        return "Paciente não está morto";
    }

    @Override
    public String dispensar(Paciente paciente) {
        return "Dispensa não realizada";
    }

    @Override
    public String transferir(Paciente paciente) {
        return "Transferência não realizada";
    }
}
