package org.recurrencerelation.service;

import javafx.util.Pair;
import org.recurrencerelation.configuration.ConstantMessageStatus;

public interface PrintResult {

    String print(Pair<Integer, ConstantMessageStatus> pair);
}
