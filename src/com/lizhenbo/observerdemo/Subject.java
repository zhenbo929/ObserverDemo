package com.lizhenbo.observerdemo;
/**
 * 通知者的接口,所有具体的通知者,必须实现该接口
 * 暂且可以比作,面试通知的功能(HR,项目经理,老板...谁需要这个功能谁就实现这个接口)
 * @author LIZHENBO
 */
public interface Subject {
	//添加订阅者
	void Attach(Observer observer);
	//移除订阅者
	void Detach(Observer observer);
	//通知订阅者
	void NotifyObserver();
}
