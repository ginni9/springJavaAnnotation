package org.springJavaAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {


        @Autowired
        Department department;

        @Value("${name}")
        private String name;
        @Value("${age}")
        private Integer age;
        @Value("${salary}")
        private Double salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", department=" + department +
                    '}';
        }
}
