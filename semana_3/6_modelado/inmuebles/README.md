# Ejercicio inmuebles:
Se requiere realizar un programa que modele diferentes tipos de inmuebles.
Cada inmueble tiene los siguientes atributos: identificador inmobiliario (tipo
entero); área en metros cuadrados (tipo entero) y dirección (tipo String).
Los inmuebles para vivienda pueden ser casas o apartamentos. Los inmuebles
para vivienda tienen los siguientes atributos: número de habitaciones
y número de baños. Las casas pueden ser casas rurales o casas urbanas,
su atributo es la cantidad de pisos que poseen. Los atributos de casas rurales
son la distancia a la cabecera municipal y la altitud sobre el nivel del mar.
Las casas urbanas pueden estar en un conjunto cerrado o ser independientes.
A su vez, las casas en conjunto cerrado tienen como atributo el valor de
la administración y si incluyen o no áreas comunes como piscinas y campos
deportivos. De otro lado, los apartamentos pueden ser apartaestudios
o apartamentos familiares. Los apartamentos pagan un valor de administración,
mientras que los apartaestudios tienen una sola habitación.
Los locales se clasifican en locales comerciales y oficinas. Los locales
tienen como atributo su localización (si es interno o da a la calle). Los locales
comerciales tienen un atributo para conocer el centro comercial donde
están establecidos. Las oficinas tienen como atributo un valor boolean para
determinar si son del Gobierno. Cada inmueble tiene un valor de compra.
Este depende del área de cada inmueble según la tabla 4.2.

![tabla](./tabla.PNG)

Codigo de prueba

```
public static void main(String args[]) {
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,
    "Avenida Santander 45-45”,3,2,200000);
    System.out.println("Datos apartamento”);
    apto1.calcularPrecioVenta(apto1.valorArea);
    apto1.imprimir();
    System.out.println("Datos apartamento”);
    Apartaestudio aptestudio1 = new
    Apartaestudio(12354,50,”Avenida Caracas 30-15”,1,1);
    aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
    aptestudio1.imprimir();
}
```

para el método imprimir, considere colocar en consola todos los datos de cada instancia. Ejemplo:
```
public void imprimir() {
    System.out.println("Identificador inmobiliario = " +
    identificadorInmobiliario);
    System.out.println("Area = " + area);
    System.out.println("Dirección = " + direccion);
    System.out.println("Precio de venta = $” + precioVenta);
}
```

## Tips
- Considere los atributos valorArea y precioVenta para la clase inmueble
- el metodo calcularPrecioVenta() debe hacer uso del valorArea (segun la tabla) y el area del inmueble.
 