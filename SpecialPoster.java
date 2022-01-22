package ru.ifmo.se.pokemon;

public class SpecialPoster extends Posters {
    SpecialPoster(String name, String form, boolean whirling, boolean falling, boolean tearing){
        super(name, form, whirling, falling, tearing);
        System.out.println("Создан персонаж " + this.getName());
    }
    public String toString() {
        return "Имя афиши: " + this.getName() + ", Форма афиши: " + this.getForm();
    }
    public void Special(Color o) {
                System.out.println(o.getName() + " " + this.getName() + " приклеился к крыше");
    }

    private void rot(){
        System.out.println("Некоторые листочки могут гнить, так как сделаны из некачесвенной бумаги");
    }
    public class Compound {
        public void rot(){
            SpecialPoster.this.rot();
        }
    }
    public void start(Burn instance){
        instance.burn();
    }
    public void test(){
        start(new Burn(){
            public void burn(){
                System.out.println("Одна из афиш залетела в трубу и сгорела");
            }
        });
    }

}
