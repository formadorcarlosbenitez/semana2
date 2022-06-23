
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    
    /**
    * Altura del animal en metros
    */
    double altura;
    /**
    * Peso del animal en kilogramos
    */
    float peso;
    /**
    * IMC del animal
    */
    float imc;
    
    /**
     * Constructor para objetos de tipo Perro
     */
    public Perro(double alturaPerro, float pesoPerro)
    {
        altura = alturaPerro;
        peso = pesoPerro;
    }

    /**
     * Método para calcular en indice de masa corporal
     * 
     * @return     Indice de masa corporal [kg/m^2]
     */
    public double calcularIMC()
    {
        return peso/Math.pow(altura,2);
    }
}
