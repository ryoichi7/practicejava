package ru.mirea.practice22;

import javax.swing.*;

public class CalculatorController {
    private Calculator calculator;
    private CalculatorView view;

    public CalculatorController(Calculator calculator, CalculatorView view) {
        this.calculator = calculator;
        this.view = view;
        this.view.buttonIs.addActionListener(e->{
            String expression = this.view.textArea.getText().trim();
            if(expression.startsWith("-")) {
                StringBuilder beginning = new StringBuilder("(0-");
                for(int i = 1;i<expression.length();i++){
                    char el = expression.charAt(i);
                    if(el == '+' || el == '-' || el == '*' || el =='/'){
                        beginning.append(")").append(el);
                        expression = expression.substring(i+1);
                        expression = beginning + expression;
                        break;
                    }
                    beginning.append(el);
                }
            }
            System.out.println(expression);
            try {
                double result = calculator.getResult(expression);
                this.view.textArea.setText(String.valueOf(result));
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Error in expression","Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        view.setVisible(true);
    }

}
