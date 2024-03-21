package model.util;

import model.exception.ExceptionsPersonalizada;

public class ProdutoUtil {

	public static void verificarQuantidadeRemovida(Integer quantidadeRemover, Integer qtdDisponivel)
			throws ExceptionsPersonalizada {
		if (quantidadeRemover > qtdDisponivel) {
			throw ExceptionsPersonalizada.quantidadeRemoverMaiorQuantidadeDisponivel("A quantidade a ser removida ("
					+ quantidadeRemover + ") excede a quantidade disponível (" + qtdDisponivel + ").");
		}

		if (quantidadeRemover < 0) {
			throw ExceptionsPersonalizada
					.valoresNegativos("A quantidade a ser removida não pode ser negativa: " + quantidadeRemover);
		}
	}

	public static void VerificarQuantidadeAdd(Integer qtdAdd, Integer qtdDisponivel) throws ExceptionsPersonalizada {
		if (qtdAdd < 0) {
			throw ExceptionsPersonalizada.valoresNegativos("A quantidade adicionada não pode ser negativa!!");
		}

	}
}
