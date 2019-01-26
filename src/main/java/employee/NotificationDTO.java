package employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NotificationDTO {
    private LocalDateTime time;
    private String msg;

    public NotificationDTO(LocalDateTime time, String msg) {
        this.time = time;
        this.msg = msg;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "NotificationDTO{" + time +", " + msg +'}';
    }
}
