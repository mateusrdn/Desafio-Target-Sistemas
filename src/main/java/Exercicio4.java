
public class Exercicio4 {

	public static void main(String[] args) {
		
		String[] estado = {"SP", "RJ", "MG", "ES", "Outros"};	
		double[] valor = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
	
		double total = 0;
		
		for(double v : valor) {	
			total += v;
		}
		
		for (int i = 0; i < estado.length; i++) {
			
			double porcentagem = (valor[i] / total) * 100; 
			System.out.println(estado[i] + " tem " + String.format("%.2f", porcentagem) + "% de participação." );

		}
			

	}

}
