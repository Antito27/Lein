

package misprimerospasosenJAVA;
import.java.util.Scanner;
/**
 *<>[]
 * @author CEN_L1
 */
public class ejerciciodeSwitch {
    public static void main(String[] args) {
        
        System.out.println("ingresa un simbolo(+,-,*):");
        Scanner entrada = new Scanner(System.in);
        String sim = entrada.nextLine();
        int n1 = 3;
        int n2 = 7;

        switch (sim) {
            case ("+"):
                System.out.println("Seleccionaste la opción 1." + (n1 + n2));
                break;
            case ("-"):
                System.out.println("Seleccionaste la opción 2." + (n1 - n2));
                break;
            case ("*"):
                System.out.println("Seleccionaste la opción 3." + (n1 * n2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
}
    

