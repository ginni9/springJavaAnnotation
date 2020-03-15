package org.springJavaAnnotation.converter;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConverter implements FactoryBean<Date> {

    @Value("${datePattern}")
    String datePattern;
    @Value("${dateInput}")
    String dateInput;



    @Override
    public Date getObject() throws ParseException {
        return new SimpleDateFormat(datePattern).parse(dateInput);
    }

    @Override
    public Class<?> getObjectType()
    {
        return java.util.Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
