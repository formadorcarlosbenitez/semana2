# Mapas:


## Ejemplo de mapa que guarda Strings.
```
HashMap<String,String> mapa = new HashMap<>();
```

Veamos la jerarquia de clases e interfaces que implementan los conjuntos:

![uml](./uml.png)

Los mapas a pesar de que son colecciones, no heredan de la interfaz Collection, sin embargo, lo que los hace diferente solo es una cosa, se puede cambiar el tipo de los indices. Recordemos que para acceder a un elemento de un array o una lista es necesario indicar con un numero entero cual elemento queremos obtener (ej: lista.get(1) o array[1] ), con los maps vamos a acceder segun el tipo de indice que indicamos en el primer campo del generico < KEY, VALUE >, para un indice string KEY seria String, y para guardar valores Strings VALUE seria String.

```
mapa.put("Juana", "Calle 123");
mapa.put("Juana", "Calle 555");
mapa.put("Lola", "Calle 233");
```
Solo usamos el metodo put() en vez de add() para agregar un elemento al mapa, en este caso los indices son nombres y los valores son direcciones. Solo valos a tener dos valores ya que al indicar un indice que ya esta, Java reemplaza los valores y deja en este caso, un solo indice "Juana".