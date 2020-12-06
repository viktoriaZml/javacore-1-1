public class Main {

  public static void main(String[] args) {
    Calculator calc = Calculator.instance.get();

    int a = calc.plus.apply(1, 2);
    calc.println.accept(a);
    int b = calc.minus.apply(1, 1);
    calc.println.accept(b);
    int c = calc.devide.apply(a, b);
    calc.println.accept(c);
    int d = calc.multiply.apply(a, a);
    calc.println.accept(d);
    int e = calc.minus.apply(d, 10);
    calc.println.accept(e);
    if (!calc.isPositive.test(e)){
      int f = calc.abs.apply(e);
      calc.println.accept(f);
    }
  }
}
