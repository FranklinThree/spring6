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

    private Object target;

    public TimeInvocationHandler(Object target) {
        this.target = target;
    }

    /*
    * 1. 为什么必须要求你实现InvocationHandler接口？
    *   因为一个类实现接口就必须实现接口中的方法。
    *   以下这个方法必须是invoke()，因为JDK在底层调用invoke()方法的程序已经提前写好了。
    *   注意：invoke()方法不是我们程序员负责调用的，是JDK负责调用的。
    * 2. invoke方法什么时候被调用的？
    *   当代理对象调用代理方法的时候，注册在InvocationHandler接口的invoke()方法就会被调用。
    *
    * 3. invoke方法的参数是什么？
    *   invoke方法是JDK负责调用的，所以JDK调用这个方法的时候 会自动给我们传过来这三个参数
    *   我们可以在invoke方法的大括号中直接调用
    *   1. proxy：代理对象，这个参数使用较少
    *   2. method：代理对象调用的方法。（要执行的目标方法就是它）
    *   3. args：代理对象调用的方法的参数
    *
    *   invoke方法执行过程中，使用method来调用目标对象的目标方法。
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这个接口的目的就是为了让你有地方写增强代码的
        System.out.println("增强1");
        // 调用目标对象上的目标方法
        // 方法四要素：对象，方法，参数，返回值
        method.invoke(target, args);
        System.out.println("增强2");
        return null;
    }
}
