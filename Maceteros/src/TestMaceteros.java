
public class TestMaceteros {

	public static void main(String[] args) {
		
		Macetero Einstein = new Macetero ();		//CREA UN MACETERO LLAMADO EINSTEIN
		Einstein.setAltura(10);
		Einstein.setRinferior(6);			//EN ESTAS TRES L�NEAS PODR�AMOS UTILIZAR UN SCANNER Y LA VARIABLE TECLADO PARA INTRODUCIR VALORES.
		Einstein.setRsuperior(12);	
		
		Macetero Jackson = new Macetero ();			//CREA UN MACETERO LLAMADO JACKSON
		Jackson.setAltura(14);
		Jackson.setRinferior(6);			//EN ESTAS TRES L�NEAS PODR�AMOS UTILIZAR UN SCANNER Y LA VARIABLE TECLADO PARA INTRODUCIR VALORES.
		Jackson.setRsuperior(6);
		
		System.out.printf("Generatriz, volumen y �rea de Einstein: %f, %f, %f.\n",Einstein.generatriz(),Einstein.volumen(),Einstein.area());		//MUESTRA CARACTER�STICAS DE EINSTEIN
		System.out.printf("Generatriz, volumen y �rea de Jackson: %f, %f, %f.\n",Jackson.generatriz(),Jackson.volumen(),Jackson.area());			//MUESTRA CARACTER�STICAS DE JACKSON
	
		if (Einstein.mayorVolumen(Jackson)) {		//LLAMA M�TODO MAYORVOLUMEN() Y ENTREGA COMO PAR�METRO JACKSON ==> EL MACETERO JACKSON = MACETERO CURIE (DE MACETERO.JAVA)
			/* 
			 * RECORDEMOS: EL M�TODO MAYORVOLUMEN() DEVUELVE UN VALOR DE TIPO BOOLEAN (TRUE/FALSE). POR LO TANTO LO PODEMOS UTILIZAR COMO CONDICI�N EN UN IF.
			 * SI LA SALIDA DEL M�TODO MAYORVOLUMEN() ES TRUE, SE PROCEDE CON LAS ACCIONES DE LA CONDICI�N, PERO SI ES FALSE SALTAREMOS DIRECTAMENTE A LAS �RDENES CONTENIDAS EN EL ELSE.
			 */
			System.out.print("El volumen de Einstein es mayor al de Jackson.");
		} else {
			System.out.print("El volumen de Einstein es menor o igual al de Jackson");
		}
	}
}
