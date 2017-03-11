package com.lizhenbo.observerdemo;

import java.util.ArrayList;
/**
 * 具体的通知类Hr(Boss,项目经理的具体类不在赘述)
 * @author LIZHENBO
 */
public class HrSubject implements Subject{
	
	private String name;//名字非必要,为了方便理解加上的
	
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	
	public HrSubject(String name) {
		super();
		this.name = name;
	}

	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void NotifyObserver() {
		for (Observer observer : observers) {
			System.out.println("我是Hr:"+name+",通知您来面试!!");
			observer.Update();
		}
	}
}
