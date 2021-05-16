package cn.luban.entity;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

public class Dog {
	public Dog(){
		System.out.println("Dog.dog=====>");
	}
//	@PostConstruct
	public void init(){
		System.out.println("Dog.init========>");
	}
//	@PreDestroy
	public void destory(){
		System.out.println("Dog.destory====>");
	}
}
