
public class Macetero {

//---------------INICIALIZACIÓN DE VARIABLES-----------	
	private double altura;
	private double rsuperior;
	private double rinferior;
	private double generatriz;
	private double volumen;
	private double area;
	private final double  PI = 3.141592654;
	
	
//---------MÉTODOS SET---------	
	public void setAltura (double x) {
		if (x > 0) {
			altura = x;
		} else {
			System.out.print("La altura introducida es inferior a 0, ha sido invalidada.");
			System.exit(0);
		}
	}
	public void setRsuperior (double x) {
		if (x > 0) {
			rsuperior = x;
		} else {
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");
			System.exit(0);
		}
	}
	public void setRinferior (double x) {
		if (x > 0) {
			rinferior = x;
		} else {
			System.out.print("El radio introducido es inferior a 0, ha sido invalidado.");
			System.exit(0);
		}
	}
	
	
//---------MÉTODOS GET----------
	public double getAltura () {
		return altura;
	}
	public double getRsuperior () {
		return rsuperior;
	}
	public double getRinferior () {
		return rinferior;
	}
	

//-----------MÉTODOS DE CÁLCULO--------------
	public double generatriz () {
		generatriz = Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getRsuperior()-getRinferior(),2));
		return generatriz;
	}
	
	public double volumen () {
		volumen = Math.sqrt(PI*getAltura()*(Math.pow(getRinferior(), 2)+Math.pow(getRsuperior(), 2)+getRinferior()*getRsuperior()))/3;
		return volumen;
	}
	
	public double area () {
		area = PI*(generatriz()*(getRsuperior()+getRinferior())+Math.pow(getRsuperior(), 2)+Math.pow(getRinferior(),2));
		return area;
	}
	public boolean mayorVolumen (Macetero Curie) {		//RECIBE COMO PARÁMETRO () UN MACETERO QUE SE LLAMARÁ CURIE
		return (volumen()>Curie.volumen());		//CALCULA EL VOLUMEN DEL MACETERO CON EL QUE SE HACE LA LLAMADA Y LO COMPARA CON EL VOLUMEN DEL MACETERO QUE SE PASA COMO PARÁMETRO
	}
}
