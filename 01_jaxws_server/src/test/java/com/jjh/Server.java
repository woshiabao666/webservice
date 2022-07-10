package com.jjh;/**
 * @description:
 * @author: jay
 * @time: 2022/7/10
 */

import com.jjh.Impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 *@ClassName Server
 *@Description TODO
 *@Author jay
 *@version 1.0.0
 */
public class Server {

    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        //设置服务地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");

        //设置服务类
        factoryBean.setServiceBean(new HelloServiceImpl());

        //发布服务
        factoryBean.create();

        System.out.println("服务发布成功，端口8000...");

    }

}
