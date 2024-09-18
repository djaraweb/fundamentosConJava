package com.v17.utilities;

import com.poiji.bind.Poiji;
import com.v17.lecturaExcel.modelos.Amigo;
import com.v17.lecturaExcel.modelos.Color;
import com.v17.lecturaExcel.modelos.Producto;
import com.v17.lecturaExcel.modelos.Vector;
import com.v17.lecturaExcel.modelos.Videojuego;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private static final String excelPath = "src/main/java/resources/infoExcel.xlsx";

    public static List<Videojuego> getListaVideojuegos(){
        return Poiji.fromExcel(new File(excelPath), Videojuego.class);
    }

    public static List<Amigo> getListaAmigos(){
        Logs.debug("Leyendo excel de Amigos");
        return Poiji.fromExcel(new File(excelPath), Amigo.class);
    }

    public static List<Producto> getListaProductos(){
        Logs.debug("Leyendo excel de Productos");
        return Poiji.fromExcel(new File(excelPath), Producto.class);
    }

    public static List<Color> getListaColores(){
        Logs.debug("Leyendo excel de Colores");
        return Poiji.fromExcel(new File(excelPath), Color.class);
    }

    public static List<Vector> getListaVectores(){
        Logs.debug("Leyendo excel de Vectores");
        return Poiji.fromExcel(new File(excelPath), Vector.class);
    }
}
