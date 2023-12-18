package org.recurrencerelation.service;

import javafx.util.Pair;
import org.recurrencerelation.configuration.ConstantMessageStatus;

public interface CommandLineCalculator {
    Pair<Integer, ConstantMessageStatus> calculatedSumDividedByModulus();
}
