package com.test.main;

import com.test.dao.Employee;
import com.test.dao.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author t.varada.
 */
public class SpringHiberMain {
    public static void main(String[] args) throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        EmployeeDAO employeeDAO = applicationContext.getBean(EmployeeDAO.class);
        List<Employee> employees = employeeDAO.findAll();
        for(Employee employee:employees){
            System.out.println(employee.getName());
        }
    }
}
