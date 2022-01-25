import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {
    Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    // Paciente consultado

    @Test
    public void naoDeveConsultarPacienteConsultado() {
        paciente.setEstado(PacienteEstadoConsultado.getInstance());
        assertEquals("Consulta não realizada", paciente.consultar());
    }

    @Test
    public void deveInternarPacienteConsultado() {
        paciente.setEstado(PacienteEstadoConsultado.getInstance());
        assertEquals("Internação realizada", paciente.internar());
    }

    @Test
    public void deveDispensarPacienteConsultado() {
        paciente.setEstado(PacienteEstadoConsultado.getInstance());
        assertEquals("Paciente dispensado", paciente.dispensar());
    }

    @Test
    public void deveTransferirPacienteConsultado() {
        paciente.setEstado(PacienteEstadoConsultado.getInstance());
        assertEquals("Transferência realizada", paciente.transferir());
    }

    @Test
    public void naoDeveTransferirNecroterioPacienteConsultado() {
        paciente.setEstado(PacienteEstadoConsultado.getInstance());
        assertEquals("Paciente não está morto", paciente.transferirNecroterio());
    }

    // Paciente transferico

    @Test
    public void naoDeveConsultarPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertEquals("Consulta não realizada", paciente.consultar());
    }

    @Test
    public void naoDeveInternarPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertEquals("Internação não realizada", paciente.internar());
    }

    @Test
    public void naoDeveTransferirPacienteNecroterio() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertEquals("Paciente não está morto", paciente.transferirNecroterio());
    }

    @Test
    public void naoDeveDispensarPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertEquals("Dispensa não realizada", paciente.dispensar());
    }

    @Test
    public void naoDeveTransferirPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertEquals("Transferência não realizada", paciente.transferir());
    }

    // Paciente dispensado

    @Test
    public void naoDeveConsultarPacienteDispensado() {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        assertEquals("Consulta não realizada", paciente.consultar());
    }

    @Test
    public void naoDeveInternarPacienteDispensado() {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        assertEquals("Internação não realizada", paciente.internar());
    }

    @Test
    public void naoDeveTransferirNecroterioPacienteDispensado() {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        assertEquals("Paciente não está morto", paciente.transferirNecroterio());
    }

    @Test
    public void naoDeveDispensarPacienteDispensado() {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        assertEquals("Dispensa não realizada", paciente.dispensar());
    }

    @Test
    public void naoDeveTransferirPacienteDispensado() {
        paciente.setEstado(PacienteEstadoDispensado.getInstance());
        assertEquals("Paciente já foi dispensado", paciente.transferir());
    }

    // Paciente internado

    @Test
    public void naoDeveConsultarPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertEquals("Consulta não realizada", paciente.consultar());
    }

    @Test
    public void naoDeveInternadoPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertEquals("Internação não realizada", paciente.internar());
    }

    @Test
    public void deveTransferirNecroterioPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertEquals("Corpo do paciente transferido", paciente.transferirNecroterio());
    }

    @Test
    public void deveDispensarPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertEquals("Paciente dispensado", paciente.dispensar());
    }

    @Test
    public void deveTransferirPacienteInternado() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertEquals("Transferência realizada", paciente.transferir());
    }


}