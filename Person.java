package ru.ifmo.se.pokemon;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double growth;
    private boolean treating;
    private boolean stayIn;

    Person(String name, int age, double height, boolean treating, boolean stayIn) {
        this.name = name;
        this.age = age;
        this.growth = height;
        this.treating = treating;
        this.stayIn = stayIn;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getGrowth(){
        return this.growth;
    }
    public boolean getTreating(){
        return this.treating;
    }
    public boolean setTreating(){
        return this.treating;
    }
    public boolean getStayIn(){
        return this.stayIn;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }else if (o == null || getClass() != o.getClass()){
            return false;
        }
        Person person = (Person) o;
        return this.name.equals(person.name) && this.age == person.age && this.growth == person.growth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                ", treating=" + treating +
                ", stayIn=" + stayIn +
                '}';
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age, growth, treating, stayIn);
    }

}
