package com.jjh.Impl;/**
 * @description:
 * @author: jay
 * @time: 2022/7/10
 */

import com.jjh.api.HelloWebService;

/**
 *@ClassName HelloServiceImpl
 *@Description TODO
 *@Author jay
 *@version 1.0.0
 */
public class HelloServiceImpl implements HelloWebService {
    public String sayHello(String name) {
        System.out.println("hello " + name);
        return name;
    }
}
