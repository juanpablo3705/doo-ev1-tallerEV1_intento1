public class Main {
    public static void main(String [] args) {

        // crear objetos:
        Excavadora excavadora1 = new Excavadora("MAQ-EX01", 3200, 210, 18.5, false);
        Excavadora excavadora2 = new Excavadora("MAQ-EX02", 800, 180, 14.0, true);
        CargadorFrontal cargador1 = new CargadorFrontal("MAQ-CG01", 1500, 150, 3.5);
        CargadorFrontal cargador2 = new CargadorFrontal("MAQ-CG02", 400, 130, 2.0);

        // metodo de la interfaz para certificar a excavadora1 segun requerimientos del enunciado:
        excavadora1.certificame();

        // instanciar la lista:
        GestorMaquinaria gestor = new GestorMaquinaria();

        // hacer registros de los objetos en la lista:
        gestor.agregarALista(excavadora1);
        gestor.agregarALista(excavadora2);
        gestor.agregarALista(cargador1);
        gestor.agregarALista(cargador2);

        // buscar:
        System.out.println("---BUSCADOR---");
        for (Maquina maquina : gestor.buscador("MAQ-EX01")) {
            System.out.println(maquina);
            System.out.println("Costo: $" + maquina.calcularCosto());
        }

        // listar todos los items:
        System.out.println("---LISTADO---");
        for (Maquina maquina : gestor.getListaMaquinas()) {
            System.out.println(maquina);
            System.out.println("Costo: $" + maquina.calcularCosto());
        }

    }
}