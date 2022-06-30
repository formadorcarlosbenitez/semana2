# Polimorfismo:
Es un concepto que aplica solo cuando hay herencia. Indica que una instancia puede tener varios (poli) tipos. Por ejemplo, tenemos las siguientes clases: 

```
public class Animal{
    void alimentar(){}
    void generarSonido(){}
}
```
```
public class Perro extends Animal{

}
```
Para crear una instancia de perro en el metodo main normalmente se hace así:
```
public class Main{
    public static void main(String[] args){
        Perro firulais = new Perro();
    }
}
```
Nada del otro mundo, ya sabiamos crear instancias (u objetos que es lo mismo), sin embargo, el polimorfismo permite tener el tipo de la variable (en este caso firulais) difente al tipo del objeto que se le está asignando, asi: 
```
public class Main{
    public static void main(String[] args){
        Animal firulais = new Perro();
    }
}
```
Debido a la herencia se puede usar la superclase como tipo. Si suponemos que se quieren guardar varios objetos en un array pero son de diferente tipo, el polimorfismo nos permite hacer:
```
public class Main{
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0] = new Perro();
        animals[1] = new Gato();
        animals[2] = new Leon();

    }
}
```
A pesar de que los objetos son de diferente tipo, dado que todos heredan de Animal, se pueden tratar como un solo tipo. </br>
Eso no es todo, las entradas y salida de un método tambien pueden aplicar el polimorfismo. Por ejemplo:

```
public class Cazador{
    public void disparar(Animal animal){
        animal.generarSonido();
    }
    public static void main(String[] args){
        Cazador cazador = new Cazador();
        Leon leon = new Leon();
        Perro perro = new Perro();
        cazador.disparar(leon);
        cazador.disparar(perro);
    }
}
```
Aunque es cruel, es una simulación, el cazador al disparar hace que todo objeto que herede de animal llame el metodo generarSonido(), por lo tanto en el argumento del metodo disparar se aplica el concepto de polimorfismo.

