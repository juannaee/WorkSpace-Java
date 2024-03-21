package model.exception;

public class ExceptionsPersonalizada extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionsPersonalizada(String message) {
		super(message);
	}

	public static ExceptionsPersonalizada valorEmprestimoExcedeSaldoException(String message) throws ExceptionsPersonalizada {
		throw new ExceptionsPersonalizada(message);

	}

	public static ExceptionsPersonalizada valoresNulos(String message) throws ExceptionsPersonalizada {
		throw new ExceptionsPersonalizada(message);
	}

	public static ExceptionsPersonalizada valoresNegativos(String message) throws ExceptionsPersonalizada {
		throw new ExceptionsPersonalizada(message);
	}
	
	public static ExceptionsPersonalizada quantidadeRemoverMaiorQuantidadeDisponivel(String message) throws ExceptionsPersonalizada {
		throw new ExceptionsPersonalizada(message);
	}

}
