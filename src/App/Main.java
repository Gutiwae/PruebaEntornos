package App;

import java.util.stream.DoubleStream;
@Author Guti
public class Main {
//Metodo para hacer una suma entre dos variables
static double suma(double... operando) {
        return DoubleStream.of(operando)
        .sum();
        }
//Metodo para multiplicar dos numeros
static double multiplica(double... operando) {
        return DoubleStream.of(operando)
        .reduce(1, (a, b) -> a * b);
        }
        }