package org.recurrencerelation.service.impl;

import org.apache.commons.lang3.tuple.Pair;
import org.recurrencerelation.configuration.ConstantMessageStatus;
import org.recurrencerelation.service.PrintResult;
import org.springframework.stereotype.Component;
/**
 * Outputs the result
 */
@Component
public class PrintResultImpl implements PrintResult {

    @Override
    public String print(Pair<Integer, ConstantMessageStatus> pair) {
        StringBuilder printResult = new StringBuilder();
        printResult.append(pair.getValue().getMessage());
        printResult.append(pair.getKey());
        System.out.println(printResult);
        return pair.getValue().toString();
    }
}
