package Subject;

import Observer.*;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(LogType type, String message);
}
