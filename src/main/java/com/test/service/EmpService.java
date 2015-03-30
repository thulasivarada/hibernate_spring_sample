package com.test.service;

import com.test.dao.Department;
import com.test.dao.Employee;
import com.test.util.HibernateUtil;
import org.hibernate.Session;

/**
 * @author t.varada.
 */
public class EmpService {

    public static void createSampleDeptAndEmployee(){
        Employee employee = getSampleEmployee("varada","40106022");
        Employee employee1 = getSampleEmployee("chida","12345");
        Department department = getSampleDepartment("IT Dept" , "1");
        department.getEmployees().add(employee);
        department.getEmployees().add(employee1);
        employee.setDepartment(department);
        employee1.setDepartment(department);
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.saveOrUpdate(department);
        session.getTransaction().commit();
    }

    public static Employee getSampleEmployee(String name,String empid){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmpID(empid);
        return employee;
    }

    public static Department getSampleDepartment(String name,String depid){
        Department department = new Department();
        department.setName(name);
        department.setDeptId(depid);
        //department.getEmployees().add(employee);
        return department;
    }

    public static Department addEmployee(Department department ,Employee employee){
        department.getEmployees().add(employee);
        return department;
    }
}
