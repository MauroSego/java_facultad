import hsa.Console;
class Ejemplo33{
    static Console c;
    public static void main (String arg[]){
	c = new Console();
	int [] numerosPares = {0, 2, 4, 6, 8, 10, 12};
	c.print("Los numeros pares hasta 12 son [");
	for (int i = 0; i < numerosPares.length; i++){
	    c.print(numerosPares[i] + " ");
	}
	c.print("]");
    }
}
