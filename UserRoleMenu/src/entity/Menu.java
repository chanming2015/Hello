/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package entity;

import java.io.Serializable;

/**
 * Project:AssetManagementSystemWeb
 * Package:entity
 * FileName:Menu.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:36:59
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class Menu implements Serializable {
	
	private int id;
	/**
	 * 权限名称
	 */
	private String name;
	/**
	 * 父级权限
	 */
	private Menu superMenu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu getSuperMenu() {
		return superMenu;
	}
	public void setSuperMenu(Menu superMenu) {
		this.superMenu = superMenu;
	}

}
