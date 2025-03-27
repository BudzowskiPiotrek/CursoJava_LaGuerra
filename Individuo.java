package CursoJava_LaGuerra;

// CLASE BASE PARA LOS INDIVIDUOS DE LAS BANDAS
public class Individuo {
    String nombre; // NOMBRE DEL INDIVIDUO
    int vida = 9; // VIDA INICIAL DEL INDIVIDUO
    int planta; // PLANTA EN LA QUE SE ENCUENTRA

    // CONSTRUCTOR PARA ASIGNAR NOMBRE Y PLANTA
    public Individuo(String nombre, int planta) {
        this.nombre = nombre;
        this.planta = planta;
    }

    // OBTENER EL NOMBRE DEL INDIVIDUO
    public String getNombre() {
        return nombre;
    }

    // ESTABLECER UN NUEVO NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // OBTENER LA VIDA ACTUAL DEL INDIVIDUO
    public int getVida() {
        return vida;
    }

    // MODIFICAR LA VIDA DEL INDIVIDUO
    public void setVida(int vida) {
        this.vida = vida;
    }

    // OBTENER LA PLANTA EN LA QUE SE ENCUENTRA
    public int getPlanta() {
        return planta;
    }

    // CAMBIAR LA PLANTA EN LA QUE SE ENCUENTRA
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    // VERIFICAR SI EL INDIVIDUO SIGUE VIVO
    public boolean estaVivo() {
        return vida > 0;
    }
}