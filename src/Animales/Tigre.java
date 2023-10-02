package Animales;

public class Tigre extends Felino{

    private String especieTigre;

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public float getTamanoGarras() {
        return super.getTamanoGarras();
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

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
