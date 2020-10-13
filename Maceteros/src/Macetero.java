
public class Macetero {

//---------------INICIALIZACIÓN DE VARIABLES-----------	
	private double altura;		//VARIABLE ALTURA
	private double rsuperior;		//VARIABLE RADIO SUPERIOR
	private double rinferior;		//VARIABLE RADIO INFERIOR
	private double generatriz;		//VARIABLE GENERATRIZ
	private double volumen;		//VARIABLE VOLUMEN
	private double area;		//VARIABLE AREA
	private final double  PI = Math.PI;		//CONSTANTE (PRIVATE FINAL DOUBLE) PI = MATH.PI (3.141592654...)
	
	
//---------MÉTODOS SET---------	
	public void setAltura (double x) {		//SET ALTURA. PARÁMETRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			altura = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O MENOR A 0
			System.out.print("La altura introducida es inferior a 0, ha sido invalidada.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	public void setRsuperior (double x) {		//SET RADIO SUPERIOR. PARÁMETRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			rsuperior = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O MENOR QUE 0
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	public void setRinferior (double x) {		//SET RADIO INFERIOR. PARÁMETRO DOUBLE X
		if (x > 0) {		//SI X ES POSITIVO
			rinferior = x;		//INTRODUCIR
		} else {		//SI X ES IGUAL O INFERIOR A 0
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
	}
	

//NOTA: PRÁCTICAMENTE TODOS LOS MÉTODOS QUE NO SEAN SET DEVUELVEN UN VALOR. ÉSTE SUELE SER DOUBLE PARA REALES, INT PARA ENTEROS O BOOLEAN PARA BOOLEANOS.
	//NO OBSTANTE, PUEDEN EXISITIR MÉTODOS QUE NO SEAN SET Y QUE NO DEVUELVAN NADA.
	
//---------MÉTODOS GET----------
	public double getAltura () {		//DEVUELVE ALTURA
		return altura;
	}
	public double getRsuperior () {		//DEVUELVE RADIO SUPERIOR
		return rsuperior;
	}
	public double getRinferior () {		//DEVUELVE RADIO INFERIOR
		return rinferior;
	}
	

//-----------MÉTODOS DE CÁLCULO--------------
	
/*
 *NOTA: AL HACER MÉTODOS DE CÁLCULO ES MEJOR QUE LLAMEMOS A OTROS MÉTODOS EN LUGAR DE UTILIZAR VARIABLES. 
 *NO OBSTANTE, TENEMOS QUE TENER EN CUENTA QUE SÓLO PODEMOS LLAMAR MÉTODOS QUE DEVUELVAN ALGO.
 *EN LAS SIGUIENTES OPERACIONES PODRÍAMOS HABER SUSTITUIDO LOS MÉTODOS POR ALTURA, RSUPERIOR, RINFERIOR Y VOLUMEN.
 *PERO ESTAMOS UTILIZANDO LOS MÉTODOS QUE NOS DEVUELVEN ESOS MISMOS VALORES. GETALTURA() GETRSUPERIOR() GETRINFERIOR() GETVOLUMEN().
 */
	
	public double generatriz () {		//CALCULA LA GENERATRIZ
		generatriz = Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getRsuperior()-getRinferior(),2));		//OPERACIÓN
		return generatriz;		//DEVUELVE RESULTADO
	}
	
	public double volumen () {		//CALCULA VOLUMEN
		volumen = Math.sqrt(PI*getAltura()*(Math.pow(getRinferior(), 2)+Math.pow(getRsuperior(), 2)+getRinferior()*getRsuperior()))/3;		//OPERACIÓN
		return volumen;		//DEVUELVE RESULTADO
	}
	
	public double area () {		//CALCULA AREA
		area = PI*(generatriz()*(getRsuperior()+getRinferior())+Math.pow(getRsuperior(), 2)+Math.pow(getRinferior(),2));		//OPERACIÓN
		return area;		//DEVUELVE RESULTADO
	}
	
	//EL SIGUIENTE MÉTODO JUGARÁ CON DOS MACETEROS. UNO DE ELLOS SE PASARÁ COMO PARÁMETRO Y EL OTRO SERÁ AQUEL CON EL QUE SE HAGA LA LLAMADA DESDE TESTMACETEROS.JAVA
	 
	public boolean mayorVolumen (Macetero Curie) {		//RECIBE COMO PARÁMETRO () UN MACETERO QUE SE LLAMARÁ CURIE
		return (volumen()>Curie.volumen());		//CALCULA EL VOLUMEN DEL MACETERO CON EL QUE SE HACE LA LLAMADA Y LO COMPARA CON EL VOLUMEN DEL MACETERO QUE SE PASA COMO PARÁMETRO
		/* A DIFERENCIA DE OTROS MÉTODOS DE CÁLCULO QUE DEVUELVEN UN VALOR DOUBLE,
		 * EL MÉTODO MAYORVOLUMEN DEVUELVE UN TIPO BOOLEAN (PUBLIC BOOLEAN) O SEA, TRUE O FALSE.
		 * 
		 * SI LO CONTENIDO EN LOS PARÉNTESIS TRAS RETURN ES CIERTO SE DEVUELVE TRUE, SI NO, FALSE.
		 */
	}
}
