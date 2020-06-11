package com.oono.p2.ui;

import com.oono.p2.bean.Customer;
import com.oono.p2.service.CustomerList;
import com.oono.p2.util.CMUtility;

/**
 * 
 * @description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author oono
 * @version
 * @date 2020年6月10日下午4:49:26
 */
public class CustomerView {

	private CustomerList customerList = new CustomerList(10);

	/**
	 * @description 显示《客户信息管理软件》界面的方法
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------------------客户信息管理软件-----------------------");
			System.out.println("                         1.添 加 客 户");
			System.out.println("                         2.修 改 客 户");
			System.out.println("                         3.删 除 客 户");
			System.out.println("                         4.客 户 列 表");
			System.out.println("                         5.退      出\n");
			System.out.println("                       请选择(1-5):");

			char menu = CMUtility.readMenuSelection();

			switch (menu) {
			case '1':// 注意：1-5的选择是char型的不是int，否则switch-case一个都进不去
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				// System.out.println("退出");
				System.out.print("确认是否退出(Y/N): ");
				char isExit = CMUtility.readConfirmSelection();

				if (isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	}

	public void addNewCustomer() {
		// System.out.println("添加客户的操作");
		System.out.println("-----------------------添加客户-----------------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话：");
		String phone = CMUtility.readString(13);
		System.out.println("邮箱：");
		String email = CMUtility.readString(30);

		// 将上述数据封装到对象中
		Customer customer = new Customer(name, gender, age, phone, email);

		boolean isSuccess = customerList.addCustomer(customer);// 因为有可能添加失败，之前定义addCustomer方法时已经考虑到，会返回false
		if (isSuccess) {
			System.out.println("-----------------------添加成功-----------------------");
		} else {
			System.out.println("-----------------------客户目录已满，添加失败-----------------------");
		}
	}

	public void modifyCustomer() {
		// System.out.println("修改客户的操作");

		System.out.println("-----------------------修改客户-----------------------");

		// 先声明cust，这样line103跳出循环后使用cust.去调其结构仍然可行，否则完全在内部创建的var，无法在外面使用，scope不够
		Customer cust;
		int number;
		for (;;) {
			System.out.print("请选择待修改客户编号(-1退出): ");
			number = CMUtility.readInt();

			if (number == -1) {
				return;
			}

			cust = customerList.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;// 为何不在这里写for循环，是为了让结构简洁，跳出当前循环去写，减少套娃
			}
		}

		// 修改客户信息
		System.out.print("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());// 若user没有修改，则默认是cust.getName()，即名字不变
		System.out.print("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);

		customerList.replaceCustomer(number - 1, newCust);

		boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
		if (isReplaced) {
			System.out.println("-----------------------修改成功-----------------------");
		} else {// 其实前面已经保证index是对的，所以其实不会进入else的，一定可以修改成功
			System.out.println("-----------------------修改失败-----------------------");
		}
	}

	public void deleteCustomer() {
		// System.out.println("删除客户的操作");
		System.out.println("-----------------------删除客户-----------------------");

		int number;
		for (;;) {
			System.out.println("请选择待删除客户编号(-1退出): ");
			 number = CMUtility.readInt();

			if (number == -1) {
				return;
			}
			
			Customer customer = customerList.getCustomer(number - 1);

			if(customer == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
		}

		//找到了指定客户
		System.out.println("确认是否删除(Y/N): ");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y'){
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if(deleteSuccess){
				System.out.println("-----------------------删除成功-----------------------");
			}else{
				System.out.println("-----------------------删除失败-----------------------");
			}
			
		}/*else{
			return;
		}
		*/
		//上面这个结构可以省略，因为程序已经运行到最后退出当前方法了
	}

	public void listAllCustomers() {
		// System.out.println("显示客户列表的操作");
		// customerList.getAllCustomers();可不是这么简单，是要显示出来一个界面。
		System.out.println("-----------------------客户列表-----------------------");
		if (customerList.getTotal() == 0) {
			System.out.println("没有客户记录！");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {

				Customer cust = custs[i];// 或者不写这个变量，直接在line86里面写cust[i].去调用即可

				// 此时换行符需要写成双引号"\t"，否则不是连接运算，成了int和char型运算，是加法运算
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge()
						+ "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}

		System.out.println("-----------------------客户列表完成-----------------------");
	}

	// 程序入口：main方法。其他东西都在这里进行调用，定义的方法放外面，让main方法简洁
	public static void main(String[] args) {

		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}
