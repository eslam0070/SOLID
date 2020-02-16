package com.eso.solid.liskov;

/*Every child/sub class should be a substitution to its parent class*/
public class MyCar extends Car {

    public MyCar(int speed, String color) {
        super(speed, color);
    }
}
