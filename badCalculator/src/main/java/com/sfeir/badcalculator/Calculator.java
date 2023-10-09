package com.sfeir.badcalculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator.compute("3 plus 4");
        Calculator.compute("3 moins 4");
        Calculator.compute("3 fois 4");
        Calculator.compute("3 divis� 4");
    }

    public static void compute(String input) {
        int opsi = input.indexOf(' ');
        int opei = input.lastIndexOf(' ');
        int n1 = Integer.parseInt(input.substring(0, opsi));
        int n2 = Integer.parseInt(input.substring(opei + 1));
        String op = input.substring(opsi + 1, opei);
        Operation operation = new Operation();
        operation.setLeft(n1);
        operation.setRight(n2);
        operation.setOperation(op);
        displayResult(operation.compute(), operation);
    }

    private static void displayResult(int result, Operation operation) {
        String displayResult = "" + operation.getLeft();
        displayResult += " " + operation.getOperation();
        displayResult += " " + operation.getRight();
        displayResult += " = " + result;

        System.out.println(displayResult);
    }
}
