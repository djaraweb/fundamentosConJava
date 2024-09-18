package com.v17.lecturaExcel.modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Colores")
public class Color {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("ES PRIMARIO")
    private boolean primario;
    @ExcelCellName("HEXADECIMAL")
    private String hexadecimal;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    esprimario: %b
                    hexadecimal: %s
                }
                """;
        return String.format(multilinea, nombre, primario, hexadecimal);
    }
}
