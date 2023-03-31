package org.myspringframework.core;

/**
 * 应用程序上下文
 *
 * @author FranklinThree
 * @date 2023/03/31
 * @className ApplicationContext
 * @see
 * @since 1.0.0
 */
public interface ApplicationContext {

    /**
     * 根据bean名字获取对应的bean对象。
     *
     * @param beanName myspring配置文件中的bean标签的id。
     * @return {@link Object } 对应的单例bean对象
     */
    Object getBean(String beanName);
}
