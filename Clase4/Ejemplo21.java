import hsa.Console;
class Ejemplo21{
//Series de numeros
    static Console c;
    public static void main (String arg[]){
	int i, t;
	c = new Console();
	i = 1;
	t = 10;
	c.println("Impresion de la serie: ");
	c.println();
	while(i <= 30){
	    c.print(t+ " ");
	    t = t + 6;
	    i = i + 1;
	}
    }
}
