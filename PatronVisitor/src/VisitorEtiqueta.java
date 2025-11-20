public class VisitorEtiqueta implements Visitor{
    @Override
    public void visit(Libro libro){
        System.out.println("Etiqueta Libro");
        System.out.println("Nombre: "+libro.getNombre());
        System.out.println("Categoria: Libro");
        System.out.println("Precio sin descuento: "+ libro.getPrecio());

    }

    @Override
    public void visit(Ropa ropa){
        System.out.println("Etiqueta Ropa");
        System.out.println("Nombre: "+ropa.getNombre());
        System.out.println("Categoria: Ropa");
        System.out.println("Precio sin descuento: "+ ropa.getPrecio());
    }

    @Override
    public void visit(Electronica electronica){
        System.out.println("Etiqueta Electronica");
        System.out.println("Nombre: "+electronica.getNombre());
        System.out.println("Categoria: Electronia");
        System.out.println("Precio sin descuento: "+ electronica.getPrecio());
    }
}