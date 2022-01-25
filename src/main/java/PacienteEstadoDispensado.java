public class PacienteEstadoDispensado implements PacienteEstado{

    private PacienteEstadoDispensado() {};
    private static PacienteEstadoDispensado instance = new PacienteEstadoDispensado();
    public static PacienteEstadoDispensado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Dispensado";
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
        return "Paciente já foi dispensado";
    }
}
