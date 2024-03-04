package entidades;

// Classe para representar uma conta bancária
public class Conta {

	// Variáveis de instância
	private String nomeCliente;
	private Double saldoCliente = 0.0;
	private static final Double TAXA = 0.03; // Taxa fixa de imposto

	// Construtores
	public Conta() {
	}

	public Conta(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// Métodos getters e setters para nomeCliente e saldoCliente
	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldoCliente() {
		return this.saldoCliente;
	}

	// Método para depositar saldo na conta
	public void depositarSaldo(Double valor) {
		this.saldoCliente += valor;
	}

	// Método para sacar saldo da conta
	public void sacarSaldo(Double valor) {
		Double valorRetidoBanco = valor * TAXA; // Calcula o valor retido pelo banco

		// Verifica se o valor de saque é maior que o saldo disponível
		if (valor > this.saldoCliente) {
			System.out.println("Valor de saque indisponível!\nMotivo:\nSaldo disponível: " + getSaldoCliente()
					+ "\nTentativa de saque: " + valor);
			return;
		}

		// Calcula o valor sacado pelo cliente e atualiza o saldo
		Double valorSacadoCliente = valor - valorRetidoBanco;
		this.saldoCliente -= valorSacadoCliente;

		// Exibe mensagem de sucesso do saque e informações relevantes
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println("Saque de " + valor + " realizado com sucesso!\nValor retido pelo banco: " + valorRetidoBanco
				+ "\nSaldo restante: " + getSaldoCliente());
		System.out
				.println("------------------------------------------------------------------------------------------");
	}

	// Método toString para representação textual da conta
	@Override
	public String toString() {
		return "Nome: " + ((this.nomeCliente == null) ? "N/D" : this.nomeCliente) + "\n" + "Saldo: " + "R$ "
				+ String.format("%.2f", saldoCliente);
	}
}
