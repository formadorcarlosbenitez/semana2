
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    //public double altura;
    //private int peso;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double calcularIMC(double altura, int peso)
    {
        double imc = peso/Math.pow(altura,2);
        return imc;
    }
    
    //public Persona(int pesoPersona){
    //    peso = pesoPersona;
    //}
    
    
}
