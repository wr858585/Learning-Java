package com.oono.team.domain;

import com.oono.team.service.Status;

public class Programmer extends Employee{
	
	private int memberId;//开发团队中的id（TID：Team ID）
	private Status status;//Status是枚举类，之后可以换种写法
	private Equipment equipment;
	
	public Programmer(){
		
	}
	public Programmer(int id, String name, int age, double salary, Equipment equipment){
		super(id, name, age, salary);
		this.equipment = equipment;
	}
	
	public int getMemberId(){
		return memberId;
	}
	public void setMember(int memberId){
		this.memberId = memberId;
	}
	public Status getStatus(){
		return status;
	}
	public void setStatus(Status status){
		this.status = status;
	}
	public Equipment getEquipment(){
		return equipment;
	}
	public void setEquipment(Equipment equipment){
		this.equipment = equipment;
	}

}
