import hsa.Console;
class Ejemplo35 {
  static Console c;
  public static void main (String arg []){
    c = new Console ();
    int [] vector;
    vector = new int [50];
    int contador, m3, m5, suma;
    contador = 1;
    m3 = m5 = 0;
    suma = 0;
    for (int i = 0 ; i < vector.length ; i++) {
      vector [i] = contador;
      contador = contador + 2;
      }
    c.println ("El vector de impares menores a 100 es: ");
    for (int i = 0 ; i < vector.length ; i++) {
      c.print (vector [i] + " ");
      if (vector [i] % 3 == 0)
      m3++;
      if (vector [i] % 5 == 0)
      m5++;
      suma = suma + vector[i];
    }
    c.println(); c.println();
    c.println ("Cantidad de multiplos de 3: " + m3);
    c.println ("Cantidad de multiplos de 5: " + m5);
    c.println ("suma total de impares: " + suma);
  }
}
