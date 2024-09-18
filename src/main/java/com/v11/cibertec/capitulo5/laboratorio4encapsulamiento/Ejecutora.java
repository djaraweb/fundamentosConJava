package pe.edu.cibertec.capitulo5.laboratorio4encapsulamiento;

public class Ejecutora {

    public static void main(String[] args) {
        Word miWord = new Word();
        miWord.setNombre("Tesis.doc");
        miWord.setSoyExtensionDocx(true);
        miWord.contarLineas();
        miWord.contarPalabras();
        miWord.imprimir();

        Excel miExcel = new Excel();
        miExcel.setNombre("Calculo.xlsx");
        miExcel.setSoyExtensionXlsx(true);
        miExcel.contarLineas();
        miExcel.contarPalabras();
        miExcel.imprimir();

        Zip miZip = new Zip();
        miZip.comprimir();
        miZip.descromprimir();
    }
}
