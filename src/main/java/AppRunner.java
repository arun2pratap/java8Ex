
import com.criteria.SearchCriteria;
import com.function.FunctionExample;
import com.predicate.PredicateExample;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class AppRunner {
    public static void main(String[] args) {
        Predicate<String> startWithjava = p -> p.startsWith("java");
        PredicateExample predicateExample = new PredicateExample();
        predicateExample.tryPredicate("java version 10", startWithjava);
/////////////////////////////////////////////////////////////
        predicateExample.tryPredicate("java java marjava",SearchCriteria.getInstance().getCriteria(SearchCriteria.START_WITHJAVA));
/////////////////////////////////////////////////////////////

        FunctionExample functionExample = new FunctionExample();
        Function<Number, String> function = number -> {
            StringBuilder str = new StringBuilder("");
            IntStream.range(1,number.intValue()+1).forEach(n->{
                str.append(n+"-");
            });
            return str.toString();
        };
        functionExample.functionTryout(function, 23);
    }
}
