package image.exception;

/**
 * Thrown when casting from one number type to another. Used in {@link image.generation.RandomNumber}.
 * @since JLight 0.1.0
 * @author Imagury (cursustemporum)
 */
public class NumberCastException extends RuntimeException{
	private static final long serialVersionUID = 6291047287594821685L;

	/**
	 * Thrown when casting from one number type to another. Used in {@link image.generation.RandomNumber}.
	 * @since JLight 0.1.0
	 * @author Imagury (cursustemporum)
	 */
	public NumberCastException() {
		super();
	}

	/**
	 * Thrown when casting from one number type to another. Used in {@link image.generation.RandomNumber}.
	 * @since JLight 0.1.0
	 * @author Imagury (cursustemporum)
	 */
	public NumberCastException(String s) {
		super(s);
	}

	/**
	 * Thrown when casting from one number type to another. Used in {@link image.generation.RandomNumber}.
	 * @since JLight 0.1.0
	 * @author Imagury (cursustemporum)
	 */
	public NumberCastException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Thrown when casting from one number type to another. Used in {@link image.generation.RandomNumber}.
	 * @since JLight 0.1.0
	 * @author Imagury (cursustemporum)
	 */
	public NumberCastException(Throwable cause) {
		super(cause);
	}
}
