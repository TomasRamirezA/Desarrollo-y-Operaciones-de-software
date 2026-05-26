package edu.dosw.lab.Reto4;


/**
 * Clase que se encarga de validar la existencia de cuentas en el sistema.
 * Utiliza la clase GestionCuentas para realizar la verificación.
 */
public class ValidadorCuenta {

    private final GestionCuentas gestion;


    /**
     * Constructor para crear un nuevo validador de cuentas.
     * @param gestion La instancia de GestionCuentas para consultar las cuentas en el sistema.
     */
    public ValidadorCuenta(GestionCuentas gestion) {
        this.gestion = gestion;
    }

    /**
     * Método que valida si una cuenta existe en el sistema.
     * @param cuenta El identificador de la cuenta a validar.
     * @return true si la cuenta existe, false si no existe.
     */
    public boolean validarExistencia(String cuenta) {
        try {
            gestion.buscarCuenta(cuenta);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
