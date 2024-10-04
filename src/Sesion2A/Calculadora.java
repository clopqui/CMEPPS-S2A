package Sesion2A;

public class Calculadora {
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static int resta(int a, int b){
        return a-b;
    }
    
    public static int multiplica(int a, int b){
        return a*b;
    }
    
    public static int divide(int a, int b){
        return (b==0)?-1:(a/b);
    }
}
