package CursoJava_LaGuerra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



public class Banda {
    String nombre; // NOMBRE DE LA BANDA
    List<Individuo> miembros = new ArrayList<>(); // LISTA DE LOS MIEMBROS DE LA BANDA

    // CONSTRUCTOR QUE ASIGNA UN NOMBRE A LA BANDA Y LA GENERA
    public Banda(String nombre) {
        this.nombre = nombre;
        generarBanda(); // LLAMA AL MÉTODO PARA GENERAR ALEATORIAMENTE LOS MIEMBROS DE LA BANDA
    }

    // MÉTODO PARA GENERAR ALEATORIAMENTE LOS MIEMBROS DE LA BANDA
    private void generarBanda() {
        Random rd = new Random();
        int francotiradores = rd.nextInt(16); // GENERA UN NÚMERO ALEATORIO DE FRANCOTIRADORES ENTRE 0 Y 15
        for (int i = 0; i < francotiradores; i++) { // AGREGAR FRANCOTIRADOR CON UNA PLANTA ALEATORIA
            miembros.add(new Francotirador("Francotirador: " + i, rd.nextInt(10)));
        }
        for (int i = francotiradores; i < 15; i++) { // AGREGAR LANZACOHETES CON UNA PLANTA ALEATORIA
            miembros.add(new Lanzacohetes("Lanzacohetes: " + i, rd.nextInt(10)));
        }
    }

    // MÉTODO QUE RECIBE UN DISPARO Y REDUCE LA VIDA DE LOS INDIVIDUOS EN LA PLANTA
    // IMPACTADA
    public void recibirShot(int planta, int dano) {
        for (Individuo ind : miembros) { // RECORRE A CADA INDIVIDUO DE LA BANDA
            if (ind.planta == planta) { // SI LA PLANTA COINCIDE CON EL DISPARO
                ind.vida -= dano; // REDUCE LA VIDA DEL INDIVIDUO
            }
        }
    }

    // ELIMINA LOS INDIVIDUOS QUE ESTÁN EN UNA PLANTA ESPECÍFICA
    public void eliminarEnPlanta(int planta) {
        Iterator<Individuo> ite = miembros.iterator(); // CREANDO UN ITERADOR PARA RECORRER LA LISTA
        while (ite.hasNext()) { // MIENTRAS HAYA UN SIGUIENTE ELEMENTO
            Individuo ind = ite.next(); // OBTENEMOS EL SIGUIENTE ELEMENTO
            if (ind.planta == planta) { // SI EL INDIVIDUO ESTÁ EN LA PLANTA IMPACTADA
                ite.remove(); // ELIMINAMOS EL INDIVIDUO DE LA LISTA DE FORMA SEGURA
            }
        }
    }

    // ELIMINA A LOS INDIVIDUOS QUE ESTÁN MUERTOS (VIDA <= 0)
    public void limpiarCadaberes() {
        Iterator<Individuo> ite = miembros.iterator(); // CREANDO UN ITERADOR PARA RECORRER LA LISTA
        while (ite.hasNext()) { // MIENTRAS HAYA UN SIGUIENTE ELEMENTO
            Individuo ind = ite.next(); // OBTENEMOS EL SIGUIENTE ELEMENTO
            if (!ind.estaVivo()) { // SI EL INDIVIDUO ESTÁ MUERTO
                ite.remove(); // ELIMINAMOS EL INDIVIDUO DE LA LISTA DE FORMA SEGURA
            }
        }
    }

    // VERIFICA SI LA BANDA ESTÁ VIVA (SI HAY AL MENOS UN MIEMBRO VIVO)
    public boolean estaViva() {
        return !miembros.isEmpty(); // DEVUELVE TRUE SI HAY MIEMBROS VIVOS EN LA BANDA
    }
}
