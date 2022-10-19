package org.example;

import java.util.Map;
import java.util.TreeMap;

public class History {
    TreeMap<String, String> operationsMade = new TreeMap<>();

    public void addToHistory(String operation, String result) {
        operationsMade.put(operation, result);
    }

    public void showHistory() {
        System.out.println("\n Operations you've made");
        System.out.println("--------------------------");
        for (Map.Entry<String, String> allTransactions : operationsMade.entrySet()) {
            System.out.println(allTransactions.getKey() + " | Result: " + allTransactions.getValue());
        }
        System.out.println("");
    }
}
