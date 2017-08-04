import hsa.Console;
class Desempeno39 {
    static Console c;
    public static void main (String arg[]){
	int valor, contadorPar, contadorImpar, contadorCeros, i;
	contadorPar = 0;
	contadorImpar = 0;
	contadorCeros = 0;
	i = 0;
	c = new Console();
	while (i <= 15){
	    c.println("Escribe un numero: ");
	    valor = c.readInt();
	    if(valor % 10 == 0 && valor % 2 == 0){
		contadorPar = contadorPar + 1;
		contadorCeros = contadorCeros + 1;
	    } else if(valor % 2 == 0) {
		contadorPar = contadorPar + 1;
	    } else {
		contadorImpar = contadorImpar + 1;
	    }
	    i = i + 1;
	}
	c.println("Cantidad de pares: " + contadorPar);
	c.println("Cantidad de impares: " + contadorImpar);
	c.println("Cantidad de terminados en 0: " + contadorCeros);
    }
}
