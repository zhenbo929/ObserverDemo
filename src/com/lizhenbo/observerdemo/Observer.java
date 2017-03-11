package com.lizhenbo.observerdemo;
/**
 * 观察者的接口,所有具体的观察者都必须实现该接口
 * 暂且可以比作,观察者(所有具体的观察者(社招人员,校招人员...)接受到通知后要更新状态都必须实现该接口)
 * @author LIZHENBO
 *
 */
public interface Observer {
	//订阅者收到通知后更新状态
	void Update();
}
