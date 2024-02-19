public class CDDatos extends CDs{
    private String id;
    private String tipoDatos;

    public CDDatos(int capacidad, String id, String tipoDatos){
        super(capacidad,"CDDatos");
        this.id=id;
        this.tipoDatos=tipoDatos;
    }

    public String toString(){
        return "Tipo de disco: "+super.getTipo()
                +"\nIdentificador: "+this.id
                +"\nTipo datos: "+this.tipoDatos
                +"\nCapacidad del disco: "+super.getCapacidad();
    }
}
