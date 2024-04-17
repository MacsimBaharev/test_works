package org.example;

public class GeometricProgression extends Progression{

    public GeometricProgression(double firstNumber, double difference){
        super(firstNumber, difference);
    }

    @Override
    public double getNumber(int n) {
        if (n > 0) {
            n--;
            return super.getFirst() * Math.pow(super.getDifference(), n);
            //находим n-ый член геометрической прогрессии
        }
        else {
            throw new ArithmeticException("Wrong index");
        }
    }

    @Override
    public double summ(int n) {
        if (n > 0) {
            n--;
            return (super.getFirst() - getNumber(n) * super.getDifference()) / (1 - n);
            //находим сумму n членов геометрической прогрессии
        }
        else {
            throw new ArithmeticException("Wrong index");
        }
    }
}
