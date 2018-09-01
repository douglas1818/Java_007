/*
se tiene la siguiente informacion: 
nombre de 4 empleados en cocepto de sueldo, cobrado por cada empleado en los utimos 3 meses
confeccionar el programa para:

a) realizar la carga de la informacion mencionada
b)generar un vector que contenga el ingreso acumulado  en sueldos en los ultimnos 3 meses para cada empleado
c) mostrar por pantalla el total pagado en sueldos a todos los empleados en los utimos 3 meses
d) obtener el nombre del empleado que tuvo el mayor ingreso acumulado 
 */
package java_007;
import java.util.Scanner;

public class Java_007 
{
private Scanner sc ;
private String[] empleados;
private int [][] sueldos;
private int []sueldostock;
    

    public void cargar()
    {
        Scanner sc = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int[4][3];
        
        for (int f = 0; f < empleados.length; f++)
        {
            System.out.println("Ingrese el nombre del empleado: ");
            empleados[f]=sc.next();
            for (int c = 0; c < sueldos.length; c++)
            {
                System.out.println("Ingrese sueldo: ");
                sueldos[f][c] = sc.nextInt();
            }
        }
    }
    
    public void calcularSumados()
    {
        sueldostock = new int [4];
        for (int f = 0; f < sueldos.length; f++) 
        {
            int suma = 0;
            for (int c = 0; c < sueldos[f].length; c++) {
                suma = suma +sueldos[f][c];
            }
        sueldostock[f] = suma;  
        }
    }
    
    
    public void imprimirTotalpagado ()
    {
        System.out.println("El total de sueldo pagado a los empleados es: ");
        for (int f = 0; f < sueldostock.length; f++)
        {
            System.out.println(empleados[f]+"-"+sueldostock[f]);  
        }
    }
    
    public void empleadoMayorsueldo()
    {
        int may = sueldostock[0];
        String nom = empleados[0];
        for (int f = 0; f < sueldos.length; f++) 
        {
            if (sueldostock[f]>may) 
            {
                may = sueldostock[f];
                nom = empleados[f];
            }
        }
        System.out.println("El empleado con mayor sueldo es: "+nom+" que tiene un sueldo de : "+may);
    }
    
    
    
    public static void main(String[] args)
    {
  Java_007 jv007 = new Java_007();
  jv007.cargar();
  jv007.calcularSumados();
  jv007.empleadoMayorsueldo();
  jv007.imprimirTotalpagado();
  
  
  
  
    }
    
}
