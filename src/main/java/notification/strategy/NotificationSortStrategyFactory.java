package notification.strategy;

import notification.NotificationDTO;

import javax.naming.OperationNotSupportedException;
import java.util.List;

//Fabtyka która zwraca odpowiednią strategie na podstawie typu sortowania(malejąco/rosnąco)
public class NotificationSortStrategyFactory {
    private NotificationSortStrategy notificationSortASCStrategy;
    private NotificationSortStrategy notificationSortDescStrategy;

    public NotificationSortStrategyFactory() {
        notificationSortASCStrategy = new NotificationSortASCStrategy();
        notificationSortDescStrategy = new NotificationSortDescStrategy();
    }

    public NotificationSortStrategy getStrategy(NotificationSortStrategyType strategyType) throws OperationNotSupportedException {
        if(strategyType.equals(NotificationSortStrategyType.ASCENDING)){
            return notificationSortASCStrategy;
        }else if(strategyType.equals(NotificationSortStrategyType.DESCENDING)){
            return notificationSortDescStrategy;
        }else {
            throw new OperationNotSupportedException();
        }
    }
}
