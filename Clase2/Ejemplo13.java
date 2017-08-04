import hsa.Console;
class Ejemplo13
{
    static Console c;
    public static void main (String arg []){
	int n1, n2, n3;
	
	c = new Console();
	
	c.print("Ingresa el primer numero: ");
	n1 = c.readInt();
	c.print("Ingresa el segundo numero: ");
	n2 = c.readInt();
	c.print("Ingresa el tercer numero: ");
	n3 = c.readInt();
	
	if(n1 > n2 && n1 > n3){
	    c.println("El mayor es: " + n1);
	} else if(n2 > n3){
	    c.println("El mayor es: " + n2);
	} else {
	    c.println("El mayor es: " + n3);
	}
    
    }

}
