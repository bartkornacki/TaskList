package notification.strategy;

import notification.NotificationDTO;

import java.util.List;

public interface NotificationSortStrategy {

    List<NotificationDTO> sort(List<NotificationDTO> notifications);
}
