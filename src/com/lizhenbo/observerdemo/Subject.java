package com.lizhenbo.observerdemo;
/**
 * ֪ͨ�ߵĽӿ�,���о����֪ͨ��,����ʵ�ָýӿ�
 * ���ҿ��Ա���,����֪ͨ�Ĺ���(HR,��Ŀ����,�ϰ�...˭��Ҫ�������˭��ʵ������ӿ�)
 * @author LIZHENBO
 */
public interface Subject {
	//��Ӷ�����
	void Attach(Observer observer);
	//�Ƴ�������
	void Detach(Observer observer);
	//֪ͨ������
	void NotifyObserver();
}
