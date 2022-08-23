package RepasoJava1;
import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
	Scanner Movil = new Scanner(System.in);
	
System.out.println("Ingrese su Nombre");
System.out.println("Ingrese su Altura");
System.out.println("Ingrese su Peso");

	Persona P=new Persona();
	
	P.setNombre(Movil.next());
	P.setAltura(Movil.nextDouble());
	P.setPeso(Movil.nextDouble());
	
Operaciones O=new Operaciones();
O.CalcularIMC(P);
}
}
