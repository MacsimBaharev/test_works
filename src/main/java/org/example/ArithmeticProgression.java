package org.example;

public class ArithmeticProgression extends Progression{

    public ArithmeticProgression(double firstNumber, double difference){
        super(firstNumber, difference);
    }

    @Override
    public double getNumber(int n) {
        if (n > 0) {
            n--;
            return super.getFirst() + n * super.getDifference();
            //находим n-ый член арифметической прогрессии
        }
        else {
            throw new ArithmeticException("Wrong index");
        }
    }

    @Override
    public double summ(int n) {
        if (n > 0) {
            n--;
            return (n + 1) * ((super.getFirst() + getNumber(n)) / 2);
            //находим сумму n членов арифметической прогрессии
        }
        else {
            throw new ArithmeticException("Wrong index");
        }
    }
}
