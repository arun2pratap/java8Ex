package com.example.intf.method;

import com.example.intf.method.sam.Employee;
import com.example.intf.method.sam.MySAM;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class LamdaInterfaceMain {
    public static void main(String[] args) {
        Consumer<String> c1 = msg -> System.out.println(msg);
        Consumer<String> c3 = msg -> System.out.println(msg + " second");
        Consumer<String> c4 = msg -> System.out.println(msg + " Third");
        MySAM<Employee> c2 = Employee::getEmployeDis;
        c1.andThen(c3).andThen(c4).accept(" akad bakad");
        List testList = new ArrayList();
        Map map = new HashMap();
        Collections.unmodifiableMap(map);
        testList.stream().parallel();
//        c2.apply(new Employee("Emplye", 34));
//        c1.accept("Trying out lamda expression ");
    }
}
