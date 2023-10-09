package com.sfeir.badcalculator;

public class Operation {

    private static String input;
    private int left;
    private int right;


    private static OperationExtractor extractor;

    private String operation;

    public Integer compute() {
//        input = inputString;
//        extractor = new OperationExtractor(inputString);
//        int opsi = input.indexOf(' ');
//        int opei = input.lastIndexOf(' ');
//        String operation = input.substring(opsi + 1, opei);

        //System.out.println("_" + operation + "_");

        if ("plus".equals(operation)) {
            System.out.println("Plus");
            return left + right;
        } else if (operation.equals("moins")) {
            System.out.println("Moins");
            return left - right;
        } else if (operation.equals("fois")) {
            System.out.println("Fois");
            return left * right;
        } else if (operation.equals("divis�")) {
            System.out.println("Divis�");
            return left / right;
        }

        return null;

    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public OperationExtractor getExtractor() {
        return extractor;
    }
}
