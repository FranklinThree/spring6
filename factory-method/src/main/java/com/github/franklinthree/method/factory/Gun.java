package com.github.franklinthree.method.factory;

/**
 * 枪
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class Gun extends Weapon{
	@Override
	public void attack() {
		System.out.println("开枪射击！！！");
	}
}
