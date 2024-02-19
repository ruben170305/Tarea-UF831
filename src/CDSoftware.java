public class CDSoftware extends CDs{
    private String id;
    private String listaAplicaciones;

    public CDSoftware(int capacidad, String id, String listaAplicaciones){
        super(capacidad, "CDSoftware");
        this.id=id;
        this.listaAplicaciones=listaAplicaciones;
    }

    public String toString(){
        return "Tipo de disco: "+super.getTipo()
                +"\nIdentificador: "+this.id
                +"\nLista de aplicaciones: "+this.listaAplicaciones
                +"\nCapacidad del disco: "+super.getCapacidad();
    }
}
