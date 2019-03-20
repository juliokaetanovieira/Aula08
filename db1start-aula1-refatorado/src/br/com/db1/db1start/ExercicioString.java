package br.com.db1.db1start;

public class ExercicioString {
	
	public static String transformarParaMaisculo(String valor) {
		return valor.toUpperCase();
	}
	
	public static String transformarParaMinusculo(String valor) {
		return valor.toLowerCase();
	}
	
	public static void main(String[] args){
		String nomeUser = ExercicioString.transformarParaMaisculo("julio");
		System.out.println(nomeUser);
		
		String nomeUser2 = ExercicioString.transformarParaMinusculo("JULIO");
		System.out.println(nomeUser2);
		
	}
	
	/*public static void main(String[] args) {
		String texto1= "julio vieira";
		String texto2 = "ANNA LAURA";
		
		System.out.println(texto1.toUpperCase());
		System.out.println(texto2.toLowerCase());
	} */

}
