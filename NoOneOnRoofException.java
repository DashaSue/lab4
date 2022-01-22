package ru.ifmo.se.pokemon;

public class NoOneOnRoofException extends RuntimeException{
    public NoOneOnRoofException (String message) {
        super(message);
        System.out.println(message);
    }
}
