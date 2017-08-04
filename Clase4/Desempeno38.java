import hsa.Console;
class Desempeno38 {
    static Console c;
    public static void main (String arg[]){
	float n, t, promedio;
	c = new Console();
	int i;
	i = 1;
	t = 0;
	while (i <= 7) {
	    c.println("Ingrese un numero: ");
	    n = c.readFloat();
	    t = t + n;
	    i++;
	 }
	promedio = t / 7;
	if(promedio > 100){
	    c.println("El promedio de los numeros es mayor a 100 " + promedio);
	} else {
	    c.println("El promedio de los numeros es menor a 100 " + promedio);
	}
    }
}
