import hsa.Console;
class ejercicio6c
{
    static Console c;
    public static void main (String arg[])
    {
    float precio, precioDescuento, descuento;
    String nombreProducto;
    c = new Console();
    
    c.print("Ingrese el nombre del producto: ");
    nombreProducto = c.readLine();
    c.print("Ingrese precio del producto: ");
    precio = c.readFloat();
    
    
    precioDescuento = precio - (precio * 0.12f);
    
    c.println("El producto " + nombreProducto + " tiene el precio: " + precio + " y con descuento su precio es: " + precioDescuento); 
    }
}
