package com.oono.team.view;

import com.oono.team.service.NameListService;
import com.oono.team.service.TeamService;

public class TeamView {
	
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public void enterMainMenu(){
		
		boolean loopFlag = true;
		
		while(loopFlag){
			listAllEmployees();
			
			System.out.print("1-团队成员 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
			char menu = TSUtility.readMenuSelection();
			switch(menu){
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("退出");
				break;
			}
		}
		
		listAllEmployees();
		
		System.out.print("1-团队成员 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4)：");
		char menu = TSUtility.readMenuSelection();
		switch(menu){
		case '1':
			getTeam();
			break;
		case '2':
			addMember();
			break;
		case '3':
			deleteMember();
			break;
		case '4':
			System.out.println("退出");
			break;
		}
		
	}
	/**
	 * @description 显示所有员工信息
	 */
	private void listAllEmployees(){
		System.out.println("显示所有员工信息");
	}
	private void getTeam(){
		System.out.println("查看开发团队情况");
	}
	private void addMember(){
		System.out.println("添加团队成员");
	}
	private void deleteMember(){
		System.out.println("删除团队成员");
	}
	
	public static void main(String[] args){
		TeamView view = new TeamView();
		view.enterMainMenu();
	}

}
