package pe.edu.cibertec.capitulo5.laboratorio3interfaces;

public class Excel extends Documento implements Contable, Imprimible{
    boolean soyExtensionXlsx;
    double versionExcel;

    @Override
    public int contarPalabras() {
        System.out.println("Cuento palabras como un MS Excel");
        return 0;
    }

    @Override
    public int contarLineas() {
        System.out.println("Cuento lineas como un MS Excel");
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimo como un MS Excel");
    }
}
