package proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 专门负责计时的调用处理程序
 *
 * @author FranklinThree
 * @date 2023/04/05
 * @className TimeInvocationHandler
 * @see @see InvocationHandler
 * @since 1.0.0
 */
public class TimeInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
