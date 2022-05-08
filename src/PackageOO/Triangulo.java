package PackageOO;

public class Triangulo {
	//atributos
	private double base;
	private double altura;
	
	//construtor
	public Triangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	
	//metodos
	private double calcularArea() {
		double area = this.base * this.altura / 2 ;
		return area;
	}
	
	public void mostrarArea() {
		System.out.println("A area é: "+calcularArea());
	}
}
