package com.github.franklinthree.spring6.bean;

/**
 * 星工厂
 *
 * @author franklin3
 * @date 2023/03/24
 */
public class StarFactory {

	// 工厂类中有一个静态方法。
	// 简单工厂模式又叫做：静态工厂方法模式。

	/**
	 * 得到
	 *
	 * @return {@link Star}
	 */
	public static Star get() {
		System.out.println("StarFactory createStar");
		// 这个Star对象最终实际上创建的时候还是我们负责new对象。
		return new Star();
	}
}
