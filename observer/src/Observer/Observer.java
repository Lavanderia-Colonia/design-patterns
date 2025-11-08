package Observer;

import java.sql.Timestamp;

public interface Observer {
    void update(LogType type, String message, Timestamp timestamp);
}
