package com.practicalexercises2.ex3;

import java.util.List;

public abstract class Mapper<T, S> {

    public abstract List<S> map(List<T> list, S replacementItem) throws NullItemException, EmptyListException;

    public abstract List<T> reverseMap(T replacementItem, List<S> list) throws NullItemException, EmptyListException;
}
