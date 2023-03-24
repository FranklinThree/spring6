package com.github.franklinthree.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person> {
	// PersonFactoryBean也是一个Bean，只不过这个Bean比较特殊，叫做工厂Bean。
	// 通过工厂Bean这个特殊的Bean，我们可以得到一个普通的Bean。

	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	/**
	 * 得到对象类型
	 *
	 * @return {@link Class}<{@link ?}>
	 */
	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	/**
	 * 是单例
	 * 这个方在接口中有默认实现
	 * 默认返回true，表示是单例
	 * 如果想多例，就重写这个方法，返回false
	 *
	 * @return boolean
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}

