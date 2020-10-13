
public class Macetero {

//---------------INICIALIZACI�N DE VARIABLES-----------	
	private double altura;		//VARIABLE ALTURA
	private double rsuperior;		//VARIABLE RADIO SUPERIOR
	private double rinferior;		//VARIABLE RADIO INFERIOR
	private double generatriz;		//VARIABLE GENERATRIZ
	private double volumen;		//VARIABLE VOLUMEN
	private double area;		//VARIABLE AREA
	private final double  PI = Math.PI;		//CONSTANTE (PRIVATE FINAL DOUBLE) PI = MATH.PI (3.141592654...)
	
	
//---------M�TODOS SET---------	
	public void setAltura (double x) {		//SET ALTURA. PAR�METRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			altura = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O MENOR A 0
			System.out.print("La altura introducida es inferior a 0, ha sido invalidada.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	public void setRsuperior (double x) {		//SET RADIO SUPERIOR. PAR�METRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			rsuperior = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O MENOR QUE 0
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	public void setRinferior (double x) {		//SET RADIO INFERIOR. PAR�METRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			rinferior = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O INFERIOR A 0
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	

//NOTA: PR�CTICAMENTE TODOS LOS M�TODOS QUE NO SEAN SET DEVUELVEN UN VALOR. �STE SUELE SER DOUBLE PARA REALES, INT PARA ENTEROS O BOOLEAN PARA BOOLEANOS.
	//NO OBSTANTE, PUEDEN EXISITIR M�TODOS QUE NO SEAN SET Y QUE NO DEVUELVAN NADA.
	
//---------M�TODOS GET----------
	public double getAltura () {		//DEVUELVE ALTURA
		return altura;
	}
	public double getRsuperior () {		//DEVUELVE RADIO SUPERIOR
		return rsuperior;
	}
	public double getRinferior () {		//DEVUELVE RADIO INFERIOR
		return rinferior;
	}
	

//-----------M�TODOS DE C�LCULO--------------
	
/*
 *NOTA: AL HACER M�TODOS DE C�LCULO ES MEJOR QUE LLAMEMOS A OTROS M�TODOS EN LUGAR DE UTILIZAR VARIABLES. 
 *NO OBSTANTE, TENEMOS QUE TENER EN CUENTA QUE S�LO PODEMOS LLAMAR M�TODOS QUE DEVUELVAN ALGO.
 *EN LAS SIGUIENTES OPERACIONES PODR�AMOS HABER SUSTITUIDO LOS M�TODOS POR ALTURA, RSUPERIOR, RINFERIOR Y VOLUMEN.
 *PERO ESTAMOS UTILIZANDO LOS M�TODOS QUE NOS DEVUELVEN ESOS MISMOS VALORES. GETALTURA() GETRSUPERIOR() GETRINFERIOR() GETVOLUMEN().
 */
	
	public double generatriz () {		//CALCULA LA GENERATRIZ
		generatriz = Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getRsuperior()-getRinferior(),2));		//OPERACI�N
		return generatriz;		//DEVUELVE RESULTADO
	}
	
	public double volumen () {		//CALCULA VOLUMEN
		volumen = Math.sqrt(PI*getAltura()*(Math.pow(getRinferior(), 2)+Math.pow(getRsuperior(), 2)+getRinferior()*getRsuperior()))/3;		//OPERACI�N
		return volumen;		//DEVUELVE RESULTADO
	}
	
	public double area () {		//CALCULA AREA
		area = PI*(generatriz()*(getRsuperior()+getRinferior())+Math.pow(getRsuperior(), 2)+Math.pow(getRinferior(),2));		//OPERACI�N
		return area;		//DEVUELVE RESULTADO
	}
	
	//EL SIGUIENTE M�TODO JUGAR� CON DOS MACETEROS. UNO DE ELLOS SE PASAR� COMO PAR�METRO Y EL OTRO SER� AQUEL CON EL QUE SE HAGA LA LLAMADA DESDE TESTMACETEROS.JAVA
	 
	public boolean mayorVolumen (Macetero Curie) {		//RECIBE COMO PAR�METRO () UN MACETERO QUE SE LLAMAR� CURIE
		return (volumen()>Curie.volumen());		//CALCULA EL VOLUMEN DEL MACETERO CON EL QUE SE HACE LA LLAMADA Y LO COMPARA CON EL VOLUMEN DEL MACETERO QUE SE PASA COMO PAR�METRO
		/* A DIFERENCIA DE OTROS M�TODOS DE C�LCULO QUE DEVUELVEN UN VALOR DOUBLE,
		 * EL M�TODO MAYORVOLUMEN DEVUELVE UN TIPO BOOLEAN (PUBLIC BOOLEAN) O SEA, TRUE O FALSE.
		 * 
		 * SI LO CONTENIDO EN LOS PAR�NTESIS TRAS RETURN ES CIERTO SE DEVUELVE TRUE, SI NO, FALSE.
		 */
	}
}
