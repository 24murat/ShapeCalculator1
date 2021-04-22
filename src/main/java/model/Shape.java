package model;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private String name;

    protected Shape(String name){
        this.name = name;
    }

    protected abstract double getPerimeter();

    //protected abstract double getSquare();

    public String getName() {

        return name;
    }

}
