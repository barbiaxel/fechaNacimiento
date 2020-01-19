package fechaNacimiento;

import java.io.*;
import java.util.*;
class test {
	public static int edad (String fecha_nac) {
	
		// formato fecha_nac dd/mm/yyyy
		Date hoy = new Date( );
		//fecha actual
		String[ ] tokens = fecha_nac.split("/");
		GregorianCalendar cal = new GregorianCalendar (Integer.parseInt
				(tokens[2]), Integer.parseInt(tokens[1])-1, Integer.parseInt(tokens[0]));
		// se resta 1 a los meses porque empiezan en 0
		Date fecha = new Date(cal.getTimeInMillis());
		long diferencia = (hoy.getTime( )- fecha.getTime ()) /(24*60*60*1000);
		//dividimos + los miliseg. De un dia, obtenemos la diferencia en días.
		return (int) diferencia/365;
	}
	
	public static void main (String[] args) throws IOException{
		String fecha;
		System.out.println ("Introduce la fecha nacimiento dd/mm/yyyy: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		fecha = (entrada.readLine());
		System.out.println ("La fecha es: "+fecha);
		System.out.println ("Tienes " + edad(fecha) +" años");
	}
}