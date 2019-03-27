package com.github.yeriomin.playstore;

public class TokenDispenserException extends GooglePlayException {

    public TokenDispenserException(String message) {
        super(message);
    }

    public TokenDispenserException(Throwable cause) {
        super(null, cause);
    }
}
