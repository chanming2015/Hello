/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Project:UserRoleMenu
 * Package:entity
 * FileName:Role.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-9 ����4:47:30
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Role {
	
	private int id;
	private String name;
	private Set<Operator> operators = new HashSet<Operator>();
	
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
	public Set<Operator> getOperators() {
		return operators;
	}
	public void setOperators(Set<Operator> operators) {
		this.operators = operators;
	}
	public Role(){
		
	}
	public Role(String name) {
		this.name = name;
	}

}
