package com.zpark.basic.spring;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        Date parse = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            parse = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
        }
        return parse;
    }
}
