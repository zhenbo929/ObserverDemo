package com.lizhenbo.observerdemo;
/**
 * 具体的观察者Student(订阅者),社招人员的具体类不在赘述
 * @author LIZHENBO
 */
public class StudentObserver implements Observer{

	private String name;//名字非必要,为了方便理解加上的
	
	public StudentObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void Update() {
		System.out.println("我是"+name+"已接收到面试通知,一定准时到达!!");
	}

}
