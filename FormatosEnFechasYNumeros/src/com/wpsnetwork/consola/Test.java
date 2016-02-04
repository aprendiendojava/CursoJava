package com.wpsnetwork.consola;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	/*
	 * @Deprecated --> Se utiliza cuando el m�todo est� en desuso.
	 * 
	 * @Override --> Se sobreescribe
	 * 
	 * .
	 * .
	 * .
	 * 
	 * Los metadatos son todas las anotaciones que modifican un objeto en java.
	 * 
	 * 
	 * Fechas
	 * ------
	 * La clase Date (java.util): guarda los milisegundos desde el 1/1/1970 (cuando sali� el sistema UNIX)
	 * Clases importantes en jdk8 y menores.
	 * Calendar -> Para manipular fechas
	 * 
	 * Se han a�adido en jdk8
	 * LocalDate -> Fecha
	 * LocalTime -> Hora
	 * LocalDateTime -> Fecha y hora
	 * ZonedDateTime -> como un LocalDateTime + zonas horarias (oracle no recomienda usarlo, a no ser que lo necesitemos)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main (String[] args){
		// Fecha y hora actual del sistema
		Date fecha = new Date();
		System.out.println("Fecha y hora actual: "+fecha);
		
		// sumar 6 segundos a la fecha
		fecha.setTime(fecha.getTime() + 6000);			// 6000 milisegundos que son 6 segundos.
		System.out.println("Fecha y hora actual mas seis segundos: "+fecha);
		
		fecha.setHours(5);
		System.out.println("Fecha y hora despu�s de setHours: "+fecha);
		
		// La clase Calendar nos ayuda a manipular Dates (todas utilizan el patr�n Builder)
		Calendar calendario = Calendar.getInstance();
		// Para los ingleses la semana empieza en domingo por lo que el 1=Domingo, el 2=lunes
		System.out.println("Primer d�a de la semana (en el calendario).: "+calendario.getFirstDayOfWeek());
		
		// En qu� zona horaria est� ubicado?
		System.out.println("Zona horaria: "+calendario.getTimeZone());
		
		// Cambiar una fecha en el calendario
		calendario.set(2016, Calendar.FEBRUARY, 28);
		System.out.println("Calendario: "+calendario);
		
		// A�adir un d�a
		calendario.add(Calendar.DAY_OF_YEAR, 1);
		System.out.println("Un d�a del a�o m�s: "+calendario.getTime());		// Detecta los a�os bisiestos, por lo que sale el 29 de Febrero
		calendario.setTime(fecha);
		System.out.println("Para saber el d�a de la semana: "+calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println("Fecha actual: "+calendario.getTime());
		
		// Clase TimeZone
		System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
		
		// Clase LocalDate s�lo almacena fechas (todas utilizan el patr�n Builder)
		LocalDate fecha2 = LocalDate.of(2016, Month.FEBRUARY, 28);
		System.out.println(fecha2);												// No tiene la hora
		
		// Manipular la fecha LocalDate
		fecha2= fecha2.plusDays(2);
		System.out.println(fecha2);
		
		
		
		
	}
	
}
