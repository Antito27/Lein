
package misprimerospasosenJAVA;
import java.util.Scanner;
public class EntradaDdatos {
    //metodo main
    public static void main(String[] args) {
    
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        nombre=leer.next();
        System.out.println("hola! "+nombre);
    }
    
    
}
