package com.github.franklinthree.simple.factory;

/**
 * 坦克
 * 具体产品角色
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class Tank extends Weapon{
	@Override
	public void attack() {
		System.out.println("坦克开炮！！！");
	}
}
