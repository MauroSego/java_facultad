import hsa.Console;
class segundoParcial{
    static Console c;
    String[] nombres;
    float[] tiempos;
    
    segundoParcial() {
	nombres = new String[3];
	tiempos = new float[3];
    }
    
    void cargarDatos(){
	c.println("Cargue los datos de las personas: ");
	c.println();
	for(int i = 0; i < nombres.length; i++){
	    c.print("Ingrese nombre["+ (i + 1) + "]:");
	    nombres[i] = c.readLine();
	    c.print("Ingrese el tiempo: ");
	    tiempos[i] = c.readFloat();
	    c.println();
	}
    }
    
    void consulta(){
	int posicion;
	String nombreBuscado;
	char op;
	do{
	    c.println("Consulta de tiempo por corredor");
	    c.println("-------------------------------");
	    posicion = -1;
	    c.println();
	    c.println("Ingrese el nombre del corredor: ");
	    nombreBuscado = c.readLine();
	    for(int i = 0; i < nombres.length; i++){
		if(nombreBuscado.equalsIgnoreCase(nombres[i])){
		    posicion = i;
		}
	    }
	    c.println();
	    if(posicion != -1){
		c.print("El tiempo del corredor fue: " + tiempos[posicion]); 
	    } else {
		c.println("No hay registro de ese corredor");
	    }
	    c.println();
	    c.println("Quiere hacer otra busqueda? (s/n): ");
	    op = c.readChar();
	}
	while(op == 'S' || op == 's');
    } 
    
    void
    
    public static void main (String arg[]){
	c = new Console();
	segundoParcial e = new segundoParcial();
	e.cargarDatos();
	e.consulta();
	System.exit(0);
    }
}
