import hsa.Console;
class ejercicio6b
{
    static Console c;
    public static void main (String arg[])
    {
    float base, altura, superficie;
    c = new Console();
    
    c.print("Ingrese la base del triangulo: ");
    base = c.readFloat();
    c.print("Ingrese la altura del triangulo: ");
    altura = c.readFloat();
    
    superficie = (base * altura) / 2;
    
    c.println("La superficie del triangulo es: " + superficie);
    }
}
