public class CDMp3 extends CDs{
    private String nombre;
    private int cantidad;

    public CDMp3(int capacidad, String nombre, int cantidad){
        super(capacidad, "CDMp3");
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public String toString(){
        return "Tipo de disco: "+super.getTipo()
                +"\nNombre del disco: "+this.nombre
                +"\nCantidad de canciones: "+this.cantidad
                +"\nCapacidad del disco: "+super.getCapacidad()+"\n";
    }
}
