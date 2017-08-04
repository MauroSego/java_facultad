import hsa.Console;
class Desempeno41 {
    static Console c;
    public static void main (String arg[]){
	int i, t, cont;
	c = new Console();
	cont = 1;
	i = 6;
	t = 0;
	while(cont<= 50){
	    t = t + 5 * i;
	    i = i + 1;
	    cont = cont + 1;
	}
	c.println("El valor total es: " + t);
    }
}
