# Ejercicio Cuenta Bancaria:

## Enunciado
Se encuentra trabajando para un Banco, le entregan una clase con los datos necesarios para que la clase funcione en el microservicio del banco, debe entregar la clase Persona con la lógica implementada teniendo en cuenta que:

El método ingreso debe sumar a los fondos disponibles de la cuenta bancaria.
El método egreso debe restar una cantidad a los fondos disponibles de la cuenta bancaria. 
El método checkFondos verifica en cada movimiento que los fondos no sean negativos.
El método imprimirMovimiento imprime cada vez que se realiza un movimiento.
El método transferTo transfiere el dinero de una cuenta a otra.

### Clase Persona
```
protected int numeroCuenta;
protected char tipoCuenta; // 'A' ahorros, 'C' corriente
protected float fondos;
protected int cedula;
protected String apellidos;

public Cuenta(int numeroCuenta, char tipoCuenta, float fondos, int cedula, int apellidos){

}

public float ingreso(float cantidad){

}

public float egreso(float cantidad){
    
}

public boolean checkFondos(){

}

public boolean transferTo(Persona: account, float cantidad){

}

public void imprimirMovimiento(){
    System.out.println("Cuenta[numero: "+numeroCuenta+", fondos: "+fondos+" , apellidos cliente"+apellidos+"]");
}
```

## Actividades a realizar

1. Cree un proyecto de Bluej o Netbeans.
2. Realice la lógica de los metodos para que funcionen de acuerdo al enunciado.
3. Cree una clase App que solo tenga un método main.
5. Agregue el código de prueba en el método main.

## Extras
- Codigo de prueba (dentro de un método main):
```
Persona persona1 = new persona(123456, 'A', 5000000, 100200300, "Torres C.");
Persona persona2 = new persona(654321, 'A', 2200000, 999999, "Rodriguez P.");
a1.ingreso(750000);
a1.egreso(4200000);
a1.egreso(4200000);  // egreso() error

// Test transfer()
a1.transferTo(a2, 800000); 
```
- ¿Como representaria en varias clases el ejercicio? desarrolle el codigo para dividir el codigo en clases según corresponda. (Pista: puede dividir la clase Persona en las clases Cuenta y Persona)