package seminar_5.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс записывает логи операций калькулятора
 */
public class Logger {
    private List<String> logs = new ArrayList<>();

    public void log(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return logs;
    }
}
