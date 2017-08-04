import hsa.Console;
class Desempenio21{
    static Console c;
    public static void main (String arg[]){
	String nombre;
	float cantPregHechas, cantPregCorrectas;
	float porcentajeAcierto;
	c = new Console();        
	
	c.print("Ingrese nombre del postulante: ");
	nombre = c.readString();
	c.print("Ingrese cantidad de Preguntas Hechas: ");
	cantPregHechas = c.readInt();
	c.print("Ingrese cantidad de preguntas respondidas correctamente: ");
	cantPregCorrectas = c.readInt();
	
	porcentajeAcierto = (float)(cantPregCorrectas/cantPregHechas)*100;
		
	if(porcentajeAcierto >= 90){
	    c.println("El postulante " + nombre + " tiene un nivel superior con un porcetaje de acierto de: " + porcentajeAcierto); 
	} else if(porcentajeAcierto >= 75 && porcentajeAcierto < 90){
	    c.println("El postulante " + nombre + " tiene un nivel medio con un porcetaje de acierto de: " + porcentajeAcierto);
	} else if(porcentajeAcierto >= 50 && porcentajeAcierto < 75){
	    c.println("El postulante " + nombre + " tiene un nivel regular con un porcetaje de acierto de: " + porcentajeAcierto);
	} else {
	    c.println("El postulante " + nombre + " esta fuera de nivel con un porcetaje de acierto de: " + porcentajeAcierto);
	}
    } 
}
