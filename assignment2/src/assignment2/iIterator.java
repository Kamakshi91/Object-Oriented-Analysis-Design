package assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamakshi
 */

public interface iIterator<T> {
    public T first();
    public boolean isDone();
    public T currentItem(); 
    public T next();
}
