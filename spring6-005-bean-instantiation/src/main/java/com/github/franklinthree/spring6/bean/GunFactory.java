package com.github.franklinthree.spring6.bean;

/**
 * 枪工厂
 * 工厂方法模式当中的：具体工厂角色
 *
 * @author franklin3
 * @date 2023/03/24
 */
public class GunFactory {

	/**
	 * 工厂方法模式中的具体工厂角色中的方法是：实例方法
	 *
	 * @return {@link Gun}
	 */
	public Gun get(){
		// 实际上new这个对象还是我们程序员自己new的。
		return new Gun();
	}
}
