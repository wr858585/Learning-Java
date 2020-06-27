package com.oono.java1;
/*
 * 接口的应用：代理模式proxy
 * 
 * 
 */
public class NetworkTest {

	public static void main(String[] args) {
		
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		
		proxyServer.browse();
		
	}
	
}

interface Network{
	
	public void browse();
	
}

//被代理类
class Server implements Network{
	
	public void browse(){
		System.out.println("真是的服务器访问网络");
	}
	
}

//代理类（具体代码实现不用看懂，关乎代理的设计模式逻辑）
class ProxyServer implements Network{
	
	private Network work;
	
	public ProxyServer(Network work){
		this.work = work;
	}
	
	public void check(){
		System.out.println("联网之前的检查工作");
	}
	
	public void browse(){
		check();
		
		work.browse();
	}
	
	
}