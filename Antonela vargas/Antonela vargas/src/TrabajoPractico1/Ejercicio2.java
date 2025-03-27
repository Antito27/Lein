
package TrabajoPractico1;
/**
 *
 * @author CEN_L1
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    
    String nombre="Antonela Madelein Vargas";
    String empresa= "CEN TECH";
    String Dominio="CEN.TECH.COM.AR";
    
    String nombreFormateado=nombre.strip();
    String reFormateado=nombreFormateado.replace(" ","_");
    
    System.out.println("generando Mail...");
    System.out.println(nombreFormateado);
    
    
    }
}
