public interface PacienteEstado {
    
    String getEstado();

    String consultar(Paciente paciente);

    String internar(Paciente paciente);

    String transferirNecroterio(Paciente paciente);

    String dispensar(Paciente paciente);

    String transferir(Paciente paciente);
}
