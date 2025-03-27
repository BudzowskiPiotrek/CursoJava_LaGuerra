package CursoJava_LaGuerra;

import java.util.Random;

// CLASE QUE REPRESENTA A UN LANZACOHETES, HEREDA DE INDIVIDUO
public class Lanzacohetes extends Individuo {
    int alcance; // ALCANCE DEL DISPARO DEL LANZACOHETES

    // CONSTRUCTOR QUE ASIGNA UN NOMBRE, PLANTA Y ALCANCE ALEATORIO ENTRE 1 Y 3
    public Lanzacohetes(String nombre, int planta) {
        super(nombre, planta);
        this.alcance = new Random().nextInt(3) + 1; // ALCANCE ENTRE 1 Y 3
    }

    // MÉTODO PARA DISPARAR A UNA PLANTA ALEATORIA DEL EDIFICIO ENEMIGO
    public void disparar(Banda enemigo) {
        int elBlanco = new Random().nextInt(10); // SELECCIONA UNA PLANTA ALEATORIA ENTRE 0 Y 9

        // DECIDE SI DISPARA HACIA ARRIBA O HACIA ABAJO
        if (new Random().nextBoolean()) {
            elBlanco = Math.min(9, elBlanco + alcance); // SI DISPARA HACIA ARRIBA, SUMA ALCANCE SIN SUPERAR EL PISO 9
        } else {
            elBlanco = Math.max(0, elBlanco - alcance); // SI DISPARA HACIA ABAJO, RESTA ALCANCE SIN BAJAR DEL PISO 0
        }

        enemigo.eliminarEnPlanta(elBlanco); // ELIMINA A TODOS LOS ENEMIGOS EN LA PLANTA IMPACTADA
    }
}
