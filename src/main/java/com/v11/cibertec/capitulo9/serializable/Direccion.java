package com.v11.cibertec.capitulo9.serializable;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String distrito;
    private String calle;

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Direccion(String distrito, String calle) {
        this.distrito = distrito;
        this.calle = calle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Direccion{");
        sb.append("distrito='").append(distrito).append('\'');
        sb.append(", calle='").append(calle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
