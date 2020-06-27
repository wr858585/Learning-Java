package com.oono.exer3;
/*
 * interface CompareObject{
 * 	public int compareTo(OBject o);
 * 		//若返回值是0，代表相等；若为正，代表当前对象打；若为负，代表当前对象小
 * }
 * 
 * 
 */
public interface CompareObject {

	//Abstract method does not have a body.因为接口中定义的都是抽象方法，所以不能写方法体！
	//毕竟，接口提供的是规范，实现类才实现这些抽象方法
//	public int compareTo(Object o){
//		
//	}
	
	//若返回值是0，代表相等；若为正，代表当前对象打；若为负，代表当前对象小
	public int compareTo(Object o);
	
}
