package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类路径应用程序上下文
 *
 * @author FranklinThree
 * @date 2023/03/31
 * @className ClassPathApplicationContext
 * @see @see ApplicationContext
 * @since 1.0.0
 */
public class ClassPathApplicationContext implements ApplicationContext{

    public static final Logger logger = LoggerFactory.getLogger(ClassPathApplicationContext.class);

    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 解析myspring的配置文件，然后初始化所有的Bean对象
     *
     * @param configLocation spring配置文件的路径。注意：使用ClassPathApplicationContext时，配置文件应当放到类路径下。
     * @return
     */
    public ClassPathApplicationContext(String configLocation) {
        try {
            // 解析myspring配置文件，然后实例化Bean，将Bean存放到singletonObjects集合当中。
            // 这是dom4j解析XML文件的核心对象。
            SAXReader reader = new SAXReader();
            // 获取一个输入流，这个输入流对应于myspring的配置文件。
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            // 读文件
            Document document = reader.read(in);
            // 获取所有bean标签
            List<Node> nodes = document.selectNodes("//bean");
            // 遍历所有bean标签
            nodes.forEach(node -> {

//                System.out.println(node);

                try{
                    // 向下转型的目的是为了使用Element接口里更加丰富的方法
                    Element beanElt = (Element) node;
                    // 获取id属性
                    String id = beanElt.attributeValue("id");
                    // 获取class属性
                    String className = beanElt.attributeValue("class");
                    logger.info("beanName = " + id);
                    logger.info("beanClassName = " + className);

                    // 通过反射机制创建对象，将其放到singletonObjects集合当中，提前曝光。
                    Class<?> aClass = Class.forName(className);
                    Constructor<?> dfCon = aClass.getDeclaredConstructor();
                    Object bean = dfCon.newInstance();
                    // 将Bean曝光，加入到singletonObjects集合当中。
                    singletonObjects.put(id, bean);
                    // 记录日志
                    logger.info(singletonObjects.toString());

                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            });
        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Object getBean(String beanName) {
        return singletonObjects.get(beanName);
    }
}
