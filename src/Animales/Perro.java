package Animales;

public class Perro  extends Canino{

    private int fuerzaMordida;

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String getColor() {
        return super.getColor();
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

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
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
