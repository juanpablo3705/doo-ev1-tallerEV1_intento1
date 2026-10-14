public abstract class Maquina {

    // atributos:
    protected String codigoMaquina;
    protected int horasUso;
    protected int potencia;

    // constructor sin parametros:
    public Maquina() {
    }

    // constructor con parametros:
    public Maquina(String codigoMaquina, int horasUso, int potencia) {
        this.setCodigoMaquina(codigoMaquina);
        this.setHorasUso(horasUso);
        this.setPotencia(potencia);
    }
    // getters and setters:
    public String getCodigoMaquina() {
        return codigoMaquina;
    }

    public void setCodigoMaquina(String codigoMaquina) {
        if (codigoMaquina == null || codigoMaquina.isEmpty()){
            throw new IllegalArgumentException("Error, el código no puede estar vacío.");
        }
        this.codigoMaquina = codigoMaquina;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //toString:
    @Override
    public String toString() {
        return "Maquina{" +
                "codigoMaquina='" + codigoMaquina + '\'' +
                ", horasUso=" + horasUso +
                '}';
    }

    // metodo funcional:
    public abstract double calcularCosto();
}