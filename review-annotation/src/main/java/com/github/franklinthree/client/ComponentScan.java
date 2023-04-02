package com.github.franklinthree.client;

import com.github.franklinthree.annotation.Component;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 组件扫描
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className ComponentScan
 * @see
 * @since 1.0.0
 */
public class ComponentScan {
    public static void main(String[] args) {
        // 获取包下所有的类
        String packageName = "com.github.franklinthree.bean";
        Map<String, Object> beanMap = new HashMap<>();
//        packageName = packageName.replace(".", "/");
        // 以下是使用正则表达式替换字符串中的所有匹配项
        String packagePath = packageName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        assert url != null;
        String path = url.getPath();
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
//            System.out.println(f.getName());
            String className = packageName + "." + f.getName().split("\\.")[0];
            try {
                // 反射机制解析注解
                Class<?> aClass = Class.forName(className);
                // 判断类上是否有Component注解
                if (aClass.isAnnotationPresent(Component.class)) {
                    // 获取注解
                    Component component = (Component) aClass.getAnnotation(Component.class);
                    String id = component.value();
                    // 有这个注解，就将这个类的实例放入到map中
                    Constructor<?> con = aClass.getDeclaredConstructor();
                    Object obj = con.newInstance();
                    beanMap.put(id, obj);

                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(beanMap);
    }
}
