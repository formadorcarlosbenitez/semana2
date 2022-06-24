package Banco;

public class Cajero
{ 
    int saldoInicial;
    int monto;
    
    public int calcularDescuento(){
        int saldoActual = saldoInicial - monto;
        return saldoActual;
    }
    
    public void imprimir(){
        System.out.println("El monto a retirar es: " + monto);
    }
    
    
}
