package proxy.util;

import proxy.service.TimeInvocationHandler;

import java.lang.reflect.Proxy;

/**
 *  代理工具类
 *
 * @author FranklinThree
 * @date 2023/04/05
 * @className ProxyUtil
 * @see
 * @since 1.0.0
 */
public class ProxyUtil {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimeInvocationHandler(target));
    }
}
