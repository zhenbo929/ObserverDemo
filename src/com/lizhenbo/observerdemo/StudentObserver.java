package com.lizhenbo.observerdemo;
/**
 * ����Ĺ۲���Student(������),������Ա�ľ����಻��׸��
 * @author LIZHENBO
 */
public class StudentObserver implements Observer{

	private String name;//���ַǱ�Ҫ,Ϊ�˷��������ϵ�
	
	public StudentObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void Update() {
		System.out.println("����"+name+"�ѽ��յ�����֪ͨ,һ��׼ʱ����!!");
	}

}
