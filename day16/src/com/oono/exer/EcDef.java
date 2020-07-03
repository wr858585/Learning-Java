package com.oono.exer;

//自定义异常类
public class EcDef extends Exception {

	static final long serialVersionUID = -12321124124213L;

	public EcDef() {

	}

	public EcDef(String msg) {
		super(msg);
	}

}
