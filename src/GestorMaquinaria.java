import java.util.ArrayList;

public class GestorMaquinaria {

    // crear lista:
    private ArrayList<Maquina> listaMaquinas;

    // constructor:
    public GestorMaquinaria() {
        listaMaquinas = new ArrayList<>();
    }

    // metodo para añadir objeto a la lista:
    public void agregarALista(Maquina maquina) {
        listaMaquinas.add(maquina);
        System.out.println(maquina.getCodigoMaquina() + "(" + maquina.getClass().getName() + ") registrada correctamente.");
    }

    // getter:
    public ArrayList<Maquina> getListaMaquinas() {
        return listaMaquinas;
    }

    // metodo buscador:
    public ArrayList<Maquina> buscador(String codigoMaquina) {
        ArrayList<Maquina> encontrados = new ArrayList<>();
        for (Maquina maquina : listaMaquinas) {
            if (maquina.getCodigoMaquina().equalsIgnoreCase(codigoMaquina)) {
                encontrados.add(maquina);
            }
        }
        return encontrados;
    }
}
