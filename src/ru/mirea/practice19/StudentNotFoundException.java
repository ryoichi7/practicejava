package ru.mirea.practice19;

public class StudentNotFoundException extends  RuntimeException{
    public StudentNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
