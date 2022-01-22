package ru.ifmo.se.pokemon;

public class NotFullPoster extends Exception{
    public NotFullPoster (String message) {
        super(message);
        System.out.println(message);
    }

}
