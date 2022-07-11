package com.jjh.service;

import javax.jws.WebService;

/**
 * @description:    对外发布服务的接口
 * @author: jay
 * @time: 2022/7/10
 */

@WebService(targetNamespace = "http://api.jjh.com/")
public interface HelloWebService {

    /**
     * 对外发布接口的方法
     * @param name
     * @return
     */
    public String sayHello(String name);

}
