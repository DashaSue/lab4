package ru.ifmo.se.pokemon;

public enum Color {
    Red("Красный"),
    Green("Зеленый"),
    Black("Черный"),
    White("Белый");

    private String name;


    Color(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
