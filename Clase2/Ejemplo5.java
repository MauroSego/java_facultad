import hsa.Console;
class Ejemplo5 {
    static Console c;
    public static void main(String arg[]){
    float sueldo, descuento, sueldoACobrar;
    c = new Console();
    c.print("Ingrese sueldo: ");
    sueldo = c.readFloat();
    descuento = 0.0f;
    if(sueldo > 5000){
	descuento = sueldo * 10 / 100;
	}
    sueldoACobrar = sueldo - descuento; 
    c.println();
    c.println("El sueldo a cobrar es: " + sueldoACobrar);
    }
}
