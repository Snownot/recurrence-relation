package org.recurrencerelation.configuration;

/**
 * Message mapping.
 */
public enum ConstantMessageStatus {
    SUCCESS("Ответ(Значение вычисленной суммы поделенное по модулю на 10000) = "),
    ERROR("Ошибочный ввод данных");

    private final String message;

    ConstantMessageStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
