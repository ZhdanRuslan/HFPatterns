package ch5_singleton.impl1;

public class SingletonSync {
    private static SingletonSync uniqueInstance;

    private SingletonSync() {
    }

    public static synchronized SingletonSync getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }
}