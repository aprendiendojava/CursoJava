package com.wpsnetwork.consola;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test {

	/*
	 * @Deprecated --> Se utiliza cuando el método está en desuso.
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
	 * La clase Date (java.util): guarda los milisegundos desde el 1/1/1970 (cuando salió el sistema UNIX)
	 * Clases importantes en jdk8 y menores.
	 * Calendar -> Para manipular fechas
	 * 
	 * Se han añadido en jdk8
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
		System.out.println("Fecha y hora después de setHours: "+fecha);
		
		// La clase Calendar nos ayuda a manipular Dates (todas utilizan el patrón Builder)
		Calendar calendario = Calendar.getInstance();
		// Para los ingleses la semana empieza en domingo por lo que el 1=Domingo, el 2=lunes
		System.out.println("Primer día de la semana (en el calendario).: "+calendario.getFirstDayOfWeek());
		
		// En qué zona horaria está ubicado?
		System.out.println("Zona horaria: "+calendario.getTimeZone());
		
		// Cambiar una fecha en el calendario
		calendario.set(2016, Calendar.FEBRUARY, 28);
		System.out.println("Calendario: "+calendario);
		
		// Añadir un día
		calendario.add(Calendar.DAY_OF_YEAR, 1);
		System.out.println("Un día del año más: "+calendario.getTime());		// Detecta los años bisiestos, por lo que sale el 29 de Febrero
		calendario.setTime(fecha);
		System.out.println("Para saber el día de la semana: "+calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println("Fecha actual: "+calendario.getTime());
		
		// Clase TimeZone
		System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
		
		// Clase LocalDate sólo almacena fechas (todas utilizan el patrón Builder)
		LocalDate fecha2 = LocalDate.of(2016, Month.FEBRUARY, 28);
		System.out.println(fecha2);												// No tiene la hora
		
		// Manipular la fecha LocalDate
		// Dias
		fecha2= fecha2.minusDays(2);
		fecha2= fecha2.plusDays(2);
		
		// Semanas
		fecha2 = fecha2.plusWeeks(1);
		System.out.println(fecha2);

		// Días de....
		System.out.println("Día de la semana: "+fecha2.getDayOfWeek());
		System.out.println("Día del mes: "+fecha2.getDayOfMonth());
		System.out.println("Día del año: "+fecha2.getDayOfYear());
		System.out.println("Mes: "+fecha2.getMonth());
		System.out.println("Año: "+fecha2.getYear());

		// Clases Period (más grande de un día) y Duration (mas pequeño que el día)
		// Period -> Permite almacenar un intervalo de tiempo igual o superior a días
		Period anual = Period.ofYears(1);
		
		fecha2 = fecha2.plus(anual);
		System.out.println("Le hemos sumado un año: "+fecha2);
		
		
		// Duration -> Permite almacenar un intervalo de tiempo inferior a un día
		Duration duracion = Duration.ofHours(1);
		Duration duracion2 = Duration.of(1, ChronoUnit.HOURS);
		LocalTime hora = LocalTime.now();				// Hora actual del sistema
		System.out.println("Son las "+hora);
		hora = hora.minus(duracion);
		System.out.println("Restamos una hora: "+hora);
		
		LocalDate fecha_actual = LocalDate.now(); 			// Fecha actual
		LocalDate  fecha_antigua = fecha_actual.minusDays(1);
		LocalDate fecha_futura = fecha_actual.plusDays(1);

		System.out.println("Resultado comparación = "+fecha_actual.isAfter(fecha_antigua));
		System.out.println("Resultado comparación = "+fecha_actual.isBefore(fecha_antigua));
		System.out.println("Resultado comparación = "+fecha_actual.isBefore(fecha_futura));
		
		// Horas
		//-------
		// LocalTime -> Almacena horas, minutos y segundos
		LocalTime horaActual = LocalTime.now();			// Hora actual
		LocalTime hora2 = LocalTime.of(11, 10, 55);
		System.out.println("Hora actual: "+horaActual);
		System.out.println("He dicho que son las "+hora2);
		
		// Manipular tiempos (horas)
		hora2 = hora2.plusHours(1);
		System.out.println("Mas una hora: "+hora2);
		
		// LocalDateTime -> Almacena día y hora
		//--------------
		LocalDateTime fechaHora = LocalDateTime.of(2016, Month.FEBRUARY, 28, 12, 30, 55);
		System.out.println("Escribo la fecha y la hora: "+fechaHora.toString().replace("T", " "));		// Cambio la T que sale en medio por un espacio
		
		// Convertir de Date a LocalDate
		Date fechaA = new Date();
//		long milis = fechaA.getTime();		// Obtenemos sus milisegundos desde 1/1/1970
		Instant instanteDate = fechaA.toInstant();
		LocalDateTime fechaConvertida = LocalDateTime.ofInstant(instanteDate, ZoneId.systemDefault());
		System.out.println("Fecha Convertida: "+fechaConvertida.toString().replace("T", " "));
		
		// Convertir de LocalDate a Date
//		long milis = fecha_actual.toEpochDay();
		Instant instante = fechaConvertida.toInstant(ZoneOffset.UTC);
//		Date fechaDate = new Date (milis*1000*60*60*24);
		Date fechaDate = Date.from(instante);
		System.out.println("Conversión LocalDate -> Date: "+fechaDate);
		
		
		// Formateo de fechas según Locale
		// Para antes del jdk7 se utilizaba la clase  DateFormat, SimpleDateTimeFormat
		// Para después se utiliza DateTimeFormatter.
		
		// JDK7 o anterior
		//----------------
		DateFormat df= DateFormat.getDateInstance();
		String fechaString = df.format(new Date());
		System.out.println("Fecha en formato texto: "+fechaString);
		
		try {
			fechaDate = df.parse("10-ene-2016");
			System.out.println("La ponemos en modo Date: "+fechaDate);
		} catch (ParseException e) {
			System.out.println("Peta.");
			e.printStackTrace();
		}
		
		// Para el DateFormat hay que saber el formato que tiene en Locale
		SimpleDateFormat dfs = new SimpleDateFormat("dd/MMMM/yyyy HH:mm");
		System.out.println("La fecha con el formato que pusimos: "+dfs.format(new Date()));
		
		
		// JDK8
		System.out.println("Fecha ISO_LOCAL_DATE: " + fecha_actual.format(DateTimeFormatter.ISO_LOCAL_DATE));
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Con formato predefinido: " + fecha_actual.format(dtf));
		
		// si no nos gustan los formatos predefinidos, pues lo creamos con el patrón
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println("Con un patrón nuestro: "+fecha_actual.format(dtf1));
		
//		dtf.parse("01/enero/2016");
		LocalDate fechaN = LocalDate.from(dtf1.parse("01/enero/2016"));
		System.out.println("fechaN: "+fechaN);
		
		// Formatear Números y Monedas
		// ----------------------------

		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println("NumberInstance="+nf.format(1000.23));

		nf = NumberFormat.getCurrencyInstance();
		NumberFormat nfe = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("NumberCurrency="+nf.format(1000.234454));
		System.out.println("NumberCurrency en inglés="+nfe.format(1000.234454));
		
		// Parse
		try {
			double numero = (Double) nf.parse("23,55 €");
			System.out.println("Le quito el formato y lo convierto en número = "+numero);
		} catch (ParseException e) {
			System.out.println("Peta.");
			e.printStackTrace();
		}
		
		//DTO con wrapper del dao
	}
	
}
