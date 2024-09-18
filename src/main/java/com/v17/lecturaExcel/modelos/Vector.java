package com.v17.lecturaExcel.modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Vectores")
public class Vector {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("X")
    private double x;
    @ExcelCellName("Y")
    private double y;

    public String getNombre() {
        return nombre;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    X: %.2f
                    Y: %.2f
                }
                """;
        return String.format(multilinea, nombre, x, y);
    }

}
