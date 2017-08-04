import hsa.Console;
class segundoParcial{
    static Console c;
    String[] nombres;
    float[] tiempos;
    
    segundoParcial() {
	nombres = new String[3];
	tiempos = new float[3];
    }
    // CARGA DE DATOS
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
    // CONSULTA DE TIEMPO DE CORREDORES
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
    // ORDEN POR TIEMPO
    void ordenarPorTiempos(){
	int n = tiempos.length;
	String auxiliarNombre;
	float auxiliarTiempo;
	for (int j = 1; j < n; j++){
	    for(int i = 0; i < n - j; i++){
		if(tiempos[i]>tiempos[i+1]){
		auxiliarNombre = nombres[i];
		nombres[i] = nombres[i+1];
		nombres[i+1] = auxiliarNombre;
		
		auxiliarTiempo = tiempos[i];
		tiempos[i] = tiempos[i+1];
		tiempos[i+1] = auxiliarTiempo;
		}
	    }
	}
    }
    // ORDEN POR NOMBRE
    void ordenarPorNombre(){
	int n = nombres.length;
	String nombreAuxiliar;
	float tiempoAuxiliar;
	for (int k = 1; k < n; k++){
	    for (int i = 0; i < n - k; i++){
		if(nombres[i].compareTo(nombres[i+1])>0){
		    nombreAuxiliar = nombres[i];
		    nombres[i] = nombres[i+1];
		    nombres[i+1] = nombreAuxiliar;
		    
		    tiempoAuxiliar = tiempos[i];
		    tiempos[i] = tiempos[i+1];
		    tiempos[i+1] = tiempoAuxiliar;
		}
	    }
	}        
    }

    void imprimir(){
	int fila = 5;
	for(int i = 0; i < nombres.length; i++){
	    c.setCursor(fila, 10);
	    c.print(nombres[i]);
	    c.setCursor(fila, 30);
	    c.print(tiempos[i]);
	    fila++;
	}
    }

    // IMPRESION DE PRIMERO Y ULTIMO
    void imprimirPrimeroYUltimo(){
	    c.println("El ganador de la competencia fue: " + nombres[0]);
	    c.println();
	    c.println("El ultimo de la competencia fue: " + nombres[nombres.length-1]);
    }
    
    //EJECUCION PRINCIPAL
    public static void main (String arg[]){
	c = new Console();
	segundoParcial e = new segundoParcial();
	int op;
	do{
	c.clear();
	c.setCursor(4, 12);
	c.print("Menu de opciones");
	c.setCursor(5, 12);
	c.print("----------------");
	c.setCursor(6, 12);
	c.print("1 - Cargar Datos");
	c.setCursor(7, 12);
	c.print("2 - Consultar por tiempos de competidores");
	c.setCursor(8, 12);
	c.print("3 - Chequear quien gano y quien salio ultimo");
	c.setCursor(9, 12);
	c.print("4 - Imprimir resultados ordenados por nombre");
	c.println();
	c.print("Digite una opcion: ");
	op = c.readInt();
	switch(op){
	    case 1: e.cargarDatos(); break;
	    case 2: c.clear();
		e.consulta(); break;
	    case 3: c.clear();
		    e.imprimirPrimeroYUltimo(); break;
	    case 4: c.clear();
		    e.ordenarPorNombre();
		    e.imprimir();
	}
    }
	while(op != 5);
	System.exit(0);
	
	
	/*e.cargarDatos();
	e.ordenarPorNombre();
/*        e.consulta();
	e.ordenarPorTiempos();
	e.imprimirOrdenados();
	e.imprimirPrimeroYUltimo();*/
	//System.exit(0);
    }
}
