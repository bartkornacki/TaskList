package notification.strategy;

import notification.NotificationDTO;

import java.util.List;

public class NotificationSortDescStrategy implements NotificationSortStrategy{
    @Override
    public List<NotificationDTO> sort(List<NotificationDTO> notifications) {
        notifications.sort((o1,o2)-> o2.getTime().compareTo(o1.getTime()));
        return notifications;
    }
}
