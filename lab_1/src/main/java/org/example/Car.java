package org.example;

import java.util.Objects;

public class Car {
    private String  model;
    private String   manu;
    private String plates;

    public Car(String model, String manu, String plates) {
        this.model = model;
        this.manu = manu;
        this.plates = plates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(plates, car.plates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plates);
    }
}
