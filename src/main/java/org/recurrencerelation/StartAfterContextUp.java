package org.recurrencerelation;

import org.recurrencerelation.service.CommandLineCalculator;
import org.recurrencerelation.service.PrintResult;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Waiting for the context started
 */
@Component
class StartAfterContextUp {
    private final CommandLineCalculator calculator;
    private final PrintResult printer;

    public StartAfterContextUp(@Qualifier(value = "commandLineCalculatorImpl") CommandLineCalculator calculator,
                               @Qualifier(value = "printResultImpl") PrintResult printer) {
        this.calculator = calculator;
        this.printer = printer;
    }

    @EventListener({ContextRefreshedEvent.class})
    public void contextRefreshedEvent() {
        try {
            printer.print(calculator.calculatedSumDividedByModulus());
        } catch (Exception ignored) {

        }
    }
}
