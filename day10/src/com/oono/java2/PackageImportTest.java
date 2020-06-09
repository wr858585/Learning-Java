package com.oono.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import com.oono.exer4.Account;
import com.oono.exer4.Bank;

/*
 * 一、package关键字的使用
 * 1. intuition：为了更好的实现项目project中类的管理，创建package包的概念，方便管理
 * 2. 使用package声明类或接口所属的包，声明在源文件的首行（创建class时每次Eclipse自动写好的）
 * 3. 包，属于标识符identifier，所以要符合命名规则+命名规范（包名为xxxyyyzzz全小写），做到见名知意
 * 4. 每"."一次，就代表一层文件目录（所以我们左边所有project的structure都是照样存在working space里的）
 * 
 * 补充：同一个包下，不能命名同名的接口/类
 * 		不同的报下，可以命名同名的接口/类
 * mechanism：无论是windows下，linux下，任何系统中，都不可能会允许在同一个directory中两个文件重名
 * 
 * 5. JDK中主要的package
 * 		① java.lang i.e是java语言的核心类（language），如String, Math, Integer, System, Thread
 * 			(提供常用功能)
 * 		② java.net 跟网络操作相关的
 * 		③ java.io 跟IO流相关的（输入/输出 Input/Output)
 * 		④ java.util 包含了一些实用的工具类Utility，如日期日历，定义sys特性，接口的合集框架类
 * 		⑤ java.text 跟java格式化相关的
 * 		⑥ java.sql 和数据库相关的
 * 		⑦ java.awt 和显式一个GUI客户端界面/图形用户界面 相关的 B/S C/S 
 * 			(但是现在都不用java来写GUI了，所以不用看，都直接用浏览器来看java后台了）
 * 
 * 二、import关键字的使用
 * 1. import：导入。
 * 2. 在源文件中，显式地使用import结构，导入指定报下的类/接口
 * 3. 声明位置：在package下，在class上，如果有多个import则并列写下去（java会自动写好import语句）
 * 4. 也可以使用xxx.*的方式来表示导入的包/接口中的 所有结构
 * 5. 如果使用的类/接口是java.lang包中定义的，则可以省略import语句结构
 * 6. 如果调用的是current package定义下的类/接口，也可以省略import的语句接口
 * 		跨package 则要import
 * 		自然不能跨project，因为project是最大的working area
 * 7. 如果在源文件中，使用了不同包下的同名的类，则必须至少又一个类，需要以全类名的方式来显式
 * 		编译器complier才会知道谁是谁
 * 		实际开发中，java.sql和java.util两个package中都有Date类，当它们同时出现在同一个程序中，则有一个得全类名显式 to tell java which is which
 * 		理解：其实正常写java时，都需要写全类名的方式来写全忽儿。
 * 				为了简化，增加可读性，用import的方式统一来省略全类名
 * 				而进一步地，java.lang里面的String etc太常用了，所以默认不用import这些核心的类/接口都可以
 * 8. 使用"xxx.*"的方式表明可以调用xxx包下的所有结构
 * 		但是如果是调xxx 子包 下的结构，则仍需要全类名来显式地调
 * 		e.g import java.lang.reflect.Field 则不能省略，虽然是lang包的，但是是lang包的子包
 * 
 * 第九点用的少，理解即可
 * 9. import static:导入指定类/接口中的静态结构 i.e 静态结构 -> 属性或者方法
 * 		如System.out.println() 
 * 		在前面写上import java.lang.System.*;
 * 		则可以直接将sysout写成 out.println()即可了，省略System类
 * 
 * 区分：import导入的是指定package中的class/interface
 * 		import static不同，导入的是指定package中的class/interface中的field/method
 * 		这也是为什么前者是import java.lang
 * 					后者是import java.lang.System.*
 * 
 */
public class PackageImportTest {

	public static void main(String[] args) {
		
		String info = Arrays.toString(new int[]{1,2,3});//则java会自动在上面生成import语句！
		
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		HashMap map = new HashMap();
		
		Scanner s = null;
		
		System.out.println("hello!");
		
		Person p = new Person();
		
		Account acct = new Account(2000);
		com.oono.exer3.Account acct1 = new com.oono.exer3.Account(1000,2000,0.0123);//类的全类名
}
}
