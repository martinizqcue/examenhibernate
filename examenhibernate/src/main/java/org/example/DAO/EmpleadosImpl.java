package org.example.DAO;

import org.example.Util.HibernateUtil;
import org.example.entities.Empleados;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmpleadosImpl implements EmpleadosDAO {

    @Override
    public List<Empleados> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Empleados> empleados = session.createQuery("from Empleados", Empleados.class).list();
        session.close();

        return empleados;
    }

    //Crea nuevos empleados a lo bruto en el metodo
    @Override
    public Empleados create(Empleados EmpleadosDAO){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //Transaccion
        session.beginTransaction();

        //Guarda en mi bbdd
        session.persist(EmpleadosDAO);


        //Commiteamos la transaccion
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();


        return EmpleadosDAO;

    }

}
