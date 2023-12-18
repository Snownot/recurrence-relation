package org.recurrencerelation.service;

import org.apache.commons.lang3.tuple.Pair;
import org.recurrencerelation.configuration.ConstantMessageStatus;

public interface CommandLineCalculator {
    Pair<Integer, ConstantMessageStatus> calculatedSumDividedByModulus();
}
