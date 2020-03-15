package laboratorioTiempo;


import java.time.*;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;



		


public class TiempoEJercicios {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		LocalDate ahora= LocalDate.now();
		LocalTime horas= LocalTime.now();
		Date date = new Date(110,3,25);
		Instant now2 =Instant.now();
//		System.out.println(now2);
//		System.out.println(date.getTimezoneOffset()+" timezoneoffset"); // NO IMPRIME NI DIA NI ZONA HORARIA
		Calendar calen= new GregorianCalendar(2020,2,12);
//		System.out.println(calen.getTime()+" gregorian");
		LocalDate loca= LocalDate.of(2020, Month.APRIL, 15);
		loca=LocalDate.of(2020, 3, 12);
//		System.out.println(loca.getMonth());
		//HORAS MINUTOS SEGUNDOS NANOSEG ACTUALES
//		System.out.println(ahora);
		LocalDateTime compuesta = LocalDateTime.of(ahora, horas);
//		System.out.println(compuesta);
		LocalDateTime actuali= LocalDateTime.now();
//		System.out.println(actuali+" actuali"); //SI SE HACE EN DISTINTOS MOMENTOS DE LA EJECUCION DEL CODIGO
		//  HAY DIFERENCIA ENTRE EL TIEMPO OBTENIDO TRES LINEAS MAS ARRIBA PUESTO QUE LOS DOS USAN EL 
		//METODO now();
		Instant now1 =Instant.now();
//		System.out.println(now2); //
		
		Date mifecha=new Date();
//		System.out.println(mifecha.getDate()+" HOY ES DIA DIEZ");
//		System.out.println(mifecha.getYear()+" EL AÑO DA 1900 MENOS");
		Calendar calendario= Calendar.getInstance(); // generando el objeto del objeto estatico calendar
		calendario.set(1980, 5, 16); // cambio la fecha 
//		System.out.println(calendario.getTimeZone());
		int anio= calendario.get(calendario.YEAR);
//		System.out.println(anio+" calendario.YEAR despues de set(1980)"); //compruebo de que el año lo ha cambiado
	
		/////////////////EJ 1////////////////////////////
		
		SimpleDateFormat miformato=new SimpleDateFormat("yyyy-M-dd HH:mm:ss E ");
		Date d = Calendar.getInstance().getTime(); //tipo calendar
//		miformato.format(d); //FORMATEO LA FECHA DE AHORA A MIFORMATO es tipo calendar no date
		
//		System.out.println(d.toString()+" aqui hago un obejto date instancia de calendar to string");
		SimpleDateFormat miformato2=new SimpleDateFormat("MM-yyyy-dd ");//crear un patron de fechas
		System.out.println(miformato.format(mifecha).toString()+" fecha con formato toString"); //el patron funciona bien si el objeto es tipo Date??
		mifecha.setDate(24); // cambio el dia a proposito pàra verificar si la premisa anterior es cierta
//		System.out.println(miformato.format(calendario.YEAR)+" al haber cambiado con calendario.set pone la fecha 1970-1-1" ); // no admite el objeto calendario... tiene que ser date o calendario.DATE/
		//calendario. algo 
		System.out.println(miformato2.format(d)+" fecha calendar formato mes año dia");
//		System.out.println(miformato.format(Calendar.ALL_STYLES)+" esto es el allstyles");// 
		System.out.println(miformato.format(d).toString()+" fecha tipo calendar formateado a formato MMyyyydd hms E"); // comprobacion de que el formato funciona solamente con el Objeto Date
//		System.out.println(anio);
		System.out.println(miformato2.format(mifecha)+" fecha con formato MM-yyyy-dd"); //usando el formato 2 mes-año-dia
		SimpleDateFormat co= new SimpleDateFormat();
//		System.out.println(co.getTimeZone());// imprime la zona...pero un chorizo 
//		co.setTimeZone(null);
		calendario.set(1990, 11, 31,0,0,0);
		System.out.println(calendario.ZONE_OFFSET+ " zone offset");
		
		///////EJ 2//////////////////////////
		System.out.println();
		System.out.println("/////////////EJ 2//////////////");
		
		Calendar ej2 = new GregorianCalendar(1990,11,31);
//		ej2.set(1990, 11, 31, 00, 0, 0);
		System.out.println(ej2.getTime());
		System.out.println();	
		Calendar calendario2= Calendar.getInstance();
		Date fecha= calendario2.getTime();
//		System.out.println(fecha);
		calendario2.set(1992, 10-1, 14);
		 fecha= calendario2.getTime();
		SimpleDateFormat string = new SimpleDateFormat("dd-MM-yyyy m h W E M D");// SEMANA DEL MES = W
		// NOMBRE DEL DIA ABREVIADO=E, MES=M, NUMERO DE DIA DEL AÑO = D; m= minuto; h= hora
//		System.out.println(string.format(fecha)+" string.format(fecha)");
	
		
		////////////EJ 3////////////////////
		
		System.out.println("//////////////EJ 3//////////");
		String fechaString= "02-6-2016";
		SimpleDateFormat formateo= new SimpleDateFormat("MM-dd-yyyy");//ESTO CREA EL FORMATO A DEVOLVER
		Date fechanueva=null;
		try {
			 fechanueva= formateo.parse(fechaString); //EL PARSEO SE TIENE QUE DEVOLVER SOBRE UN OBJETO
			 //TIPO DATE
		} catch (ParseException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		System.out.println(formateo.format(fechanueva)); //EL OBJETO DATE ES EL QUE SE PUEDE FORMATEAR AL 
			//FORMATO CREADO PREVIAMENTE
		
		
		System.out.println();
		////////EJ 4 Y 5//////////////////////////
		System.out.println("/////////////////////EJ4 Y 5///////////////");
		final LocalDate now=LocalDate.now(); //COGE LA FECHA DE HOY SIN RELOJ, SOLO CALENDARIA
		System.out.println(now); 
		final LocalDate cumple1= LocalDate.of(2012, Month.AUGUST, 23);//AQUI SI PERMITE TIPO ENUMERADO Month.
		System.out.println(now.isBefore(cumple1));
		final LocalDate cumple2= LocalDate.of(2012, 8, 23);//LOCAL DATE NO EMPIEZA EN 0
		System.out.println(cumple2.isEqual(cumple1)+ " COMPARACION ENTRE DOS FECHAS IGUALES");
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
//		System.out.println(pruebaFormato.format(formateador)+" 1 VEZ");
		//SE PUEDE ALMACENAR EN UN STRING?
		String fechafor= pruebaFormato.format(formateador);
		if (certeza==false) {
			System.out.println("hoy no es la fecha "+ cumple1+"\nHOY ES "+now);
//			System.out.println((pruebaFormato.format(formateador)));
//			System.out.println(fechafor);
		}
		
		System.out.println();
		
		////////EJ 6/////////////////////
		
		System.out.println("//////////////////////////EJ 6");
//		System.out.println(ZoneId.getAvailableZoneIds());//ZONAS HORARIAS DISPONIBLES
//		System.out.println(TimeZone.getTimeZone(fechafor)+ " \nIndica la zona en la que estas");
		TimeZone canada= TimeZone.getTimeZone("Canada/Yukon");// RELACIONO LA ZONA HORARIA DE CANADA EN
		//UN OBJETO TIMEZONE
//		TimeZone.getTimeZone(canada);
		TimeZone.setDefault(canada);//ESTABLEZCO LA ZONA HORARIA DE CANADA OBTENIDA EN POR EL METODO GETTIMEZONE
		Date horaCanada= new Date(); //CREO UN OBJETO DATE PARA COMPROBAR LA HORA
		System.out.println(horaCanada+ " HORA DE CANADA AHORA"); //IMPRESION DE ESA HORA
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+1")); // VUELVO A LA ZONA HORARIA DE ESPAÑA
		Date horaEspania= new Date();
		System.out.println(horaEspania+ " HORA DE ESPAÑA AHORA"); //COMPROBACION DE QUE LA ZONA HORARIA ES LA DE ESPAÑA
		System.out.println();
		///////EJ 7 //////////////
		System.out.println("///////////////EJ7//////////");
		LocalDate d1 =  LocalDate.of(2020,3,8);
		LocalDate d2= LocalDate.of(2020, 3, 15);//los DIAS DE CUARENTENA QUE LLEVAMOS A DIA DE HOY 15 DE MARZO
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(ChronoUnit.DAYS.between(d1, d2)+ " DIAS DE DIFERENCIA ENTRE D1 Y D2");
		System.out.println();
		
		///////////////EJ 8//////////////////////
		System.out.println("/////////EJ8//////////");
		LocalDate hoy= LocalDate.now();
		System.out.println(hoy);
		LocalDate pasadomanana= ChronoUnit.DAYS.addTo(hoy, 3);
		System.out.println(pasadomanana);
		LocalTime ahora2= LocalTime.now();
		System.out.println(ahora2);
		LocalTime ahora3 =ahora2.plusHours(1);
		System.out.println(ahora3);
		
		System.out.println(ChronoUnit.DAYS.between(hoy, pasadomanana));
		System.out.println();
		
		//////EJ 9////////////////////
		System.out.println("/////////////EJ9/////////");
		LocalTime start= LocalTime.of(1,0, 0);
		LocalTime end= LocalTime.of(2,10,20);
		System.out.println(ChronoUnit.HOURS.between(start, end)+ " horas de diferencia");
		System.out.println(ChronoUnit.MINUTES.between(start, end)+ " minutos diferencia");
		System.out.println(ChronoUnit.SECONDS.between(start, end)+" segundos diferencia");
		System.out.println(ChronoUnit.MILLIS.between(start, end)+ " milisegundos");
		
		System.out.println(ChronoUnit.MICROS.between(start, end) +" microsegundos");
		System.out.println(ChronoUnit.NANOS.between(start, end)+ " nanosegundos ");
		System.out.println();
		
		
		/////EJ 10///////////////
		System.out.println("////////////EJ 10/////////////");
		TimeZone asiak= TimeZone.getTimeZone("Asia/Kolkata");
		TimeZone.setDefault(asiak);
		Date asio= new Date();
		System.out.println(asio+ " LA HORA DE ASIA/KOLKATA");
		//PERMITE HACERSE DE LAS DOS MANERAS, COGIENDO DIRECTAMENTE LA ZONA HORARIA MEDIANTE
		//EL STRING ID CORRESPONDIENTE Y LUEGO ASIGNANDOLO A LA ZONA POR DEFECTO MEDIANTE
		//EL METODO ESTATICO SETDEFAULT
		// O SE PUEDE REALIZAR MEDIANTE UN OBJETO ZONEID, TAMBIEN REQUIERE QUE 
		//EL STRING SEA UN ID VALIDO DE LOS ZONEID DISPONIBLES 
//		System.out.println(ZoneId.getAvailableZoneIds());
		//SERIA INTERESANTE CON UN PATRON OBTENER LAS ZONAS HORARIAS QUE INCLUYAN 
		//EL PATRON ... YA QUE LA LISTA DE ZONAS ES LARGUIIIIIIISIMA
		ZoneId japonio= ZoneId.of("Japan");
		TimeZone japones= TimeZone.getTimeZone(japonio);
		Date japo= new Date();
		TimeZone.setDefault(japones);
		System.out.println(japo+ " LA HORA DE JAPON");
		System.out.println();
		
		///////////EJ 11////////////////////////////
		System.out.println("/////////////EJ 11/////////////");
		LocalTime HoraJaponesa=  LocalTime.now();
		System.out.println(HoraJaponesa+ " HORA JAPON");
		//establezco la hora de españa  con un objeto timezone para poder reutilizarlo
		//si fuese necesario (se podria  haber hecho antes)
		TimeZone espania= TimeZone.getTimeZone("GMT+1");
		TimeZone.setDefault(espania);
		LocalTime horaEspa= LocalTime.now(); //se podria haber usado cualquier objeto 
		//hecho de los ejercicios previos como horas DEL EJ1
		System.out.println(horaEspa+ " HORA ESPAÑA");
		// sin usar un objeto timezone
		//TimeZone.setDefault(TimeZone.getTimeZone("GMT+1"));
		
		//la diferencia horaria es el intervalo de horas entre una zona 
		//y otra... 
		System.out.println("HAY " +ChronoUnit.HOURS.between(HoraJaponesa, horaEspa)+ " => HORAS  EN ESPAÑA");
		
		
		
	}
}
