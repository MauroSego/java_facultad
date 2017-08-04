import hsa.Console;
class Desempenio20{
    static Console c;
    public static void main (String arg[]){
	float x, y;
	c = new Console();
	
	c.print("Ingrese coordenada de x: ");
	x = c.readFloat();
	c.print("Ingrese la coordenada de y: ");
	y = c.readFloat();
	
	if(x > 0 && y > 0){
	    c.println("Primer cuadrante");
	} else if( x < 0 && y > 0){
	    c.println("Segundo cuadrante");
	} else if (x < 0 && y < 0) {
	    c.println("Tercer cuadrante");
	} else if(x > 0 && y < 0) {
	    c.println("Cuarto cuadrante");
	}
   }
}
