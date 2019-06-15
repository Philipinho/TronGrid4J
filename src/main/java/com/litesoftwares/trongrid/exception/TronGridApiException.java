package com.litesoftwares.trongrid.exception;

import com.litesoftwares.trongrid.TronGridApiError;

public class TronGridApiException extends RuntimeException {
    private TronGridApiError error;

    public TronGridApiException(TronGridApiError error){
        this.error = error;
    }

    public TronGridApiException(Throwable cause){
        super(cause);
    }

    public TronGridApiException(String message, Throwable cause){
        super(message,cause);
    }

    public TronGridApiError getError() {
        return error;
    }

    public void setError(TronGridApiError error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return
                error != null ?
                error.toString() :
                super.getMessage();
    }
}
