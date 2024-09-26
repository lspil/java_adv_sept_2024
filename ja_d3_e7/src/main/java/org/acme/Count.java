package org.acme;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Count {

    private int value;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public /*synchronized*/ int get() {
        try {
            lock.readLock().lock();
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }

    public /*synchronized*/ void increment() {
        try {
            lock.writeLock().lock();
            value++;
        } finally {
            lock.writeLock().unlock();
        }
    }

}
