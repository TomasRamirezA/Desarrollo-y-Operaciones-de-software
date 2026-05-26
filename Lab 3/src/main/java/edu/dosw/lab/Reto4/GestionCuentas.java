package edu.dosw.lab.Reto4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar las cuentas bancarias.
 * Proporciona métodos para crear, buscar y realizar operaciones en las cuentas.
 */
public class GestionCuentas {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    /**
     * Crea una nueva cuenta bancaria con un número y un nombre de cliente.
     * @param numeroCuenta El número único de la nueva cuenta.
     * @param nombreCliente El nombre del cliente asociado a la cuenta.
     * @return El objeto CuentaBancaria recién creado.
     */
    public CuentaBancaria crearCuenta(String numeroCuenta, String nombreCliente) {
        Cliente cliente = new Cliente(nombreCliente, cuentas.size() + 1, "ID" + (cuentas.size() + 1));
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, cliente);
        cuentas.add(cuenta);
        return cuenta;
    }
    /**
     * Deposita una cantidad de dinero en la cuenta
     * @param cuenta La cuenta bancaria donde se realizará el depósito.
     * @param monto El monto a depositar.
     */
    public void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }
    /**
     * Consulta el saldo actual de una cuenta.
     * @param cuenta La cuenta bancaria de la que se desea consultar el saldo.
     * @return El saldo actual de la cuenta.
     */
    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldo();
    }
    /**
     * Busca una cuenta bancaria por su número de cuenta.
     * @param numeroCuenta El número de la cuenta a buscar.
     * @return La cuenta bancaria si se encuentra.
     * @throws IllegalArgumentException si la cuenta no se encuentra.
     */
    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        return cuentas.stream()
                .filter(c -> c.getNumeroCuenta().equals(numeroCuenta))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Cuenta no encontrada"));
    }
}
