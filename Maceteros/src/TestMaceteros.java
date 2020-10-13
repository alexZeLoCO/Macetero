
public class TestMaceteros {

	public static void main(String[] args) {
		
		Macetero Einstein = new Macetero ();		//CREA UN MACETERO LLAMADO EINSTEIN
		Einstein.setAltura(10);
		Einstein.setRinferior(6);			//EN ESTAS TRES LÍNEAS PODRÍAMOS UTILIZAR UN SCANNER Y LA VARIABLE TECLADO PARA INTRODUCIR VALORES.
		Einstein.setRsuperior(12);	
		
		Macetero Jackson = new Macetero ();			//CREA UN MACETERO LLAMADO JACKSON
		Jackson.setAltura(14);
		Jackson.setRinferior(6);			//EN ESTAS TRES LÍNEAS PODRÍAMOS UTILIZAR UN SCANNER Y LA VARIABLE TECLADO PARA INTRODUCIR VALORES.
		Jackson.setRsuperior(6);
		
		System.out.printf("Generatriz, volumen y área de Einstein: %f, %f, %f.\n",Einstein.generatriz(),Einstein.volumen(),Einstein.area());		//MUESTRA CARACTERÍSTICAS DE EINSTEIN
		System.out.printf("Generatriz, volumen y área de Jackson: %f, %f, %f.\n",Jackson.generatriz(),Jackson.volumen(),Jackson.area());			//MUESTRA CARACTERÍSTICAS DE JACKSON
	
		if (Einstein.mayorVolumen(Jackson)) {		//LLAMA MÉTODO MAYORVOLUMEN() Y ENTREGA COMO PARÁMETRO JACKSON ==> EL MACETERO JACKSON = MACETERO CURIE (DE MACETERO.JAVA)
			/* 
			 * RECORDEMOS: EL MÉTODO MAYORVOLUMEN() DEVUELVE UN VALOR DE TIPO BOOLEAN (TRUE/FALSE). POR LO TANTO LO PODEMOS UTILIZAR COMO CONDICIÓN EN UN IF.
			 * SI LA SALIDA DEL MÉTODO MAYORVOLUMEN() ES TRUE, SE PROCEDE CON LAS ACCIONES DE LA CONDICIÓN, PERO SI ES FALSE SALTAREMOS DIRECTAMENTE A LAS ÓRDENES CONTENIDAS EN EL ELSE.
			 */
			System.out.print("El volumen de Einstein es mayor al de Jackson.");
		} else {
			System.out.print("El volumen de Einstein es menor o igual al de Jackson");
		}
	}
}
