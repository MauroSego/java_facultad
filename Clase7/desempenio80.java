import hsa.Console;
class Desempenio80
{
    static Console c;
    public static void main (String arg[])
    {
	c = new Console ();
	float[] precios;
	precios = new float [30];
	int menorA100, entre100y200, mayorA200;
	menorA100 = entre100y200 = mayorA200 = 0;
	c.println ("Ingrese los precios de los productos");
	c.println ();
	for (int i = 0 ; i < precios.length ; i++)
	{
	    precios [i] = c.readFloat ();
	}
	for (int i = 0 ; i < precios.length ; i++)
	{
	    c.print (precios [i] + " ");
	    if (precios [i] < 100)
		menorA100++;
	    if (precios [i] > 100 && precios [i] < 200)
		entre100y200++;
	    if (precios [i] > 200)
		mayorA200++;
	}
	c.println ();
	c.println ("Cantidad de productos menores a $100: " + menorA100);
	c.println ("Cantidad de productos mayores a $100 y menor a $200: " + entre100y200);
	c.println ("Cantidad de productos mayores a $200: " + mayorA200);
    }
}
