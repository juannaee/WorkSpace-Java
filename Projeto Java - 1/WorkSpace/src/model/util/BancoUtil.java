package model.util;

import model.exception.ExceptionsPersonalizada;

public class BancoUtil {
	
	
	private static final String fmtCasaDecimal = "%.2f";
	
	public static void verificacaoEmprestimo(Double valorEmprestimo, Double valorDisponivel) throws ExceptionsPersonalizada {
        if (valorEmprestimo > valorDisponivel) {
            throw ExceptionsPersonalizada.valorEmprestimoExcedeSaldoException(
                    "\nValor do empréstimo excede o saldo disponível\nDetalhes:\nSaldo disponível: "
                            + String.format(fmtCasaDecimal, valorDisponivel)
                            + "\nTentativa de empréstimo: "
                            + String.format(fmtCasaDecimal, valorEmprestimo));
        } else {
            System.out.println("Empréstimo aprovado");
        }

    }

}
