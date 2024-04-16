package com.aber.crp.service;

import java.util.List;

import com.aber.crp.dto.NotificationDto;

public interface NotificationService {
	List<NotificationDto> getNotificationForCurrentUser();
	
	void deleteNotification(Long id);
	

}
