package proxy.client;


import proxy.service.OrderService;
import proxy.service.OrderServiceImpl;

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
        * 3.调用处理器，InvocationHandler h：用于指定代理类的方法调用时，需要执行的代码
        *
        * */
        Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), (proxy, method, args1) -> {
            // 增强
            long begin = System.currentTimeMillis();
            Object invoke = method.invoke(orderService, args1);
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - begin) + "ms");
            return invoke;
        });
    }
}
