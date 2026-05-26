package edu.dosw.lab.Reto4;

/**
 * Representa a un cliente.
 * Esta clase almacena la información personal del cliente y cuenta.
 */
public class Cliente {

    private String nombre;
    private int cuentaId;
    private String id;

    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor para crear un cliente con todos sus datos.
     * @param nombre El nombre completo del cliente.
     * @param cuentaId El ID de la cuenta bancaria asociada.
     * @param id El identificador único del cliente.
     */
    public Cliente(String nombre, int cuentaId, String id) {
        this.nombre = nombre;
        this.cuentaId = cuentaId;
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID de la cuenta bancaria.
     * @return El ID de la cuenta.
     */
    public int getCuentaId() {
        return cuentaId;
    }

    /**
     * Establece el ID de la cuenta bancaria.
     * @param cuentaId El nuevo ID de la cuenta.
     */
    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    /**
     * Obtiene el identificador único.
     * @return El ID del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único.
     * @param id El nuevo ID del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el ID de la cuenta bancaria
     * @return El ID de la cuenta.
     */
    public int obtenerCuenta() {
        return cuentaId;
    }

    /**
     * Asigna un nuevo ID de cuenta bancaria
     * @param nuevaCuentaId El nuevo ID de cuenta.
     */
    public void agregarCuenta(int nuevaCuentaId) {
        this.cuentaId = nuevaCuentaId;
    }
}
