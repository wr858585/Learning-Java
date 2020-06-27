package com.oono.exer3;
/*
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小
 * 
 * 
 */
public class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle(double radius){
		super(radius);
	}
	
	public int compareTo(Object o){
		if(this == o){
			return 0;
		}
		
		if(o instanceof ComparableCircle){
			ComparableCircle c = (ComparableCircle)o;//强转o成当前类型，否则无法调用当前类的结构
			//错误的做法（因为精度损失从double转成int，比如差为0.2直接变成了0，导致结论错了）
			// return (int) (this.getRadius() - c.getRadius());
			if(this.getRadius() == c.getRadius()){
				return 0;
			}else if(this.getRadius() > c.getRadius()){
				return 1;
			}else{
				return -1;
			}
		}
		throw new RuntimeException("传入的数据类型不匹配");
		
	}
	
	
}
