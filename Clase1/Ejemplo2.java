import hsa.Console;
class Ejemplo2
{
    static Console c;
    public static void main(String arg[])
    {
	float lado, superficie;
	c = new Console();
	c.print("Ingrese el valor de un Lado: ");
	lado = c.readFloat();
	superficie = lado * lado;
	c.println();
	c.println("La superficie del cuadrado es: " + superficie);
    }
}
