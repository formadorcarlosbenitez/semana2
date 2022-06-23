import java.util.Scanner;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //crear una instancia de la clase que creo para el ejercicio
        
        System.out.print("Ingrese su estatura: ");
        float estatura = input.nextFloat();
        //asignar estatura al objeto
        
        System.out.println("Ingrese su peso: ");
        int peso = input.nextInt();
        //asignar peso al objeto
        
        System.out.println("El resultado de su IMC es: ");
        //llamar el metodo del objeto para imprimir el resultado
        
    }
}
