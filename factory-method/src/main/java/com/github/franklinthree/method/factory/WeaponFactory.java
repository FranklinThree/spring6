package com.github.franklinthree.method.factory;

/**
 * 武器工厂
 *
 * @author franklin3
 * @date 2023/03/23
 */
public abstract class WeaponFactory {

	/**
	 * 得到武器
	 * 这个方法不是静态的，是示例方法。
	 *
	 * @return {@link Weapon}
	 */
	public abstract Weapon get();
}
