package com.oono.exer2;
/*
 * 编写Order类，有int型的orderId，String型的orderName
 * 相应的getter和setter方法，两个参数的构造器
 * 重写父类的equals()方法: public boolean equals(Object obj)
 * 并判断测试类中创建的两个对象是否相等
 * 
 */
public class OrderTest {

	public static void main(String[] args) {
		
		Order order1 = new Order(1001, "AA");
		Order order2 = new Order(1001, "BB");
		System.out.println(order1.equals(order2));//false
		
		Order order3 = new Order(1001, "BB");
		System.out.println(order3.equals(order2));//true
		
		String s1 = "BB";
		String s2 = "BB";
		System.out.println(s1 == s2);//true
//		分析：虽然s1，s2是引用数类，==比较的是地址是否相同（这一点不会改变）
//		但是特殊的是，它们是String类，但不是new出来的，不是放在堆空间中的，而是放在常量池中
//		而常量池有一个特点：如果它们的“数值内容”相同，则会复用。
//		所以s1，和s2，都是"BB"这个内容，s2会复用s1指向的这个"BB",为同一个obj，所以地址相同，用==判断仍然是true
//		如果是new出来的"BB"，则仍然是放在heap中，则返回false
	}
}

class Order{
	
	private int orderId;
	private String orderName;
	
	public Order(int orderId, String orderName){
		this.orderId = orderId;
		this.orderName = orderName;
	}
	
	public int getOrderId(){
		return orderId;
	}
	public void setOrderId(){
		this.orderId = orderId;
	}
	public String getOrderName(){
		return orderName;
	}
	public void setOrderName(String orderName){
		this.orderName = orderName;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Order){
			//为什么line48要强转，因为不转的话调不了Order类的结构！line49行的代码就写不出来
			Order order = (Order) obj;
			//为何不用getter,setter而直接可以调用Order的private结构呢？
			//因为private权限就只是对同一个类的内部可见，出了本类，其他class，package均要通过getter/setter调用本类的结构
			//但，这里就是在本类Order中啊，所以直接调用即可
//			return this.getOrderId() == order.getOrderId() && this.getOrderName().equals(order.getOrderName());
			return this.orderId == order.orderId && this.orderName.equals(order.orderName);
			//注意：前面一个判断写成==是因为两个都是基本数类，==比的就是数值内容，可以用，而且equals也调不了（基本数类）
			//注意：后面一个判断则一定不能写成==了，否则引用数类的==就是比较地址！而我们像比较数值内容，则调用String类的equals即可
			//超级注意：但是！这个例子中，如果写成了==，仍然会返回true!如：
//			return this.orderId == order.orderId && this.orderName == order.orderName;
//			因为String类型的对象（除非new出来的），其实不是放在堆中，而是放在常量池中的
		}
		return false;
		
	}
	
}