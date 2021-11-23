package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Notification;

public interface DaoNotificationInter {
	public int Save(Object object);
	public List<Notification> getData();
	public int delete(Object object);
	public int update(Object object);

}
