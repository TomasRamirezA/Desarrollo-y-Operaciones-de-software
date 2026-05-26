import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.dosw.lab.Reto4.GestionCuentas;
import edu.dosw.lab.Reto4.CuentaBancaria;
import edu.dosw.lab.Reto4.ValidadorCuenta;
import edu.dosw.lab.Reto4.Cliente;


class ValidadorCuentaTest {

    @Test
    void testValidarExistenciaCuentaValida() {
        GestionCuentas gestion = new GestionCuentas();
        gestion.crearCuenta("12345", "Pedro");

        ValidadorCuenta validador = new ValidadorCuenta(gestion);
        assertTrue(validador.validarExistencia("12345"));
    }
    @Test
    void testValidarExistenciaCuentaInvalida() {
        GestionCuentas gestion = new GestionCuentas();

        ValidadorCuenta validador = new ValidadorCuenta(gestion);
        assertFalse(validador.validarExistencia("99999"));
    }
    @Test
    void testCuentaVacia() {
        GestionCuentas gestion = new GestionCuentas();
        ValidadorCuenta validador = new ValidadorCuenta(gestion);
        assertFalse(validador.validarExistencia(""));
    }
    @Test
    void testCuentaConLetras() {
        ValidadorCuenta validador = new ValidadorCuenta(new GestionCuentas());
        assertFalse(validador.validarExistencia("01ABC123"));
    }
}