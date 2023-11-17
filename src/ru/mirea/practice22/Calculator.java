package ru.mirea.practice22;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public double getResult(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        ArrayList<String> exp = parseExpression(expression);
        for(String el: exp){
            try{
                double number = Double.parseDouble(el);
                stack.push(number);
            }
            catch (Exception e){
                try {
                    double result = Operation.getResult(stack.pop(), stack.pop(), el);
                    stack.push(result);
                }
                catch (Exception exception){
                    throw new Exception("Error in expression");
                }
            }
        }
        if(stack.size()==1) return stack.pop();
        else throw new Exception("Error in expression");
    }

    private ArrayList<String> parseExpression(String expression){
        Pattern patternNumbers = Pattern.compile("(\\d+(\\.\\d+|)|\\))");
        Pattern patternOperators = Pattern.compile("(\\+|-|\\*|/|\\))");
        Matcher matcherNumbers = patternNumbers.matcher(expression);
        Matcher matcherOperators = patternOperators.matcher(expression);
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        while(matcherNumbers.find()) {
            String string = expression.substring(matcherNumbers.start(),matcherNumbers.end());
            if(!string.equals("")) numbers.add(string);
        }
        System.out.println(numbers);

        while(matcherOperators.find()) {
            String string = expression.substring(matcherOperators.start(),matcherOperators.end());
            if(!string.equals("")) operators.add(string);
        }
        System.out.println(operators);

        for(int i = 0;i<operators.size()-1;){
            String temp = operators.get(i);
            String next = operators.get(i+1);
            if(next.equals(")")){
                int index = numbers.indexOf(")");
                if(index > -1){
                    numbers.remove(index);
                    numbers.add(index,temp);
                    operators.remove(i);
                    operators.remove(i);
                    if(i<operators.size() && i >= 0) {
                        if (operators.get(i).equals(")")) i--;
                    }
                    i--;
                }
            }
            i++;
        }
        ArrayList<String> arrayList = new ArrayList<>(numbers);

        for(int i = operators.size();i>0;i--) arrayList.add(operators.get(i-1));

        System.out.println(arrayList);

        return arrayList;
    }
}

