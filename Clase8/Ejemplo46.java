import hsa.Console;
class Ejemplo46
{
static Console c;
int [] v;
Ejemplo46 ()
{
c.print ("Ingrese la cantidad de elementosdel vector: ");
int n = c.readInt ();
v = new int [n];
}
void cargarDatos ()
{
c.println ("Cargue los elementos del vector");
c.println ();
for (int i = 0 ; i < v.length ; i++)
{
c.print ("Ingrese elemento[" + (i + 1) + "]: ");
v [i] = c.readInt ();
}
}
void ordenar (int [] v, int n)
{
int auxi;
for (int k = 1 ; k < n ; k++)
{
for (int i = 0 ; i < n - k ; i++)
{
if (v [i] > v [i + 1])
{
auxi = v [i];
v [i] = v [i + 1];
v [i + 1] = auxi;
}
}
}
}
void imprimir ()
{
for (int i = 0 ; i < v.length ; i++)
{
c.print (v [i] + " ");
}
}
void imprimirOrdenado()
{
int n = v.length;
ordenar(v,n);
imprimir();
}
public static void main (String arg [])
{
c = new Console ();
Ejemplo46 e = new Ejemplo46 ();
c.println();
e.cargarDatos ();
c.println();
c.println ("Vector ingresado:");
e.imprimir ();
c.println ();
c.println ();
c.println ("Vector ordenado:");
e.imprimirOrdenado ();
}
}
