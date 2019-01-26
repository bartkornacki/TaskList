package notification;

import employee.NotificationDTO;

public interface Observer {
    void update(NotificationDTO notificationDTO);
}
