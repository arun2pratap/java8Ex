package function;

import java.util.function.Function;

public class FunctionExample {

    public void functionTryout(Function<Number, String> function, int number){
        System.out.println(function.apply(number));
    }
}
