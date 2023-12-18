package org.recurrencerelation;

import org.recurrencerelation.configuration.ConfigApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Тестовое задание:
 * Задано рекуррентное соотношение
 * f(n) =  f(n+3) - f(n+2)
 * f(1) = 1
 * f(2) = 2
 * f(3) = 3
 * Написать программу вычисляющую сумму первых 100 элементов последовательности.
 * Ответом должен быть архив с кодом и значение вычисленной суммы поделенное по модулю на 10000.
 */

public class RecurrenceRelationApplication {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ConfigApplication.class);
    }
}