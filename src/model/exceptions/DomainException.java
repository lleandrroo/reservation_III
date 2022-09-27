package model.exceptions;

public class DomainException extends Exception {
	
	/*
	 * 	DomainException can extends both by Exception or RuntimeException
	 * 	
	 * 	Exception - compilador obriga a tratar exceção
	 * 	RuntimeException - compilador não obriga a tratar exceção
	 * 	
	 * 	The serializable class DomainException does not declare a static final
	 * 	serialVersionUID field of type long
	 * 
	 * 
	 * */
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
