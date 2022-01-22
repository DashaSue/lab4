package ru.ifmo.se.pokemon;

public class UsualPosters extends Posters implements Act{
    UsualPosters(String name, String form, boolean whirling, boolean falling, boolean tearing){
        super(name, form, whirling, falling, tearing);
        System.out.println("Создана афиша " + this.getName());
    }
    public String toString() {
        return "Имя афиши: " + this.getName() + ", Форма афиши: " + this.getForm();
    }
    @Override
    public void whirl(Posters o){
        if (o.getWhirling()) {
            System.out.println(o.getName() + " кружится");
        }else{
            System.out.println(o.getName() + " грустно лежит на земле(");
        }
    }
    @Override
    public void fall(Posters o){
        if (o.getFalling()) {
            System.out.println(o.getName() + " грустно лежит на земле");
        }else{
            System.out.println(o.getName() + " всё еще не упала");
        }
    }
    @Override
    public void tear(Posters o){
        if (o.getTearing()) {
            System.out.println(o.getName() + " разорвалось на мелкие кусочки");
        }else{
            System.out.println(o.getName() + " ещё цело и даже не на земле");
        }
    }
}

