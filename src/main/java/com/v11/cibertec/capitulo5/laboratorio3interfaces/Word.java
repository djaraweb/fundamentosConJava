package pe.edu.cibertec.capitulo5.laboratorio3interfaces;

public class Word extends Documento implements Contable, Imprimible{
    boolean soyExtensionDocx;
    double versionWord;

    @Override
    public int contarPalabras() {
        System.out.println("Cuento palabras como un MS Word");
        return 0;
    }

    @Override
    public int contarLineas() {
        System.out.println("Cuento lineas como un MS Word");
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimo como un MS Word");
    }
}
