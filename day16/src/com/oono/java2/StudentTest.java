package com.oono.java2;

public class StudentTest {

	public static void main(String[] args) {
		
		try{
		Student s = new Student();
		s.register(-1001);
		System.out.println(s);
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}

class Student{
	
	private int id;
	
	public void register(int id) throws Exception{
		if(id > 0){
			this.id = id;
		}else{
//			System.out.println("您输入的数据非法");
			//手动抛出异常对象：throw 不是 throws
//			throw new RuntimeException("您输入的数据非法");
//			throw new Exception("您输入的数据非法");//手动抛异常，有时也需要的
			throw new MyException("不能输入负数");//package中自定义的异常
			
		}
	}
	
	@Override
	public String toString(){
		return "Student [id=" + id + "]";
	}
}