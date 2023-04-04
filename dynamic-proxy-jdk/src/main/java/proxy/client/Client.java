package proxy.client;


import proxy.service.OrderService;
import proxy.service.OrderServiceImpl;
import proxy.service.TimeInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService orderService = new OrderServiceImpl();
        // 创建代理对象
        /*
        * newProxyInstance翻译为：创建一个新的代理对象
        * 本质上，这个方法的执行，做了两件事：
        * 1.在内存中动态的生成了一个代理类的字节码class
        * 2.new对象了。通过内存中生成的代理类的字节码class，创建了一个代理对象
        *
        * Proxy.newProxyInstance需要三个参数：类加载器、目标对象实现的接口、调用处理器
        * 1.类加载器，ClassLoader loader：用于加载代理类的字节码class
        *       在内存当中生成的字节码也是class文件，要执行性也得先加载到内存中，所以需要类加载器
        * 2.目标对象实现的接口，Class<?>[] interfaces：用于指定代理类实现哪些接口
        *       在内存中生成代理类的时候，这个代理类是需要你告诉他实现那些接口的。
        * 3.调用处理器，InvocationHandler h：用于指定代理类的方法调用时，需要执行的代码
        *       InvocationHandler 被翻译为：调用处理器。是一个接口。
        *       在调用处理器接口中编写的就是：增强代码
        *       因为具体要增强什么代码，JDK动态代理技术它是猜不到的。没有那么神。
        *       既然是接口，就要写接口的实现类。
        *
        *       可能会有疑问？
        *           自己还要动手调用持利器接口的实现类这不会导致类爆炸吗？不会。
        *           因为这种调用处理器写一次就好。
        *
        * */
;
        OrderService proxyOs = (OrderService)Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), new TimeInvocationHandler(orderService));
        // 代理对象调用方法
        // 注意：调用代理对象的代理方法的时候，如果你要做增强的话，目标对象的目标方法得保证执行。
        proxyOs.detail();
        proxyOs.modify();
        proxyOs.generate();
    }
}
