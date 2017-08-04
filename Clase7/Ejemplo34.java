import hsa.Console;
class Ejemplo34{
    static Console c;
    public static void main (String arg[]){
	c = new Console();
	float [] alturas;
	alturas = new float[5];
	float suma = 0;
	float promedio;
	int altas, bajas;
	altas = bajas = 0;
	c.println("Ingrese los valores de las alturas");
	c.println();
	for (int i = 0; i < alturas.length; i++){
	    c.print("alturas[" + i + "]: ");
	    alturas[i] = c.readFloat();
	    suma = suma + alturas[i];
	}
	promedio = suma / alturas.length;
	c.println();
	c.println("El promedio es: " + promedio);
	for (int i = 0; i < alturas.length; i++){
	    if(alturas[i] > promedio)
		altas++;
		else
		bajas++;
	}
	c.println("Cantidad de Personas altas: " + altas);
	c.println("Cantidad de Personas bajas: " + bajas);
    }
}
