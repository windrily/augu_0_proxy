package com.augu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author：邹超旭
 * @Date:Created in 14:41 2018/3/6
 * @Modify by：
 * @Despriction：
 */
public class ClientTest {

    public static void main(String args[]) {
        SellFisher s = new ConcreteSellFisher();
        InvocationHandler p = new ProxySellFisher(s);
        Object obj = Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), p);
        System.out.println(((SellFisher)obj).sellFish());
    }
}
