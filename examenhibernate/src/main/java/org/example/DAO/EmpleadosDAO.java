package org.example.DAO;

import org.example.entities.Empleados;

import java.util.List;

public interface EmpleadosDAO {

    //Crea nuevos empleados en el metodo a lo bruto
    Empleados create(Empleados empleados);

    //Mostrar los empleados
    List<Empleados> findAll();
}
