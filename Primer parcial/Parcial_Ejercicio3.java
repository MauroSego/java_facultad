import hsa.Console;
class Parcial_Ejercicio3{
    static Console c;
    public static void main (String arg[]){
	int i, j, total;
	c = new Console();
	i = 10;
	j = 5;
	total = 0;
	for(int cont = 1; cont<=50; cont++){
	    total = total +i * j;
	    i++;
	    j++;
	    
	}
	c.println(); 
	c.print("La suma total es: " + total);
    }

}
