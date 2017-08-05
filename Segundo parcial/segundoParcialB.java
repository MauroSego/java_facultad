import hsa.Console;
class segundoParcialB{
    static Console c;
    String[] nombres;
    float[] tiempos;
    
    segundoParcialB(){
	nombres = new String[3];
	tiempos = new float[3];
}
    
    void uno(){
	c.println("uno");
    }
    void dos(){
	c.println("dos");
    }
    void tres(){
	c.println("tres");
    }
    void cuatro(){
	c.println("cuatro");
    }
    
    public static void main (String arg[]){
	c = new Console();
	segundoParcialB e = new segundoParcialB();
	int op;
	do {
	    op = c.readInt();
	    switch(op){
		case 1: e.uno(); break;
		case 2: e.dos(); break;
		case 3: e.tres(); break;
		case 4: e.cuatro(); break;
	    }
	}
	while(op != 5);
	 System.exit(0);
    }


}
