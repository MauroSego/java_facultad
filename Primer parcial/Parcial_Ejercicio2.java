import hsa.Console;
class Parcial_Ejercicio2 {
    static Console c;
    public static void main (String arg[]){
	int bajos, normales, altos, cantidad;
	float altura, promedio, alturaTotal;
	c = new Console();
	
	alturaTotal = 0;
	bajos = 0;
	normales = 0;
	altos = 0;
	cantidad = 0;
	
	c.print("Ingrese su altura (999 para finalizar): ");
	altura = c.readFloat();
	
	while (altura != 999){
	    cantidad++;
	    if(altura < 1.6){
		bajos++;
	    } else if (altura >= 1.6 && altura <= 1.8){
		normales++;
	    } else if (altura > 1.8){
		altos++;
	    }
	    alturaTotal = alturaTotal + altura;
	
	    c.print("Ingrese su altura (999 para finalizar): ");
	    altura = c.readFloat();   
	}
	if (cantidad > 0){
	    promedio = alturaTotal/cantidad;
	    c.println("Cantidad de altos :" + altos);
	    c.println("Cantidad de normales :" + normales);
	    c.println("Cantidad de bajos :" + bajos);
	    c.println("Sueldo promedio: " + promedio);
	} else {
	  c.println("No se ingresaron registros");
	}
  }
}
