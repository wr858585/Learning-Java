package com.oono.java1;

import org.junit.Test;

/*
 * 异常的处理：抓抛模型
 * 
 * 过程一：抛 -> 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 * 				并将此对象抛出。
 * 				一旦抛出对象以后，其后的代码就不再执行
 * 
 * 过程二：抓 -> 可以理解为异常的处理方式：① try-catch-final ② throws
 * 
 * 二、try-catch-finally的使用
 * 
 * try{
 * 		//可能出现异常的代码
 * 
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ...
 * finally{
 * 		//一定会执行的代码
 * }
 * 
 * 说明：
 * 1. finally是可选的
 * 2. 使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，
 * 	    根据此对象的类型，去catch中进行匹配
 * 3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。
 *    一旦处理完成，就跳出当前的try-catch结构（在没有finally的情况下）
 *    继续执行其后的代码（相当于异常被处理了，程序可以继续，不会终止）
 * 4. catch中的异常类型如果没有子父类关系，则谁声明在上谁声明在下无所谓
 *    catch中的异常类型如果满足子父类关系，则子类一定要声明在父类的上面，否则报错
 * 5. 常用的异常对象处理的方式：① String getMessage() ② printStackTrace() 更常用，包含了①
 * 6. 在try结构中声明的变量，在出了try结构以后，就不能在被使用（狠正常，因为作用域）
 *    Solution：把变量的声明放在try外面且给一个初始化值，try语句里面只进行赋值。这样一来，出了try语句也能继续使用
 * 7. try-catch-finally结构可以嵌套
 *    
 *    
 *    
 * 体会1：使用try-catch-finally来处理编译时异常，可以让程序在编译时不再报错，但运行时仍可能报错
 * 	 	 相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
 * 
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常不针对运行时异常编写try-catch-finally了
 * 		   针对编译时异常，则我们一定要考虑异常处理
 */
public class ExceptionTest1 {

	@Test
	public void test1(){
		
		String str = "123";
		str = "abc";
		try{
			int num = Integer.parseInt(str);
			
			System.out.println("hello--------1");
		}catch(NumberFormatException e){
//			System.out.println("出现数值转换异常了，不要着急……");
			//String getMessage();
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println("出现空指针异常了，不要着急……");
			//printStackTrace();
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("出现异常了，不要着急……");
		}
		
		System.out.println("hello----------2");
	}
	
	
	
}
