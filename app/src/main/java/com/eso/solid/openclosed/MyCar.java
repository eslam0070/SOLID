package com.eso.solid.openclosed;

/*Objects should be open for extension but closed for modification*/
public class MyCar extends Car {

    public MyCar(int speed, String color) {
        super(speed, color);
    }
}
