# Sobreescritura:
¿Recuerdas que en la herencia todos los metodos van a estar en las subclases?, si la logica de alguno de esos metodos no te sirven, tranquil@!, solo basta con usar la anotacion encima del metodo para indicar a java que vas a sobreescribir el metodo segun lo necesario en la subclase.

```
@Override
public void generarSonido(){

}
```

## La ultra-super-mega clase Object
Has visto cuando tratas de usar un atributo o método de tu clase que aparecen más metodos de los que hiciste, resulta que todas las clases que hacemos heredan de la clase Object, metodos como equals(), toString(), etc. pertenecen a la clase Object y de igual forma se pueden sobreescribir para cambiar su comportamiento

```
@Override
public String toString(){
    return "Soy el objeto";
}
```
