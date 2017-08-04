import hsa.Console;
class Ejemplo44
{
  static Console c;
  String [] emisoras;
  float [] frecuencias;
  Ejemplo44 (){
    emisoras = new String [5];
    frecuencias = new float [5];
  }

  void cargarDatos () {
    c.println ("Cargue las emisoras de FM: ");
    c.println ();
    for (int i = 0 ; i < emisoras.length ; i++)  {
      c.print ("Ingrese emisora[" + (i + 1) + "]: ");
      emisoras [i] = c.readLine ();
      c.print ("Ingrese su frecuencia: ");
      frecuencias [i] = c.readFloat ();
      c.println ();
      }
  }

  void consultas () {
    int posicion;
    String emisoraAux;
    char op;
    do {
      c.clear ();
      c.println ("Consultas por emisoras");
      c.println ("----------------------");
      posicion = -1;
      c.println ();
      c.print ("Ingrese la emisora a buscar: ");
      emisoraAux = c.readLine ();
      for (int i = 0 ; i < emisoras.length ; i++){
	if (emisoraAux.equalsIgnoreCase (emisoras [i])){
	  posicion = i;
	}
      }
      c.println ();
      if (posicion != -1){
	c.print ("Le corresponde la frecuencia de: ");
	c.println (frecuencias [posicion] + " MHz");
	}
      else {
      c.println ("No existe esa emisora");
      }
      c.println ();
      c.println ();
      c.print ("Desea realizar otra consulta (s/n): ");
      op = c.readChar ();
    }
    while (op == 'S' || op == 's');
    }
  
  public static void main (String arg []) {
    c = new Console ();
    Ejemplo44 e = new Ejemplo44 ();
    e.cargarDatos ();
    e.consultas ();
    System.exit (0);
    }
}
