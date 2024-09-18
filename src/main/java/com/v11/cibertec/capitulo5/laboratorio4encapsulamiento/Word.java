package pe.edu.cibertec.capitulo5.laboratorio4encapsulamiento;

public class Word extends Documento implements Contable, Imprimible {
    private boolean soyExtensionDocx;
    private double versionWord;

    public boolean isSoyExtensionDocx() {
        return soyExtensionDocx;
    }

    public void setSoyExtensionDocx(boolean soyExtensionDocx) {
        this.soyExtensionDocx = soyExtensionDocx;
    }

    public double getVersionWord() {
        return versionWord;
    }

    public void setVersionWord(double versionWord) {
        this.versionWord = versionWord;
    }

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
