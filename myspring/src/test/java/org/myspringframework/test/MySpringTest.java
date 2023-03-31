package org.myspringframework.test;

import org.junit.Test;
import org.myspringframework.core.ClassPathApplicationContext;
import org.myspringframework.core.ApplicationContext;


/**
 * myspring测试
 *
 * @author FranklinThree
 * @date 2023/03/31
 * @className MySpringTest
 * @see
 * @since 1.0.0
 */
public class MySpringTest {

    @Test
    public void testClassPathApplicationContext() {
        ApplicationContext applicationContext = new ClassPathApplicationContext("myspring.xml");
    }
}
