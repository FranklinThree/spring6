package com.github.franklinthree.simple.factory;

/**
 * 测试武器
 * 这是客户端程序
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class TestWeapon {
	public static void main(String[] args) {
		// 对于我客户端来说，坦克的生产细节，我不需要关心，我只需要向工厂索要即可。
		// 简单工厂模式达到了什么？职责分离。客户端不需要关心产品的生产细节。
		// 客户端只负责消费。工厂类负责生产。一个负责生产，一个负责消费。生产者和消费者分离了。这就是简单工厂模式的作用。
		// 需要坦克
		Weapon tank = WeaponFactory.get("TANK");
		tank.attack();
		// 需要匕首
		Weapon dagger = WeaponFactory.get("DAGGER");
		dagger.attack();
		// 需要战斗机
		Weapon fighter = WeaponFactory.get("FIGHTER");
		fighter.attack();
	}
}
