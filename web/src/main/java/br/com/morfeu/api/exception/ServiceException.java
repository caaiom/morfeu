package br.com.morfeu.api.exception;

/**
 * Created by cmaia on 14/04/16
 */
public class ServiceException extends Exception {

    private static final long serialVersionUID = -7076601354856220083L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
