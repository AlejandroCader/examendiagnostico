package Animales;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Mamifero> animales = new ArrayList<Mamifero>();

        animales.add(new Tigre("Zoologico", 415, 510, 800, "Bengalitus", 25, 55, "Bengala"));
        animales.add(new Leon("Savana", 315, 415, 600, "Leoncitus", 23, 55, 5, 30));
        animales.add(new Guepardo("Selva", 215, 240, 350, "Gueparditus", 25, 55));
        animales.add(new Lobo("Montaña", 230, 415, 600, "Lobitus", "gris", 10, 20, "Lobato"));
        animales.add(new Perro("Casa", 115, 125, 240, "Perritu", "negro", 15, 245));

        for (int i=0;i<animales.size();i++) {
            System.out.println(animales.get(i).toString());
        }
    }
}