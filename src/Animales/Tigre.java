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
