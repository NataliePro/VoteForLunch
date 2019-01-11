package ru.proshkina.voteforlunch.util.exception;

public enum ErrorType {
    APP_ERROR("error.appError"),
    DATA_NOT_FOUND("error.dataNotFound"),
    VOTING_TIME_IS_OUT("error.votingTimeIsOut"),
    DATA_ERROR("error.dataError"),
    VALIDATION_ERROR("error.validationError"),
    WRONG_REQUEST("error.wrongRequest");

    private final String errorCode;

    ErrorType(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
