package Animales;

public class Guepardo extends Felino{

    @Override
    String comer() {
        return super.comer();
    }

    @Override
    String dormir() {
        return super.dormir();
    }

    @Override
    String correr() {
        return super.correr();
    }

    @Override
    String comunicarse() {
        return super.comunicarse();
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
