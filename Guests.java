package ru.ifmo.se.pokemon;

public class Guests extends Person implements Treat{
    Guests(String name, int age, double growth, boolean treating, boolean stayIn){
        super(name, age, growth, treating, stayIn);
        System.out.println("Создан персонаж " + this.getName());
    }
    public String toString() {
        return "Имя персонажа: " + this.getName() + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getGrowth();
    }
    public void glue(){
        System.out.println("Мальчик склеил постер");
    }
    @Override
    public void treat(Person o){
        if (o.setTreating()){
            System.out.println(o.getName() + " был угощен");
        }else {
            System.out.println(o.getName() + " голодный");
        }
    }
    public static class Home{
        public void go(){
            System.out.println("Гости ушли");
        }
    }
}

