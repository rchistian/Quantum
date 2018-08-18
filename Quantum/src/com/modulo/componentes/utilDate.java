package com.modulo.componentes;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class utilDate {

	public utilDate(){}
	
	
	public static java.sql.Date Fecha(){
	   java.util.Date FechaActual = new java.util.Date();
	   java.sql.Date ff = new java.sql.Date(FechaActual.getTime());
	   return ff;
	}
	
	
	public static java.sql.Time Hora(){
 	   java.util.Date FechaActual = new java.util.Date();
 	   java.sql.Time hh = new java.sql.Time(FechaActual.getTime());
	   return hh;
	}
	
	
	public static String FormatoFecha(java.util.Date Fecha, String Formato){
		DateFormat df=new SimpleDateFormat(Formato);
		return df.format(Fecha);
	}	
    
    public static Date CalculoFecha(Date date, int Dias) {  
        Calendar calendarDate = Calendar.getInstance();  
        calendarDate.setTime(date);  
        calendarDate.add(Calendar.DAY_OF_MONTH, Dias); 
        
        java.sql.Date ff = new java.sql.Date(calendarDate.getTime().getTime());
        //System.out.println(date.toString() + " " + ff.toString());
        return ff;  
    }  
    
    public static int getAnio(Date Fecha){
    	return Integer.valueOf(FormatoFecha(Fecha,"yyyy"));
    }
    
    public static int getMes(Date Fecha){
    	return Integer.valueOf(FormatoFecha(Fecha,"MM"));
    }
    
    public static int getDia(Date Fecha){
    	return Integer.valueOf(FormatoFecha(Fecha,"dd"));
    }
    
    public static java.sql.Timestamp FechaHora(){
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(javaTime);
        return sqlTimestamp;
    }
    
    public static java.sql.Timestamp DateToTimestamp(java.util.Date Fecha){
    	if(Fecha!=null){
    	   java.sql.Timestamp Fecha01 = new java.sql.Timestamp(Fecha.getTime());
           return Fecha01;
    	}else{
    	   return null;
    	}
    }	
}
