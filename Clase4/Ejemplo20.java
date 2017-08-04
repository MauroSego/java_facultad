import hsa.Console;
class Ejemplo20{
//Multiplos de 3 y 5
    static Console c;
    public static void main (String arg[]){
	int i, m3, m5, m35, n;
	c = new Console();
	i = 1;
	m3 = 0;
	m5 = 0;
	m35 = 0;
	
	while(i<=12){
	    c.print("Ingrese un numero: ");
	    n = c.readInt();
	    if(n % 3 == 0)
		m3++;
	    if(n % 5 == 0)
		m5++;
	    if(n % 3 == 0 && n % 5 == 0)
		m35++;
	    i = i + 1;
	}
	c.println();
	c.println("La cantidad de multiplos de 3 es: " + m3);
	c.println("La cantidad de multiplos de 5 es: " + m5);
	c.println("La cantidad de multiplos de 3 y 5 es: " + m35);
     }
}
