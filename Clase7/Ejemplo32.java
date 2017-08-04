import hsa.Console;
class Ejemplo32{
    static Console c;
    public static void main (String arg[]){
	c = new Console();
	int [] edad;
	edad = new int[5];
	for (int i = 0; i<edad.length; i++){
	    c.print("Ingrese edad [" + i + "]:");
	    edad[i] = c.readInt();
	}
	c.println();
	c.print("El vector ingresado es: [");
	for(int i = 0; i < 5; i++){
	    c.print(edad[i]+" ");
	}
	c.print("]");
    }
}
