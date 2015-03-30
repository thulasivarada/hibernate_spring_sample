package com.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author t.varada.
 */
@Repository
@Transactional
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Employee> findAll(){
        return sessionFactory.getCurrentSession().createQuery("from Employee e").list();
    }

}
