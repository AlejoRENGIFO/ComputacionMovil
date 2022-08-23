package RepasoJava1;

public class Operaciones {
public void CalcularIMC(Persona p) {
	double operacion = p.getPeso()/p.getAltura();
	System.out.println("El IMC de la persona "+p.getNombre()+"es: "+operacion);
}
}
