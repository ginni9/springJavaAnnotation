package org.springJavaAnnotation;

import org.springJavaAnnotation.beans.Employee;
import org.springJavaAnnotation.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp1 = context.getBean(Employee.class);
        System.out.println(emp1.toString());
    }
}
