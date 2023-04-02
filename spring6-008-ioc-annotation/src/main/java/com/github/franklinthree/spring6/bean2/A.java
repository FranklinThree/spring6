package com.github.franklinthree.spring6.bean2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 一个
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className A
 * @see
 * @since 1.0.0
 */

@Component
public class A {
    public A() {
        System.out.println("A的无参数构造方法执行了");
    }
}

@Controller
class B{
    public B() {
        System.out.println("B的无参数构造方法执行了");
    }
}
@Service
class C{
    public C() {
        System.out.println("C的无参数构造方法执行了");
    }
}
@Repository
class D{
    public D() {
        System.out.println("D的无参数构造方法执行了");
    }
}

@Controller
class E{
    public E() {
        System.out.println("E的无参数构造方法执行了");
    }
}
