public class CalculoFinanceiro {

	public static double calculaJurosSimplesTotal(double taxa, int parcelas, double valorInicial) {
		
		return valorInicial + (taxa * valorInicial) * parcelas;
		
	}
	
	public static double calculaJurosSimples(double taxa, int parcelas, double valorInicial) {
		
			return calculaJurosSimplesTotal(taxa, parcelas, valorInicial) - valorInicial;
		
	}
	
	public static double calculaJurosCompostosTotal(double taxa, int parcelas, double valorInicial) {
		
		return valorInicial * Math.pow((1 + taxa), parcelas);
		
	}
	
	public static double calculaJurosCompostos(double taxa, int parcelas, double valorInicial) {
		
		return calculaJurosCompostosTotal(taxa, parcelas, valorInicial) - valorInicial;
		
	}
	
}
