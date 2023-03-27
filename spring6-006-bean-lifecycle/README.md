Bean的生命周期五步：
1. 实例化Bean
2. Bean属性赋值
3. 初始化Bean
4. 使用Bean
5. 销毁Bean

Bean生命周期七步：比五步添加的那两步在哪里？在初始化Bean的前和后。
1. 实例化Bean
2. Bean属性赋值
3. 执行“Bean后处理器“的before方法
4. 初始化Bean
5. 执行“Bean后处理器”的after方法
6. 使用Bean
7. 销毁Bean

Bean生命周期十步：比七步添加的那三步在哪里？

    点位1：在“Bean后处理器”的before方法之前
        干了什么事情？
            检查Bean是否实现了BeanNameAware接口，如果实现了，就调用setBeanName方法
            然后调用这些方法的目的是为了给你传递一些数据，让你更加方便调用。
    点位2：在“Bean后处理器”的after方法之后
        干了什么事情？
            检查Bean是否实现了InitializingBean接口，如果实现了，就调用接口中的方法。

    点位3：在使用Bean之后，或者说在Bean销毁之前
        干了什么事情？
            检查Bean是否实现了DisposableBean接口，如果实现了，就调用接口中的方法。

1. 实例化Bean
2. Bean属性赋值
3. 执行“Bean后处理器“的before方法
4. 初始化Bean
5. 执行“Bean后处理器”的after方法
6. 使用Bean
7. 销毁Bean