import java.util.Scanner;

/**
 * Clase con un único método main
 * 
 * @author ing.Carlos
 */
public class Runner
{
    
    /**
     * Punto de entrada de la aplicación o proyecto.
     * La contraseña para esta persona en este caso particular es: 1234
     * El saldo de la persona antes de hacer el retiro es de: $1'000.000
     * @param  args   un arreglo de argumentos tipo String, ej: {"1","hola"} 
     */
    public static void main(String[] args)
    {
        //Crear una instancia de Cajero:
        //Cajero cajeroMiBanco = new Cajero();
        //Asignar al objeto creado los valores necesarios para el problema
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el pin: ");
        int pin = input.nextInt();
        if (pin == 1234){
            System.out.print("Ingrese el monto a retirar: ");
            int monto = input.nextInt();
            //hacer uso del objeto tipo Cajero para realizar la operacion
            //de retirar
            
            System.out.println("El saldo disponible ahora es: ");
        } else {
            System.out.println("la contraseña es incorrecta!");
        }
        
    }
}
