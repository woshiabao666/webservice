import com.jjh.service.HelloWebService;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {
        //创建CXF代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        factory.setAddress("http://localhost:8000/ws/hello");

        //设置接口类型
        factory.setServiceClass(HelloWebService.class);

        //对接口生成代理对象
        HelloWebService helloWebService = factory.create(HelloWebService.class);

        //远程访问服务端方法
        String result = helloWebService.sayHello("Jack");
        System.out.println(result);
        System.out.println(helloWebService.getClass());

    }

}
