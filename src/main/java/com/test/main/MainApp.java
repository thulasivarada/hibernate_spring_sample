package com.test.main;

import com.test.dao.Employee;
import com.test.service.EmpService;

/**
 * @author t.varada.
 */
public class MainApp {
    public static void main(String[] args) {
        EmpService.createSampleDeptAndEmployee();
    }
}
