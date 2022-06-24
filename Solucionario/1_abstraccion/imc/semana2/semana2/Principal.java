import java.util.Scanner;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
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
        //Persona persona1 = new Persona(peso);
        //persona1.peso = peso;
        //persona1.altura = estatura;
        
        double imc = Persona.calcularIMC(estatura,peso);
        System.out.println("El resultado de su IMC es: " + imc);
        //llamar el metodo del objeto para imprimir el resultado
        
    }
}
