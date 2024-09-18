package com.v17.lecturaExcel.modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("Productos")
public class Producto {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("PRECIO")
    private double precio;
    @ExcelCellName("STOCK")
    private int stock;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("PERECIBLE")
    private boolean perecible;
    @ExcelCellName("VOLUMEN")
    private double volumen;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s                    
                    precio: %.2f
                    stock: %d
                    peso: %.3f
                    perecible: %b
                    volumen: %.3f
                }
                """;
        return String.format(multilinea, nombre, precio, stock, peso,perecible, volumen);
    }
}
