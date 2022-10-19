package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HistoryTest {

    @Test
    void addToHistoryMethodTest() {
        History history = new History();
        history.addToHistory("test-operation", "test-result");
        Assertions.assertEquals(history.operationsMade.get("test-operation"), "test-result");
    }
}