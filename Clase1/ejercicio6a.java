import hsa.Console;
class ejercicio6a
{
    static Console c;
    public static void main (String arg[])
    {
	float n1, n2, suma, producto;
	c = new Console();
	
	c.print("Ingrese el primer numero: ");
	n1 = c.readFloat();
	c.print("Ingrese el segundo numero: ");
	n2 = c.readFloat();
	
	suma = n1 + n2;
	producto = n1 * n2;
	
	c.println("La suma de los numeros es igual a: " + suma);
	c.println("El producto de los numeros es igual a: " + producto);
    }
    
}
