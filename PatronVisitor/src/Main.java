public class Main{
    public static void main(String[] args){
        Producto p1= new Libro("El Principito", 50000);
        Producto p2= new Ropa("Camisa Oversize", 60000);
        Producto p3= new Electronica("TV 50 pulgadas", 1250000);
        
        Visitor descuento= new VisitorDescuento();
        Visitor etiqueta= new VisitorEtiqueta();

        p1.accept(descuento);
        p2.accept(descuento);
        p3.accept(descuento);

        System.out.println("---------------------");

        p1.accept(etiqueta);
        p2.accept(etiqueta);
        p3.accept(etiqueta);
        
    }

    

}