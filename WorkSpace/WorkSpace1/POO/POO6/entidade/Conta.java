package entidade;

import java.util.UUID;

public abstract class Conta {

	protected Double saldo;
	private UUID id;
	private String nomeCliente;

	public Conta() {
		this.id = UUID.randomUUID();

	}

	public Conta(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.id = UUID.randomUUID();
		this.saldo = 0.0;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public UUID getId() {
		return this.id;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}

	public void sacar(Double saldo) {
		if (saldo > this.saldo) {
			System.out.println("Valor de saque indisponivel");
		} else {

			this.saldo -= saldo;
		}
	}

}
