package com.github.franklinthree.method.factory;

/**
 * 枪工厂
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class GunFactory extends WeaponFactory{
	/**
	 * 生产枪
	 *
	 * @return {@link Weapon}
	 */
	@Override
	public Weapon get() {
		return new Gun();
	}
}
