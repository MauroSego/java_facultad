import hsa.Console;
class Parcial_ejercicio1{
    static Console c;
    public static void main (String arg[]){
	c = new Console();
	int [] valores;
	valores = new int[3];
	for (int i = 0; i < valores.length; i++){
	    c.print("Ingrese un valor [" + i + "]:");
	    valores[i] = c.readInt();
	}
	c.println();
	for (int i = 0; i < valores.length; i++){
	    if (valores[i] % 2 == 0){
		c.print("Alguno de los números ingresados fue par");
		c.println();
	    } else if (valores[i] % 2 != 0 && valores[i] % 3 == 0) {
		c.print("Alguno de los números ingresados fue impar múltiplo de 3");
		c.println();
	    } else {
		c.print("Ninguno de los números ingresados fue par ni impar múltiplo de 3");
		c.println();
	    }
	}
    }
}
