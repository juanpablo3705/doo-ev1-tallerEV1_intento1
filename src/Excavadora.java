public class Excavadora extends Maquina implements Certificable{

    // atributos:
    private double peso;
    private boolean mantencionAlDia;
    private boolean certificacion;

    // constructor sin parametros:
    public Excavadora() {
    }

    // constructor con parametros:
    public Excavadora(String codigoMaquina, int horasUso, int potencia, double peso, boolean mantencionAlDia) {
        super(codigoMaquina, horasUso, potencia);
        this.setPeso(peso);
        this.setMantencionAlDia(mantencionAlDia);
        // constructor que le doy yo un valor default:
        this.setCertificacion(false);
    }

    // getter and setters:
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMantencionAlDia() {
        return mantencionAlDia;
    }

    public void setMantencionAlDia(boolean mantencionAlDia) {
        this.mantencionAlDia = mantencionAlDia;
    }

    public boolean isCertificacion() {
        return certificacion;
    }

    public void setCertificacion(boolean certificacion) {
        this.certificacion = certificacion;
    }

    // metodo funcional que se override aqui, implementado desde Maquina:
    @Override
    public double calcularCosto() {
        double costoBase = 150000;
        if (!mantencionAlDia){
            costoBase = costoBase * 1.25;
        }
        return costoBase;
    }

    // implementacion de todos los metodos de la interfaz:
    @Override
    public boolean certificacionActiva() {
        return certificacion;
    }

    @Override
    public void certificame() {
        certificacion = true;
    }
}
