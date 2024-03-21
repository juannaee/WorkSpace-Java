/**
 * 
 */
package model.entidades;

/**
 * 
 */
public class ServicoTaxaBrazil implements ServicoTaxa {
	Double tax;

	public ServicoTaxaBrazil() {
		
	}
	@Override
	public Double tax(Double valor) {
		if (valor < 100) {
			this.tax = 0.1;
			return valor * this.tax;
		} else if (valor > 100) {
			this.tax = 0.15;
			return valor * this.tax;
		} else {
			return 0.0;
		}

	}

}
