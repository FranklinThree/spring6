package com.github.franklinthree.method.factory;

/**
 * 匕首工厂
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class DaggerFactory extends WeaponFactory{
	/**
	 * 生产匕首
	 *
	 * @return {@link Weapon}
	 */
	@Override
	public Weapon get() {
		return new Dagger();
	}
}
