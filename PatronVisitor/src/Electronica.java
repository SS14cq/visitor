
public class Electronica implements Producto{
    private final String nombre;
    private final int precio;

    public Electronica(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public int getPrecio(){
        return precio;
    }

}