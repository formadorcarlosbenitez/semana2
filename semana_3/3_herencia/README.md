# Herencia:
Es aquí donde se implementa uno de los 4 pilares de la programación orientada a objetos (Jerarquizar). La herencia permite desarrollar arboles de jerarquia donde existe una superclase y las subclases reciben los miembros (atributos o metodos) implementados en la superclase.
Que no asuste la superclase, solo es un nombre.
Gracias a la herencia se puede realizar estandarización y reduccion de código.

![diagrama](./diagram.png)

## Superclase:
Solo es una clase que tiene varios métodos y atributos para ser implementados en común para diferentes subclases.

## Subclase:
Es una clase que usa la palabra reservada extends, quiere decir que la subclase extiende sus atributos y métodos según la superclase a usar.
Un ejemplo de herencia puede ser:
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
Ahora la clase perro hereda los atributos alimentarse y generarSonido.

## Pasos a seguir para identificar herencias
Supongamos que en nuestro proyecto existen varias clases que aun no estan relacionadas:


Los pasos a seguir son los siguientes:
1. Revisar que tienen las clases en común.
2. Crear una clase que contenga esos métodos y atributos en común.
3. Enlazar las clases para que hereden de la clase del paso 2. (extends)


