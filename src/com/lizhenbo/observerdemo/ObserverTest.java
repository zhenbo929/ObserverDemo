package com.lizhenbo.observerdemo;

public class ObserverTest {

	public static void main(String[] args) {
		//����һ������Ϊ���Ƶ�Hr��֪ͨ��
		HrSubject hr=new HrSubject("����");
		//����������У����Ա�Ķ�����
		StudentObserver student01=new StudentObserver("����");
		StudentObserver student02=new StudentObserver("������");
		StudentObserver student03=new StudentObserver("������");
		//��Ӻ��Ƴ�������
		hr.Attach(student01);
		hr.Attach(student02);
		hr.Attach(student03);
		hr.Detach(student03);
		//֪ͨ�Ѿ���ӵ����ж�����
		hr.NotifyObserver();
	}
}
