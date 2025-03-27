package CursoJava_LaGuerra;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear las dos bandas
        Banda banda1 = new Banda("Banda 1");
        Banda banda2 = new Banda("Banda 2");

        // Mostrar las bandas al inicio
        System.out.println("Banda 1:");
        mostrarBanda(banda1);
        System.out.println("Banda 2:");
        mostrarBanda(banda2);

        while (banda1.estaViva() && banda2.estaViva()) {





            




        }
    }


    public static void mostrarBanda(Banda banda) {
        System.out.println("Estado de " + banda.nombre + ":");
        for (Individuo ind : banda.miembros) {
            System.out.println(ind.getNombre() + " Esta en la planta: " + ind.getPlanta() + " - Vida: " + ind.getVida());
        }
        System.out.println(); 
    }
}
