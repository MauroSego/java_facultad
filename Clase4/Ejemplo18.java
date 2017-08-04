import hsa.Console;
class Ejemplo18{
    static Console c;
    public static void main (String arg[]){
	int i;
	c = new Console();
	i = 100;
	while(i<=300){
	    c.print(i+" ");
	    i = i+2;
	}
    }
}
