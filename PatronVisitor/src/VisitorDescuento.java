public class VisitorDescuento implements Visitor{
    @Override
    public void visit(Libro libro){
        int precioFinal=(int) (libro.getPrecio()*0.90);
        System.out.println("Nombre: "+libro.getNombre());
        System.out.println("Categoria: Libro");
        System.out.println("Libro con descuento: "+ precioFinal);
    }

    @Override
    public void visit(Ropa ropa){
        int precioFinal=(int) (ropa.getPrecio()*0.90);
        System.out.println("Etiqueta Ropa");
        System.out.println("Nombre: "+ropa.getNombre());
        System.out.println("Ropa con descuento: "+ precioFinal);
    }

    @Override
    public void visit(Electronica electronica){
        int precioFinal=(int) (electronica.getPrecio()*0.90);
        System.out.println("Etiqueta Electronica");
        System.out.println("Nombre: "+electronica.getNombre());
        System.out.println("Electronica con descuento: "+ precioFinal);
    }
}