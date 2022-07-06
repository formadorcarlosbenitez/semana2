# Ejercicio, venta de calzado:
Unn vendedor de calzado de la ciudad de Bucaramanga, realiza ventas a establecimientos donde gana por par vendido, sin embargo siempre anota en una vieja libreta el calzado vendido para sacar la comision.
El jefe del vendedor necesita en tiempo real cuantos pares de zapatos se han vendido. El sabe que tienes una empresa de desarrollo de software, te pide realizar una app.
La app realiza el calculo de comision segun el calzado para caballero (mocasin, zapatilla bota) y para dama (sandalia y tacon). Los precios del calzado es como sigue:
- mocasin $55.000, comision de venta: $3.500 (caballero)
- zapatilla $80.000, comision de venta: $4.200 (caballero)
- bota $90.000, comision de venta: $4.500 (caballero)
- sandalia $50.000, comision de venta: $2.500 (dama)
- tacon $120.000, comision de venta: $5.000 (dama) </br>
A todo el calzado que sea de caballero se le suma una comision de $200, al calzado de dama vendido se suma una comision adicional de $300.
En la app se plantean dos superclases, Calzado y Persona, donde la clase Vendedor hereda de Persona, el vendedor tiene atributos totalEnVentas y totalComisiones, ademas, tiene un metodo venderCalzado(Calzado c) para agregar la comision y el precio de venta en el vendedor.
La clase persona tiene atributos nombres, apellidos y cedula.

## Actividades a desarrollar
1. Realiza el UML del ejercicio
2. Define cuales clases son abstractas y cuales deben ser concretas (Simplemente no abstractas).
3. Ejecuta el siguiente código de prueba

```
        Vendedor vendedor1 = new Vendedor();
        Calzado mocasin = new Mocasin();
        Calzado sandalia = new Sandalia();
        vendedor1.venderCalzado(mocasin);
        vendedor1.venderCalzado(sandalia);
        vendedor1.imprimirGanancias();
        vendedor1.imprimirVentas();
```
## Tips
- Trata de extraer cuantas y cuales clases necesitas crear
- Relaciona las clases
- Pista: El ejercicio tiene dos superclases: Persona y Calzado. Empieza a realizar herencias de ahí para abajo
- Trata de crear paquetes para separar clases