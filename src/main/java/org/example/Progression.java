package org.example;

public abstract class Progression {
    private double first;

    private double difference;

    public Progression(double firstNumber, double difference){
        first = firstNumber;
        this.difference = difference;
    }

    public double getFirst(){
        return first;
    }

    public double getDifference(){
        return difference;
    }

    public abstract double summ(int n);

    public abstract double getNumber(int n);
}
