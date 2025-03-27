package CursoJava_LaGuerra;

import java.util.Random;

// CLASE QUE REPRESENTA A UN FRANCOTIRADOR, HEREDA DE INDIVIDUO
public class Francotirador extends Individuo {
    int dano; // DAÑO QUE PUEDE CAUSAR EL FRANCOTIRADOR

    // CONSTRUCTOR QUE ASIGNA UN NOMBRE, PLANTA Y DAÑO ALEATORIO ENTRE 1 Y 3
    public Francotirador(String nombre, int planta) {
        super(nombre, planta);
        this.dano = new Random().nextInt(3) + 1;
    }

    // OBTENER EL DAÑO DEL FRANCOTIRADOR
    public int getDano() {
        return dano;
    }

    // ESTABLECER UN NUEVO VALOR PARA EL DAÑO
    public void setDano(int dano) {
        this.dano = dano;
    }

    // MÉTODO PARA DISPARAR A UN ENEMIGO EN UNA PLANTA ALEATORIA
    public void disparar(Banda enemigo) {
        int elBlanco = new Random().nextInt(10); // SELECCIONA UNA PLANTA ALEATORIA ENTRE 0 Y 9
        enemigo.recibirShot(elBlanco, dano); // APLICA EL DAÑO A LOS ENEMIGOS EN ESA PLANTA
    }

    // MÉTODO PARA MOVERSE ALEATORIAMENTE ENTRE 1 Y 3 PLANTAS, ARRIBA O ABAJO
    public void mover() {
        int movimiento = new Random().nextInt(3) + 1; // GENERA UN NÚMERO ENTRE 1 Y 3
        if (new Random().nextBoolean()) {
            planta = Math.min(9, planta + movimiento); // SE MUEVE HACIA ARRIBA SIN PASAR DEL PISO 9
        } else {
            planta = Math.max(0, planta - movimiento); // SE MUEVE HACIA ABAJO SIN PASAR DEL PISO 0
        }
    }
}
