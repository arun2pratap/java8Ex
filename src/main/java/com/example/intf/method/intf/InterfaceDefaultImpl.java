package com.example.intf.method.intf;

import com.example.intf.method.intf.InterfaceDefault1;
import com.example.intf.method.intf.InterfaceDefault2;

public class InterfaceDefaultImpl implements InterfaceDefault1, InterfaceDefault2 {

    @Override
    public void defaultMethod() {
        InterfaceDefault1.super.defaultMethod();
    }
}
