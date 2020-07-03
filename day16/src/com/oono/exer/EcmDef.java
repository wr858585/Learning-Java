package com.oono.exer;

/*
 * 编写应用程序EcmDef.java，接受命令行的两个参数，要求不能输入负数，计算两数相除
 * 		对数类不一致（NumberFormatException)，缺少命令行参数（ArrayIndexOutOfBoundException，
 * 		除0（ArithmeticException）以及输入负数（EcDef自定义的异常）进行异常处理
 * 提示：
 * 		（1）在主类（EcmDef）中定义异常方法（ecm）完成两组数组相除功能
 * 		（2）在main()方法中使用异常处理语句进行异常处理
 * 		（3）在程序中，自定义对应输入负数的异常类（EcDef）
 * 		（4）运行时接受参数java EcmDef 20 10		//args[0]="20" args[1]="10"
 *		（5）Integer类的static方法parseInt(String s)将s转换成对应的int值
 *		如：int a=Integer.parseInt("314");		//a=314; 
 * 
 */
public class EcmDef {
	public static void main(String[] args) {

		try {
			double i = Double.parseDouble(args[0]);
			double j = Double.parseDouble(args[1]);
			double result = ecm(i, j);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
			;
		} catch (ArithmeticException e) {
			System.out.println("除0");
			;
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}
	}

	public static double ecm(double i, double j) throws EcDef { // 这里写成静态是为了方便，不用在main方法中造一个对象去调了
		if (i < 0 || j < 0) {
			throw new EcDef("分子或分母为负数了");
		}
		return i / j;
	}
}
