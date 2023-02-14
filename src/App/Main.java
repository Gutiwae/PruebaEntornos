package App;

import java.util.stream.DoubleStream;
@Author Guti
public class Main {
//Metodo para hacer una suma entre dos variables
static double add(double... operands) {
        return DoubleStream.of(operands)
        .sum();
        }
//Metodo para multiplicar dos numeros
static double multiply(double... operands) {
        return DoubleStream.of(operands)
        .reduce(1, (a, b) -> a * b);
        }
        }