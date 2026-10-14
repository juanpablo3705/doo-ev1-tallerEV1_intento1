public class CargadorFrontal extends Maquina {

    // atributos:
    private double capacidad;

    // constructor vacio:
    public CargadorFrontal() {
    }

    // constructor con parametros:
    public CargadorFrontal(String codigoMaquina, int horasUso, int potencia, double capacidad) {
        super(codigoMaquina, horasUso, potencia);
        this.setCapacidad(capacidad);
    }

    // getter and setter:
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    // llenar el metodo funcional implementado de la superclase:
    @Override
    public double calcularCosto() {
        double costoBase = 120000;
        if (capacidad > 3){
            costoBase = costoBase * 1.20;
        }
        return costoBase;
    }
}
