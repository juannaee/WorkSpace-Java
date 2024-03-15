/**
 * 
 */
package model.entidades;

/**
 * 
 */
public class ServicoTaxaBrazil implements ServicoTaxa {
	Double tax;

	@Override
	public Double tax(Double valor) {
		if (valor < 100) {
			this.tax = 0.1;
			return valor += valor * this.tax;
		} else if (valor > 100) {
			this.tax = 0.15;
			return valor += valor * this.tax;
		} else {
			return valor;
		}

	}

}
