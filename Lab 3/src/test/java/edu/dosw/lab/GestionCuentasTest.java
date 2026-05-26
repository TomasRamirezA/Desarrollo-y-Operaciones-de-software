
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.dosw.lab.Reto4.GestionCuentas;
import edu.dosw.lab.Reto4.CuentaBancaria;
import edu.dosw.lab.Reto4.ValidadorCuenta;
import edu.dosw.lab.Reto4.Cliente;

class GestionCuentasTest {

    @Test
    void testCrearCuenta() {
        GestionCuentas gestion = new GestionCuentas();
        CuentaBancaria cuenta = gestion.crearCuenta("01001", "Juan");
        assertNotNull(cuenta);
        assertEquals("Juan", cuenta.getUsuario().getNombre());
    }

    @Test
    void testDepositar() {
        GestionCuentas gestion = new GestionCuentas();
        CuentaBancaria cuenta = gestion.crearCuenta("01002", "Ana");
        gestion.depositar(cuenta, 100.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    void testConsultarSaldo() {
        GestionCuentas gestion = new GestionCuentas();
        CuentaBancaria cuenta = gestion.crearCuenta("02001", "Luis");
        gestion.depositar(cuenta, 200.0);
        assertEquals(200.0, gestion.consultarSaldo(cuenta));
    }
    @Test
    void testSaldoInicialEsCero() {
        GestionCuentas gestion = new GestionCuentas();
        CuentaBancaria cuenta = gestion.crearCuenta("0101", "Alice");
        assertEquals(0.0, gestion.consultarSaldo(cuenta));
    }

    @Test
    void testDepositoSeAcumula() {
        GestionCuentas gestion = new GestionCuentas();
        CuentaBancaria cuenta = gestion.crearCuenta("0101", "Alice");
        gestion.depositar(cuenta, 100);
        gestion.depositar(cuenta, 50);
        assertEquals(150.0, gestion.consultarSaldo(cuenta));
    }
}
