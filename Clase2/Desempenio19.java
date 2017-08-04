import hsa.Console;
class Desempenio19{
    static Console c;
    public static void main (String arg[]){
	int n1, n2, n3, calculo;
	c = new Console();
	
	c.print("Ingrese primer numero: ");
	n1 = c.readInt();
	c.print("Ingrese segundo numero: ");
	n2 = c.readInt();
	c.print("Ingrese tercer numero: ");
	n3 = c.readInt();
	
	if(n1 == n2 && n2 == n3){
	    calculo = (int)(n1 + n2) * n3;
	    c.println(calculo);
	} else {
	    c.println("No son todos iguales");
	}
     }
    }

