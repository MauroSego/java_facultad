import hsa.Console;
class Ejemplo43{
    static Console c;
    String[] nombres;
    int[] edades;
    float[] sueldos;
    
    Ejemplo43(){
	nombres = new String[5];
	edades = new int[5];
	sueldos = new float[5];
    }
    
    void cargarDatos(){
	c.println("Cargue los datos de las personas:");
	c.println();
	for(int i = 0; i < nombres.length; i++){
	    c.print("Ingrese nombre[" + (i + 1) + "]:");
	    nombres[i] = c.readLine();
	    c.print("Ingrese su edad: ");
	    edades[i] = c.readInt();
	    c.print("Ingrese su sueldo: ");
	    sueldos[i] = c.readFloat();
	    c.println();
	}
    }
    int mayor (int[] edades){
	int m = edades[0];
	int p = 0;
	for (int i = 1; i < edades.length; i++){
	    if(edades[i] > m){
		m = edades[i];
		p = i;
	    }
	}
	return p;
    }
    
    void imprimirDatos(){
	int p;
	c.setCursor(3, 10);
	c.println("Datos de la persona de Mayor edad");
	c.println("--------------------------");
	
	c.println();
	p = mayor(edades);
	c.println("El nombre de mayor edad es: " + nombres[p]);
    }
    
    public static void main (String arg[]){
	c = new Console();
	Ejemplo43 e = new Ejemplo43();
	e.cargarDatos();
	c.clear();
	e.imprimirDatos();
    }
}
