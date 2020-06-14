package com.oono.exer2;
/*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额
 * 再CheckAccount类中重写withdraw方法，其算法如下：
 * 		如果（取款金额 < 账户余额），
 * 		可直接取款；
 * 		如果（取款金额 > 账户余额），
 * 		计算需要透支的额度
 * 		判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 			将账户余额修改为0，冲减可透支金额
 * 		如果不可以
 * 			提示用户超过可透支额的限额
 * 
 * 
 */
public class CheckAccount extends Account{

	//field
	private double overdraft;//可透支限额
	
	//constructor
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	//method
	public double getOverdraft(){
		return overdraft;
	}
	public void setOverdraft(double overdraft){
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount){//已经从父类继承了getter，不用super.getBalance()
//			getBalance() -= amount; 绝对错误，要好好想想
			//option 1:这个不是很现实，因为balance一般比较敏感，只会提供getter不会提供setter
//			setBalance(getBalance() - amount);
			//option 2:这个其实更自然
			super.withdraw(amount);
			//option 3:还可以把balance的权限改成protected，这样的话子类checkAccount可以用（无论再哪个package）
		}else if(overdraft >= amount - getBalance()){//透支额度+余额足够消费
			//下面两行代码一定不能交换先后顺序（想一下逻辑）
			overdraft -= (amount - getBalance());
			setBalance(0);
			//或者写成super.withdraw(getBalance());
		}else{
			System.out.println("超过可透支限额");
			
		}
	}
	
}
