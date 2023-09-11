package ru.mirea.practice3.shell;

public class task1 {
    public static void main(String[] args){
        Double val0 = Double.valueOf("1.234324");
        System.out.println(val0 + " <-- double in Double shell converted from string");
        double val = Double.parseDouble("5.1224231");
        System.out.println(val + " <-- double without shell converted from string");
        String strval = Double.toString(val);
        System.out.println(strval + " <-- String converted from double");
        int valint = (int)Double.parseDouble(strval);
        System.out.println(valint + " <-- int without shell converted from String");
        double valdouble = Double.parseDouble(strval);
        System.out.println(valdouble + " <-- double without shell converted from String");
        String str = Double.toString(2.71);
        System.out.println(str + " <-- String converted from double");
    }

}
