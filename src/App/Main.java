package App;

import java.util.stream.DoubleStream;
@Author Guti
public class Main {

static double add(double... operands) {
        return DoubleStream.of(operands)
        .sum();
        }

static double multiply(double... operands) {
        return DoubleStream.of(operands)
        .reduce(1, (a, b) -> a * b);
        }
        }