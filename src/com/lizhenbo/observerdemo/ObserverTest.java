package com.lizhenbo.observerdemo;

public class ObserverTest {

	public static void main(String[] args) {
		//创建一个名字为马云的Hr的通知者
		HrSubject hr=new HrSubject("马云");
		//创建了三个校招人员的订阅者
		StudentObserver student01=new StudentObserver("李振博");
		StudentObserver student02=new StudentObserver("李明夏");
		StudentObserver student03=new StudentObserver("李明月");
		//添加和移除订阅者
		hr.Attach(student01);
		hr.Attach(student02);
		hr.Attach(student03);
		hr.Detach(student03);
		//通知已经添加的所有订阅者
		hr.NotifyObserver();
	}
}
