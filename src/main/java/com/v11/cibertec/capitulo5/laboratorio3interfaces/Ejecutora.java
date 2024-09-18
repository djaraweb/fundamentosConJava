package pe.edu.cibertec.capitulo5.laboratorio3interfaces;

public class Ejecutora {

    public static void main(String[] args) {
        Word miWord = new Word();
        miWord.contarLineas();
        miWord.contarPalabras();
        miWord.imprimir();

        Excel miExcel = new Excel();
        miExcel.contarLineas();
        miExcel.contarPalabras();
        miExcel.imprimir();

        Zip miZip = new Zip();
        miZip.comprimir();
        miZip.descromprimir();
    }
}
