package br.com.db1.db1start;

public class ExercicioMatematica {
	
	public static double valorMenor(Double valor1, Double valor2){
		
			if (valor1 < valor2){
				return valor1;
			}
			return valor2;
	}

	public static double valorMenor(Double valor3, Double valor4, Double valor5){
		
		if (valor3 < valor4 && valor3 < valor5){
			return valor3;
		}
		
		if (valor4 < valor3 && valor4 < valor5){
			return valor4;
		}
		
			return valor5;

}	
	
	public static void main(String[] args){
		System.out.println(valorMenor(2.0, 3.0));
	}
	
}
	
	
	/*public static void main(String[] args) {
		Double valor1 = 5.5;
		Double valor2 = 10.1;
		
		if (valor1 <= valor2){
		System.out.println(valor1);
		}
		
		Double valor3 = 20.4;
		Double valor4 = 25.5;
		Double valor5 = 13.7;
		
		if (valor3 < valor4 && valor3 < valor5){
		System.out.println(valor3);
		}
		
		if (valor4 < valor3 && valor4 < valor5){
		System.out.println(valor4);
		}
		
		if (valor5 < valor3 && valor5 < valor4){
		System.out.println(valor5);
		} */
		
		
	


