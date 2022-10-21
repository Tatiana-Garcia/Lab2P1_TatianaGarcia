
package lab2p1_tatianagarcia;

import java.util.Scanner;

public class Lab2P1_TatianaGarcia 
{

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int opcion; //opcion para el do while y los if 
        
        do{
            
            System.out.println(" ");
            System.out.println("--> Menu <--");
            System.out.println("l -> Maximo comun divisor");
            System.out.println("2 -> Sumatoria");
            System.out.println("3 -> Supermercado");
            System.out.println(" ");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt(); 
            
            if (opcion == 1)
            {// Opcion 1
                System.out.println(" ");
                System.out.println("--> Maximo comun divisor <--");
                System.out.println("Ingresar el 1er numero: ");
                int A = leer.nextInt();
                System.out.println("Ingrese el 2ndo numero: ");
                int B = leer.nextInt();
                
                if (A < 1 || B < 1)
                {
                    System.out.println(" ");
                    System.out.println(">> Los números ingresados deben ser positivos.");
                }
                else 
                {
                    System.out.println(" ");
                    System.out.print(">> El MCD de " + A + " y " + B + " es: ");
                    
                    while (A != B)
                    {//while
                        if (A>B)
                        {
                            A = A - B;
                        }
                        else if (A<B)
                        {
                            B = B - A;
                        }
                    }//fin del while
                    System.out.println(A);
                    
                }// fin del else
                  
            }//Fin de la opcion 1
            
            else if (opcion == 2)
            {
                
                System.out.println(" ");
                System.out.println("--> Sumatoria <--");
                double n = 1; // contador 
                System.out.println("Ingrese el limite para la sumatoria: ");
                double K = leer.nextInt(); //limite
                double total = 0.00;
                double base;
                
                if (K < 1)
                {
                    System.out.println(" ");
                    System.out.println(">> El valor del limite de ser positivo");
                }// fin del if
                
                else 
                {
                    while(n <= K)
                    {
                        base = ((double)n/(double)(n+1.0));
                        total +=(double) Math.pow(base,n);
                        n++;
                    }
                    System.out.println(" ");
                    System.out.println(">> La sumatoria de " + K + " es: " + total);
                    
                }//fin del else
                
            }//Fin de la opcion 2
            
            else if (opcion == 3)
            {
                System.out.println(" ");
                System.out.println("--> Supermercado <--");
                System.out.println("Ingresar el tipo de cliente: ");
                double cliente = leer.nextInt();
                System.out.println("Ingresar el precio de la unidad del producto: ");
                double precio = leer.nextDouble();
                System.out.println("Ingresar la cantidad del producto que lleva el cliente: ");
                double cantidad = leer.nextDouble();
                double descuento, subtotal;
                double total = 0.00;
                
                System.out.println(" ");
                if (cliente == 0)
                {
                    
                    if (cantidad >= 10 && cantidad <= 19)
                    {
                        System.out.println(">> El cliente se lleva dos productos gratis");
                        cantidad = cantidad - 2;
                        
                    }
                    else if (cantidad >20)
                    {
                        System.out.println(">> El cliente se lleva cinco productos gratis");
                        cantidad = cantidad - 5;
                    }
                    
                    subtotal = cantidad * precio;
                    descuento = subtotal * 0.00;
                    total = subtotal - descuento;
                    
                }//fin del if cliente 0
                
                else if (cliente == 1)
                {
                    if (cantidad >= 20 && cantidad <= 29)
                    {
                        System.out.println(">> El cliente se lleva dos productos gratis");
                        cantidad = cantidad - 2;
                        
                    }
                    else if (cantidad > 30)
                    {
                        System.out.println(">> El cliente se lleva cinco productos gratis");
                        cantidad = cantidad - 5;
                    }
                    
                    subtotal = cantidad * precio;
                    descuento = subtotal * 0.10;
                    total = subtotal - descuento;
                }//else if cliente 1
                
                else if (cliente == 2)
                {
                    if (cantidad >= 30 && cantidad <= 39)
                    {
                        System.out.println(">> El cliente se lleva dos productos gratis");
                        cantidad = cantidad - 2;
                        
                    }
                    else if (cantidad >40)
                    {
                        System.out.println(">> El cliente se lleva cinco productos gratis");
                        cantidad = cantidad - 5;
                    }
                    
                    subtotal = cantidad * precio;
                    descuento = subtotal * 0.30;
                    total = subtotal - descuento;
                }//else cliente 2
                
                else 
                {
                    System.out.println(">> Tipo de cliente no valido ");
                }
                
                System.out.println(">> El cliente debe pagar: " + total);
                
            }//fin de la opcion 3
            else if (opcion == 4)
            {
                System.out.println(" ");
                System.out.println("Saliendo...");
            }
            
        }while (opcion != 4);
        
    }//Fin del main
    
}//Fin de la clase 
