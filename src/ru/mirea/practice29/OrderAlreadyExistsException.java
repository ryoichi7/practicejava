package ru.mirea.practice29;

public class OrderAlreadyExistsException extends RuntimeException {
    public OrderAlreadyExistsException(String msg){
        super(msg);
    }
}
