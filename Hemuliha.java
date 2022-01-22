package ru.ifmo.se.pokemon;

public class Hemuliha extends Person implements Treat, StayIn{
    Hemuliha(String name, int age, double growth, boolean treating, boolean stayIn){
        super(name, age, growth, treating, stayIn);
        System.out.println("Создан персонаж " + this.getName());
    }
    public String toString() {
        return "Имя персонажа: " + this.getName() + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getGrowth();
    }
    @Override
    public void stayIn(Person o){
        if(o.getStayIn()) {
            System.out.println((this.getName() + " находится у себя дома"));
        }else {
            System.out.println(this.getName() + " пошла на премьеру пьесы");
        }
    }
    @Override
    public void treat(Person o){
        if (o.getTreating()){
            System.out.println(this.getName() + " угостила " + o.getName());
        }else {
            System.out.println("Гости не пришли");
        }
    }
}