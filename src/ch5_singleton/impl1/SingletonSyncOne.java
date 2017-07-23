package ch5_singleton.impl1;

public class SingletonSyncOne {
    private volatile static SingletonSyncOne uniqueInstance;

    private SingletonSyncOne() {
    }

    public static SingletonSyncOne getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonSyncOne.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSyncOne();
                }
            }
        }
        return uniqueInstance;
    }
}