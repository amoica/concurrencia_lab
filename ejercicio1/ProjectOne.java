/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


/**
 *
 * @author Grupo 9
 */
public class ProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] Employees = new Employee[100];
        for(int i = 0; i < Employees.length;i++){
            Employees[i] = new Employee("Empleado" +i, 160, 20 + (i%5));
        }
        
        // Crear un pool ForkJoin y la tarea principal
        ForkJoinPool pool = new ForkJoinPool();
        EmployeeSalaryTask tarea = new EmployeeSalaryTask(Employees, 0, Employees.length);
        
        //Calcular el sueldo total de todos los empledos
        double totalSueldo = pool.invoke(tarea);
        System.out.println("Sueldo total de todos los empleados: "+totalSueldo);



        /*
         * Agregando Patron Proxy para control de acceso
         */

         // Crear un proxy de acceso
         SalaryTaskProxy proxyWithAccess = new SalaryTaskProxy(tarea, true);

         // Crear un ForkJoinPool y ejecutar la tarea a través del proxy
         ForkJoinPool pool2 = new ForkJoinPool();
         double totalSalario = pool.invoke(new RecursiveTask<Double>() {
            @Override
            protected Double compute(){
                return proxyWithAccess.computeSalary();
            }
         }); 
    }
}
