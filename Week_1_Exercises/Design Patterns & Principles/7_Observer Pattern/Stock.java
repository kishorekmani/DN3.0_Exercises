import java.util.ArrayList;
import java.util.List;

public interface Stock {
    void registerObserver(Observer o);
    void deregisterObserver(Observer o);
    void notifyObservers();
}
