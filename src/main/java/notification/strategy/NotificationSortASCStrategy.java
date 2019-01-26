package notification.strategy;

import notification.NotificationDTO;

import java.util.Comparator;
import java.util.List;

public class NotificationSortASCStrategy implements NotificationSortStrategy {

    @Override
    public List<NotificationDTO> sort(List<NotificationDTO> notifications) {
        notifications.sort(Comparator.comparing(NotificationDTO::getTime));
        return notifications;
    }
}
