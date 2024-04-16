package com.aber.crp.mapper;

import java.util.List;

import com.aber.crp.dto.NotificationDto;
import com.aber.crp.model.Notification;

public class NotificationMapper {
	  public static NotificationDto mapToNotificationDTO ( Notification notification, NotificationDto notificationDto) {
		  notificationDto.setid(notification.getId());
		  notificationDto.setMsg(notification.getMsg());
		  notificationDto.setPostId(notification.getPostId());
		  return notificationDto;
		  
	  }
	  
	  public static List<NotificationDto> maptoNotificationDtoList(List<Notification> notificationList, List<NotificationDto> notificationDtoList) {
	    	
		  notificationList.forEach(x -> notificationDtoList.add(mapToNotificationDTO(x, new NotificationDto())));
	    	return notificationDtoList;
	    }
}
