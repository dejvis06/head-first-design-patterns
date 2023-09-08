package com.example.chapter2.abstraction;

import com.example.chapter2.abstraction.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
