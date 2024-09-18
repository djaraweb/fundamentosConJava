package pe.edu.cibertec.evaluaciones.guiada02Collections;

import java.util.*;

public class Principal {

    static List<Gasto> listaGastos = new ArrayList<>();
    static final Double IVA = 0.13;


    public static void main(String[] args) {
        System.out.println("Inicio de Evaluador Gastos Cibertec");
        Scanner scanner = new Scanner(System.in);
        Gasto gasto1 = GastoBuilder.crearGasto(scanner);
        Gasto gasto2 = GastoBuilder.crearGasto(scanner);
        Gasto gasto3 = GastoBuilder.crearGasto(scanner);
        Gasto gasto4 = GastoBuilder.crearGasto(scanner);
        Gasto gasto5 = GastoBuilder.crearGasto(scanner);

        listaGastos.add(gasto1);
        listaGastos.add(gasto2);
        listaGastos.add(gasto3);
        listaGastos.add(gasto4);
        listaGastos.add(gasto5);

        System.out.println("Lista de gastos: " + listaGastos);
        scanner.close();
        System.out.println("Aplicando IVA");
        GastoBuilder.aplicarIVA(listaGastos);
        System.out.println("Lista de gastos con IVA : " + listaGastos);

        List<Gasto> listaCibertec = new ArrayList<>();
        List<Gasto> listaPersonal = new ArrayList<>();
        Iterator<Gasto> iterator = listaGastos.iterator();

        Double sumaCibertec = 0.;
        Double sumaPersonal = 0.;

        while (iterator.hasNext()) {
            Gasto gasto = iterator.next();
            if (gasto.getImporteGasto() > 250) {
                sumaCibertec += gasto.getImporteGasto();
                listaCibertec.add(gasto);
            } else {
                sumaPersonal += gasto.getImporteGasto();
                listaPersonal.add(gasto);
            }
        }
        Collections.sort(listaCibertec);
        Collections.sort(listaPersonal);

        // Mostramos el Reporte
        System.out.println("**** Gastos Asumidos por Cibertec ****");
        for (Gasto gasto : listaCibertec) {
            StringBuilder sb = new StringBuilder();
            sb
                    .append(gasto.getNombreGasto())
                    .append("    ")
                    .append(gasto.getImporteGasto());
            System.out.println(sb.toString());
        }
        System.out.println("Gasto Total:" + sumaCibertec);

        System.out.println("**** Gastos Asumidos por el Trabajador ****");
        for (Gasto gasto : listaPersonal) {
            StringBuilder sb = new StringBuilder();
            sb
                    .append(gasto.getNombreGasto())
                    .append("    ")
                    .append(gasto.getImporteGasto());
            System.out.println(sb.toString());
        }
        System.out.println("Gasto Total:" + sumaPersonal);
    }
}
