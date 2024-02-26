package banco;

public class CtaCorriente {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldoCuenta
     */
    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    /**
     * @param saldoCuenta the saldoCuenta to set
     */
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    private String nombre;
    private String cuenta;
    private double saldoCuenta;
    private double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldoCuenta = saldo;
        this.interes = interes;
    }
    public double estado()
    {
        return getSaldoCuenta();
    }

    public void ingresar(double cantidad) throws IllegalArgumentException {
    if (cantidad < 0) {
        throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
    }
    setSaldoCuenta(getSaldoCuenta() + cantidad);
}


    
    public void retirar(double cantidad) throws IllegalArgumentException {
    if (cantidad <= 0) {
        throw new IllegalArgumentException("No se puede retirar una cantidad negativa o cero.");
    }
    if (getSaldoCuenta() < cantidad) {
        throw new IllegalArgumentException("No hay suficiente saldo.");
    }
    setSaldoCuenta(getSaldoCuenta() - cantidad);
}
}