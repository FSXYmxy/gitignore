package com;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @create: 2022/11/25 20:57
 */

public class Branch1 {
    @Test
    public void sayHello(String name){
        System.out.println("hello," + name + "!");
    }

}
