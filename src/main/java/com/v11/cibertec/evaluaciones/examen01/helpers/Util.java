package pe.edu.cibertec.evaluaciones.examen01.helpers;

public class Util {

    public static boolean verificarSiStringContieneNumeros(String cadena) {
        char[] caracteresNombres = cadena.toCharArray();
        for (char caracterNombre : caracteresNombres) {
            if (Character.isDigit(caracterNombre)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarSiStringContieneLetras(String cadena) {
        char[] caracteresNombres = cadena.toCharArray();
        for (char caracterNombre : caracteresNombres) {
            if (Character.isLetter(caracterNombre)) {
                return true;
            }
        }
        return false;
    }
    public static boolean verificarSiStringEsUnNumero(String cadena) {
        boolean isNumeric = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                isNumeric = false;
            }
        }
        return isNumeric;
    }

    public static String nombreDelMes(int nromes){
        String mes="";
        switch (nromes){
            case 1: mes = "Enero";break;
            case 2: mes = "Febrero";break;
            case 3: mes = "Marzo";break;
            case 4: mes = "Abril";break;
            case 5: mes = "Mayo";break;
            case 6: mes = "Junio";break;
            case 7: mes = "Julio";break;
            case 8: mes = "Agosto";break;
            case 9: mes = "Setiembre";break;
            case 10: mes = "Octubre";break;
            case 11: mes = "Noviembre";break;
            case 12: mes = "Diciembre";break;
        }
        return mes;
    }
}
