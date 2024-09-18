package com.v17.lecturaExcel.modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Amigos")
public class Amigo {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("APELLIDO")
    private String apellido;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("CASOEXITO")
    private int casoExito;
    @ExcelCellName("CASOTOTALES")
    private int casoTotales;
    @ExcelCellName("EMPRESA")
    private String empresa;
    @ExcelCellName("TIPO")
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    caso_exito: %d
                    caso_totales: %d
                    empresa: %s
                    tipo: %s
                }
                """;
        return String.format(multilinea, nombre, apellido, edad, casoExito,casoTotales, empresa, tipo);
    }
}
