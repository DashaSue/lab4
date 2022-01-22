package ru.ifmo.se.pokemon;

import java.util.Objects;

public abstract class Posters {
    private String name;
    private String form;
    private boolean whirling;
    private boolean falling;
    private boolean tearing;

    Posters(String name, String form, boolean whirling, boolean falling, boolean tearing) {
        this.name = name;
        this.form = form;
        this.whirling = whirling;
        this.falling = falling;
        this.tearing = tearing;
    }
    public String getName(){
        return this.name;
    }
    public String getForm() {
        return this.form;
    }
    public boolean getWhirling() {
        return this.whirling;
    }
    public boolean getFalling() {
        return this.falling;
    }
    public boolean getTearing() {
        return this.tearing;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Posters posters = (Posters) o;
        return this.name.equals(posters.name) && this.form.equals(posters.form);
    }

    @Override
    public String toString() {
        return "Posters{" +
                "Имя='" + name + '\'' +
                ", форма='" + form + '\'' +
                ", кружащиеся=" + whirling +
                ", падающие=" + falling +
                ", рвущиеся=" + tearing +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, form, whirling, falling, tearing);
    }

}

