package pe.edu.cibertec.evaluaciones.guiada03Cajero.entity;

public class Cuenta {
    private String numeroCuenta;
    private String claveAcceso;
    private Double saldo;

    public Cuenta(String numeroCuenta, String claveAcceso, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.claveAcceso = claveAcceso;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuenta{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", claveAcceso='").append(claveAcceso).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
