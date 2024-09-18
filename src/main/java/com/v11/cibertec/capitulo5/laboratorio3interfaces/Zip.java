package pe.edu.cibertec.capitulo5.laboratorio3interfaces;

public class Zip extends Documento implements Comprimible {

    @Override
    public void comprimir() {
        System.out.println("Comprimo el archivo en Zip");
    }

    @Override
    public void descromprimir() {
        System.out.println("Descomprimo archivo desde Zip");
    }
}
