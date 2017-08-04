import hsa.Console;
class Ejemplo12
{
 static Console c;
 public static void main (String arg [])
 {
 int nota1, nota2, nota3;
 float promedio;
 
 c = new Console();
 
 c.print("Ingresa la primer nota: ");
 nota1 = c.readInt();
 c.print("Ingresa la segunda nota: ");
 nota2 = c.readInt();
 c.print("Ingresa la tercera nota: ");
 nota3 = c.readInt();
 
 promedio = (float)(nota1 + nota2 + nota3) / 3;
 c.println("El promedio es: " + promedio);
 
 
 if(promedio >= 7){
    c.println("Promocionado");
    } else if (promedio >= 4){
	c.println("Regular");
    } else {
	c.println("Reprobado");
    }
 }
}
