package Animales;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

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

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
