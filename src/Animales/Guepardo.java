package Animales;

public class Guepardo extends Felino{

    @Override
    public String comer() {
        return "Está comiendo";
    }

    @Override
    public String dormir() {

        return "Está durmiendo";
    }

    @Override
    public String correr() {
        return "Est corriendo";
    }

    @Override
    public String comunicarse() {
        return "Está comunicandose";
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
