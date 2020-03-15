package org.springJavaAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Department {

    @Value("${deptName}")
    private String deptName;

    @Autowired
    private Date createdOn;

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}