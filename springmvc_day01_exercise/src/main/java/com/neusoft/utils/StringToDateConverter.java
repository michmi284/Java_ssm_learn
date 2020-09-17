package com.neusoft.utils;

import org.springframework.core.convert.converter.Converter;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String,Date>
{

    @Override
    public Date convert(String source)
    {
        if (source ==null){
            throw new RuntimeException();
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    try
    {
        return df.parse(source);
    } catch (ParseException e)
    {
        throw new RuntimeException();
    }


    }
}
