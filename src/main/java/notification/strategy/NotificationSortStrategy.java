package notification.strategy;

import notification.NotificationDTO;

import java.util.List;

// Interfejs strategii sortowania
public interface NotificationSortStrategy {

    List<NotificationDTO> sort(List<NotificationDTO> notifications);
}
