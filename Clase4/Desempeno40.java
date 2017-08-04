import hsa.Console;
class Desempeno40{
    static Console c;
    public static void main (String arg[]){
	int i, valor, total;
	i = 0;
	total = 0;
	c = new Console();
	while (i < 10){
	    c.println("Escribe un numero: ");
	    valor = c.readInt();
	    if(i >= 5){
		total = total + valor;
	    }
	    i = i + 1;
	}
	c.println("El valor total es: " + total);
    }
}
