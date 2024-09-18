package pe.edu.cibertec.evaluaciones.guiada02Collections;

public class Gasto implements Comparable {
    private String nombreGasto;
    private Double importeGasto;

    public String getNombreGasto() {
        return nombreGasto;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public Double getImporteGasto() {
        return importeGasto;
    }

    public void setImporteGasto(Double importeGasto) {
        this.importeGasto = importeGasto;
    }

    public Gasto() {

    }

    public Gasto(String nombreGasto, Double importeGasto) {
        this.nombreGasto = nombreGasto;
        this.importeGasto = importeGasto;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gasto{");
        sb.append("nombreGasto='").append(nombreGasto).append('\'');
        sb.append(", importeGasto=").append(importeGasto);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Double monto = ((Gasto) o).getImporteGasto();
        return this.importeGasto.compareTo(monto);
    }
}
