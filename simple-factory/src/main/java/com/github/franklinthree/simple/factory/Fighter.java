package com.github.franklinthree.simple.factory;

/**
 * 战斗机
 * 具体产品角色
 *
 * @author franklin3
 * @date 2023/03/23
 */
public class Fighter extends Weapon{

	@Override
	public void attack() {
		System.out.println("战斗机抛下小男孩！！！");
	}
}
