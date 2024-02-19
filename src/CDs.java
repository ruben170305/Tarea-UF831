public abstract class CDs {
    private int capacidad;
    private String tipo;
    public CDs (int capacidad, String tipo){
        this.capacidad=capacidad;
        this.tipo=tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString(){
        return "Tipo de disco: "+getTipo()
                +"\nCapacidad: "+getCapacidad();
    }
}
