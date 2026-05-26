package edu.dosw.lab.Reto4;

import java.time.LocalDate;
import java.util.Locale;

/**
 * Modela una transacción bancaria.
 * Contiene información sobre el tipo de operación, monto, fecha y la cuenta asociada.
 */
public class Transaccion {

    private int id;
    private LocalDate fecha;
    private int tipo;
    private double monto;
    private CuentaBancaria cuenta;

    /**
     * Constructor para crear una nueva transacción.
     * @param id El identificador único de la transacción.
     * @param fecha La fecha en que se realizó la transacción.
     * @param tipo El tipo de transacción (1 para depósito, 2 para retiro).
     * @param monto El monto de la transacción.
     * @param cuenta La cuenta bancaria sobre la que se realiza la transacción.
     */
    public Transaccion(int id, LocalDate fecha, int tipo, double monto, CuentaBancaria cuenta) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el ID de la transacción.
     * @return El ID de la transacción.
     */
    public int getId() {
        return id;
    }
    /**
     * Obtiene la fecha de la transacción.
     * @return La fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene el tipo de transacción.
     * @return El tipo de transacción 1 para depósito, 2 para retiro.
     */
    public int getTipo() {
        return tipo;
    }
    /**
     * Obtiene el monto de la transacción.
     * @return El monto.
     */
    public double getMonto() {
        return monto;
    }
    /**
     * Obtiene la cuenta asociada a la transacción.
     * @return La cuenta bancaria.
     */
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    /**
     * Asigna el identificador único de la transacción.
     * @param id El nuevo identificador.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Asigna la fecha de la transacción.
     * @param fecha La nueva fecha.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Asigna el tipo de transacción.
     * @param tipo El tipo (1 para depósito, 2 para retiro).
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    /**
     * Asigna el monto de la transacción.
     * @param monto El nuevo monto.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    /**
     * Asigna la cuenta bancaria sobre la que se realiza la transacción.
     * @param cuenta La cuenta asociada.
     */
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Realiza un depósito en la cuenta bancaria asociada.
     * Suma el monto al saldo actual de la cuenta.
     */
    public void deposito() {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }
    /**
     * Realiza un retiro de la cuenta bancaria asociada.
     * Resta el monto al saldo actual de la cuenta.
     * @throws IllegalArgumentException si el monto es mayor al saldo.
     */
    public void retiro() {
        if (monto > cuenta.getSaldo()) throw new IllegalArgumentException("Saldo insuficiente.");
        cuenta.setSaldo(cuenta.getSaldo() - monto);
    }
    /**
     * Genera una cadena con los detalles de la transacción.
     * Incluye id, tipo depósito o retiro, monto, fecha y número de cuenta.
     * @return Una cadena con la información de la transacción.
     */
    public String detalles() {
        String tipoStr = (tipo == 1) ? "Depósito" : "Retiro";
        return String.format(Locale.US, "Transacción #%d - %s - Monto: %.2f - Fecha: %s - Cuenta: %s",
                id, tipoStr, monto, fecha, cuenta.getNumeroCuenta());
    }
}
