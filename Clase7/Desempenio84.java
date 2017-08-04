import hsa.Console;
class Desempenio84{
    static Console c;
    public static void main (String arg[]){
	c = new Console();
	float[] elementos;
	elementos = new float [15];
	float promedio, suma;
	suma = 0; 
	c.println("Ingrese los valores");
	for (int i = 0; i < elementos.length; i++){
	    elementos[i] = c.readFloat();
	}
	for (int i = 0; i < 10; i++){
	    suma = suma + elementos[i];  
	}
	promedio = suma / 10; 
	c.println("El promedio de los 10 numeros es: " + promedio);
    }
}
