package org.example;


import org.example.DAO.EmpleadosImpl;
import org.example.entities.Empleados;

public class Main {
    public static void main(String[] args) {

        //Llamo al metodo de crear empleados
        Empleados empleados1 = new Empleados(null, "Martin", "martin@gmail.com","DAM");
        Empleados empleados2 = new Empleados(null, "Lucas", "Lucas@gmail.com","DAW");

        EmpleadosImpl empleadosDAO = new EmpleadosImpl();

        empleadosDAO.create(empleados1);
        empleadosDAO.create(empleados2);



        System.out.println("Empleados: " + empleadosDAO.findAll());


    }
}