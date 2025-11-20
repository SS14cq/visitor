interface Producto {
void accept(Visitor visitor);
String getNombre();
int getPrecio();
}