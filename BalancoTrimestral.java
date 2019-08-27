class BalancoTrimestral {
	public static void main (String [] args){

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
// Trimestral
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("o gasto mensal é " + gastosTrimestre);

//media
		int mediaMensal = gastosTrimestre / 3;
    	System.out.println("Média Mensal é: " + mediaMensal);

	double compra = 2000, int qtd = 1;
	double pagto;
		if (compra > 1000 || qtd > 3) {
	//	if (compra > 1000 && qtd > 3) {
	//		pagto = compra * 0.90;
			pagto = compra - compra * 0.10;
	 	} else if (compra > 500){
			pagto = compra * 0.95;
		  }

		System.out.println("valor a pagar: " + pagto);

		int i = 0;
		for(   ; i < = 10; i++){
	// for(int i = 0, i < = 10; i++){
		System.out.println(i);




	}
}
