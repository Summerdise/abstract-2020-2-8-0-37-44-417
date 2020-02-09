package com;

public abstract class Chick {
    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }
}
