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
 * Project:AMSWeb
 * Package:entity
 * FileName:RoleMenu.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-24 下午7:55:09
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("serial")
public class RoleMenu implements Serializable {
	
	private Operator op;
	private Menu menu;
	
	public Operator getOp() {
		return op;
	}
	public void setOp(Operator op) {
		this.op = op;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
