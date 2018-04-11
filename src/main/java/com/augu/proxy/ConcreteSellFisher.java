package com.augu.proxy;

/**
 * @Author：邹超旭
 * @Date:Created in 14:38 2018/3/6
 * @Modify by：
 * @Despriction：
 */
public class ConcreteSellFisher implements SellFisher{
    public int sellFish() {
        System.out.println("my fish is delicious!!");
        return 10;
    }
}
