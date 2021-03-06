package laboratorioTiempo;


import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;



		


public class TiempoEJercicios {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		LocalDate ahora= LocalDate.now();
		LocalTime horas= LocalTime.now();
		Date date = new Date(110,3,25);
		Instant now2 =Instant.now();
		System.out.println(now2);
		System.out.println(date.getTimezoneOffset()+" timezoneoffset"); // NO IMPRIME NI DIA NI ZONA HORARIA
		Calendar calen= new GregorianCalendar(2020,2,12);
		System.out.println(calen.getTime()+" gregorian");
		LocalDate loca= LocalDate.of(2020, Month.APRIL, 15);
		loca=LocalDate.of(2020, 3, 12);
		System.out.println(loca.getMonth());
		//HORAS MINUTOS SEGUNDOS NANOSEG ACTUALES
		System.out.println(ahora);
		LocalDateTime compuesta = LocalDateTime.of(ahora, horas);
		System.out.println(compuesta);
		LocalDateTime actuali= LocalDateTime.now();
		System.out.println(actuali+" actuali"); //SI SE HACE EN DISTINTOS MOMENTOS DE LA EJECUCION DEL CODIGO
		//  HAY DIFERENCIA ENTRE EL TIEMPO OBTENIDO TRES LINEAS MAS ARRIBA PUESTO QUE LOS DOS USAN EL 
		//METODO now();
		Instant now1 =Instant.now();
		System.out.println(now1);
		
		Date mifecha=new Date();
		System.out.println(mifecha.getDate()+" HOY ES DIA DIEZ");
		System.out.println(mifecha.getYear()+" EL A�O DA 1900 MENOS");
		Calendar calendario= Calendar.getInstance(); // generando el objeto del objeto estatico calendar
		calendario.set(1980, 5, 16); // cambio la fecha 
//		System.out.println(calendario.getTimeZone());
		int anio= calendario.get(calendario.YEAR);
		System.out.println(anio+" calendario.YEAR despues de set(1980)"); //compruebo de que el a�o lo ha cambiado
		SimpleDateFormat miformato=new SimpleDateFormat("yyyy-M-dd HH:mm:ss !E ");
		Date d = Calendar.getInstance().getTime();
		miformato.format(d);
		System.out.println(d.toString()+" aqui hago un obejto date instancia de calendar to string");
		SimpleDateFormat miformato2=new SimpleDateFormat("MM-yyyy-dd ");//crear un patron de fechas
		System.out.println(miformato.format(mifecha).toString()+" fecha con formato toString"); //el patron funciona bien si el objeto es tipo Date??
		mifecha.setDate(24); // cambio el dia a proposito p�ra verificar si la premisa anterior es cierta
		System.out.println(miformato.format(calendario.YEAR)+" al haber cambiado con calendario.set pone la fecha 1970-1-1" ); // no admite el objeto calendario... tiene que ser date o calendario.DATE/
		//calendario. algo 
		System.out.println(miformato.format(Calendar.ALL_STYLES)+" esto es el allstyles");// 
		System.out.println(miformato.format(d).toString()+" fecha formateado a formato MMyyyydd hms E"); // comprobacion de que el formato funciona solamente con el Objeto Date
		System.out.println(anio);
		System.out.println(miformato2.format(mifecha)); //usando el formato 2 mes-a�o-dia
		SimpleDateFormat co= new SimpleDateFormat();
		System.out.println(co.getTimeZone());// imprime la zona...pero un chorizo 
//		co.setTimeZone(null);
		calendario.set(1990, 11, 31,0,0,0);
		System.out.println(calendario.ZONE_OFFSET);
		Calendar ej2 = new GregorianCalendar(1990,11,31);
//		ej2.set(1990, 11, 31, 00, 0, 0);
		System.out.println(ej2.getTime());
		Calendar calendario2= Calendar.getInstance();
		Date fecha= calendario2.getTime();
		System.out.println(fecha);
		calendario2.set(1992, 10-1, 14);
		 fecha= calendario2.getTime();
		SimpleDateFormat string = new SimpleDateFormat("dd-MM-yyyy m h W E M D");// SEMANA DEL MES = W
		// NOMBRE DEL DIA ABREVIADO=E, MES=M, NUMERO DE DIA DEL A�O = D; m= minuto; h= hora
		System.out.println(string.format(fecha));
		String fechaString= "02-6-2016";
		SimpleDateFormat formateo= new SimpleDateFormat("MM-dd-yyyy");//ESTO CREA EL FORMATO A DEVOLVER
		Date fechanueva=null;
		try {
			 fechanueva= formateo.parse(fechaString); //EL PARSEO SE TIENE QUE DEVOLVER SOBRE UN OBJETO
			 //TIPO DATE
		} catch (ParseException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		System.out.println(formateo.format(fechanueva)); //EL OBJETO DATE ES EL QUE SE PUEDE FORMATEAR AL 
			//FORMATO CREADO PREVIAMENTE
		
		final LocalDate now=LocalDate.now(); //COGE LA FECHA DE HOY SIN RELOJ, SOLO CALENDARIA
		System.out.println(now); 
		final LocalDate cumple1= LocalDate.of(2012, Month.AUGUST, 23);//AQUI SI PERMITE TIPO ENUMERADO Month.
		System.out.println(now.isBefore(cumple1));
		final LocalDate cumple2= LocalDate.of(2012, 8, 23);//LOCAL DATE NO EMPIEZA EN 0
		System.out.println(cumple2.isEqual(cumple1));
		boolean certeza= cumple2.isEqual(now); //PUEDO ALMACENARLA EN VARIABLES BOOLEANAS PARA LUEGO
		//USARLO EN UN IF CASE
//		Date cumpleformateado=compuesta.();
		//SI QUISIERA CAMBIARLE EL FORMATO DEVUELTO POR LOCALDATE
		////////////////////////////////////////////////////
		LocalDate pruebaFormato= LocalDate.now(); //HAY QUE IMPORTAR LA CLASE DATETIMEFORMATTER
		DateTimeFormatter formateador= DateTimeFormatter.ofPattern("G c  F ");//ESTABLECES EL PATRON
		//QUE  TE DE LA GANA, SIGUIENDO LAS NORMAS QUE DEBE CUMPLIR UN PATRON DE FECHAS
		/**
		 *  G       era                         text              AD; Anno Domini; A
   u       year                        year              2004; 04
   y       year-of-era                 year              2004; 04
   D       day-of-year                 number            189
   M/L     month-of-year               number/text       7; 07; Jul; July; J
   d       day-of-month                number            10

   Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
   Y       week-based-year             year              1996; 96
   w       week-of-week-based-year     number            27
   W       week-of-month               number            4
   E       day-of-week                 text              Tue; Tuesday; T
   e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
   F       week-of-month               number            3

   a       am-pm-of-day                text              PM
   h       clock-hour-of-am-pm (1-12)  number            12
   K       hour-of-am-pm (0-11)        number            0
   k       clock-hour-of-am-pm (1-24)  number            0

   H       hour-of-day (0-23)          number            0
   m       minute-of-hour              number            30
   s       second-of-minute            number            55
   S       fraction-of-second          fraction          978
   A       milli-of-day                number            1234
   n       nano-of-second              number            987654321
   N       nano-of-day                 number            1234000000

   V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
   z       time-zone name              zone-name         Pacific Standard Time; PST
   O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
   X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
   x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
   Z       zone-offset                 offset-Z          +0000; -0800; -08:00;

   p       pad next                    pad modifier      1

   '       escape for text             delimiter
   ''      single quote                literal           '
   [       optional section start
   ]       optional section end
   #       reserved for future use
   {       reserved for future use
   }       reserved for future use
   
   hay algunos que no pueden usarse.. da error como por ejemplo a , para saber si es AM o PM
		 */
		System.out.println(pruebaFormato.format(formateador)+" 1 VEZ");
		//SE PUEDE ALMACENAR EN UN STRING?? CREO QUE SI
		String fechafor= pruebaFormato.format(formateador);
		if (certeza==false) {
			System.out.println("hoy no es la fecha "+ cumple1);
			System.out.println((pruebaFormato.format(formateador)));
			System.out.println(fechafor);
		}
		
		System.out.println(ZoneId.getAvailableZoneIds());
		System.out.println(TimeZone.getTimeZone(fechafor));
	}
}
