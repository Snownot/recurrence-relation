package org.recurrencerelation.service.impl;


import javafx.util.Pair;
import org.recurrencerelation.configuration.ConstantMessageStatus;
import org.recurrencerelation.service.CommandLineCalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Performs the calculation
 */
@Component
public class CommandLineCalculatorImpl implements CommandLineCalculator {

    @Value("${spring.count}")
    private String count;
    @Value("${spring.divider}")
    private String divider;
    private Integer sum = 0;

    public Pair<Integer, ConstantMessageStatus> calculatedSumDividedByModulus() {
        validate();
        for (int i = 1; i <= Integer.parseInt(count); i++) {
            sum += (i + 3) - (i + 2);
        }
        return new Pair<>(sum %= Integer.parseInt(divider), ConstantMessageStatus.SUCCESS);
    }

    private void validate() {
        try {
            if (Integer.parseInt(divider) == 0) {
                throw new RuntimeException(ConstantMessageStatus.ERROR.getMessage());
            }
            if (Integer.parseInt(count) < 0) {
                throw new RuntimeException(ConstantMessageStatus.ERROR.getMessage());
            }
            if (divider.length() == 0) {
                throw new RuntimeException(ConstantMessageStatus.ERROR.getMessage());
            }

        } catch (NumberFormatException e) {
            throw new RuntimeException(ConstantMessageStatus.ERROR.getMessage());
        }
    }
}