package com.lizhenbo.observerdemo;

import java.util.ArrayList;
/**
 * �����֪ͨ��Hr(Boss,��Ŀ����ľ����಻��׸��)
 * @author LIZHENBO
 */
public class HrSubject implements Subject{
	
	private String name;//���ַǱ�Ҫ,Ϊ�˷��������ϵ�
	
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
			System.out.println("����Hr:"+name+",֪ͨ��������!!");
			observer.Update();
		}
	}
}
