public class CDAudio extends CDs{
    private String titulo;
    private String interprete;

    public CDAudio(int capacidad, String titulo, String interprete){
        super(capacidad, "CDAudio");
        this.titulo=titulo;
        this.interprete=interprete;
    }

    public String toString(){
        return "Tipo de disco: "+super.getTipo()
                +"\nIdentificador: "+this.titulo
                +"\nTipo datos: "+this.interprete
                +"\nCapacidad del disco: "+super.getCapacidad()+"\n";
    }
}
