package com.github.franklinthree.simple.factory;

public class WeaponFactory {
	/**
	 * 静态方法。要获取什么产品？就看你传什么参数，传TANK获取坦克，传DAGGER获取匕首，传FIGHTER获取战斗机
	 * 简单工厂模式中有一个静态方法，所以被称为：静态工厂方法模式。
	 *
	 * @param weaponType 武器类型
	 * @return {@link Weapon}
	 */
	public static Weapon get(String weaponType){
		return switch (weaponType) {
			case "TANK" -> new Tank();
			case "DAGGER" -> new Dagger();
			case "FIGHTER" -> new Fighter();
			case "" -> null;
			default -> throw new RuntimeException("不支持该武器的生产");
		};
	}
}
