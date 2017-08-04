import hsa.Console;
class Desempeno37{
//Obtener la suma de todos los numeros menores a 100;
    static Console c;
    public static void main (String arg[]){
	int i, t; 
	c = new Console();
	i = 1; 
	t = 0;
	c.println("Impresion de la serie: ");
	c.println();
	while(i<=100){
	    c.print(t+ " ");
	    t = t+i;
	    i = i +1;
	}
    }

}
