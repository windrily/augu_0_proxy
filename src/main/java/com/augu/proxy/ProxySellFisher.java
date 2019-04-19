package com.augu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author：Agwindy
 * @Date:Created in 14:38 2018/3/6
 * @Modify by：
 * @Despriction：
 */
public class ProxySellFisher implements InvocationHandler{


    private SellFisher sellFisher;

    public ProxySellFisher(SellFisher sellFisher) {
        this.sellFisher = sellFisher;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("the fish price higher");

//        这里调用原来的业务
        return (Integer)method.invoke(sellFisher, args)+10;
    }
}
