package edu.dosw.lab.Reto4;

/**
 * Representa una cuenta bancaria individual.
 * Contiene el número de cuenta, el saldo y el cliente asociado.
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente usuario;

    /**
     * Constructor para crear una nueva cuenta.
     * @param numeroCuenta El número de cuenta único.
     * @param usuario El cliente asociado a esta cuenta.
     */
    public CuentaBancaria(String numeroCuenta, Cliente usuario) {
        this.numeroCuenta = numeroCuenta;
        this.usuario = usuario;
        this.saldo = 0.0;
    }
    /**
     * Obtiene el número de cuenta.
     * @return El número
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Establece el número de cuenta.
     * @param numeroCuenta El nuevo
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo de la cuenta.
     * @param saldo El nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Obtiene el cliente asociado
     * @return El objeto Cliente.
     */
    public Cliente getUsuario() {
        return usuario;
    }
    /**
     * Establece el cliente asociado a la cuenta.
     * @param usuario El nuevo
     */
    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
}
