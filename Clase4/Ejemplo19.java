import hsa.Console;
class Ejemplo19{
//Total a pagar
    static Console c;
    public static void main (String arg[]){
	int contador, total, producto;
	c = new Console();
	contador = 1;
	total = 0;
	while(contador<=10){
	    c.print("Ingrese valor producto: ");
	    producto = c.readInt();
	    total = total + producto;
	    contador = contador + 1;
	}
	c.println();
	c.println("La suma de todos los productos es: " + total);
    }
}
