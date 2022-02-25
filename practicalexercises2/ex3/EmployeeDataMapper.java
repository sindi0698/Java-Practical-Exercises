package com.practicalexercises2.ex3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataMapper extends Mapper {

    @Override
    public List map(List list, Object replacementItem) throws NullItemException, EmptyListException {

        List<Object> listOfItemsToReturn = new ArrayList<Object>();
        if (list.isEmpty()) {
            throw new EmptyListException("The list to be replaced is empty and can not be mapped.");
        }
        for (Object itemOfList : list) {
            if (itemOfList == null) {
                throw new NullItemException("This item" + itemOfList + " in the list is null and can not be mapped.");
            } else {
                listOfItemsToReturn.add(replacementItem);
            }
        }
        return listOfItemsToReturn;
    }
    @Override
    public List reverseMap(Object replacementItem, List list) throws NullItemException, EmptyListException {
        List<Object> listOfItemsToReturn = new ArrayList<Object>();
        if (list.isEmpty()) {
            throw new EmptyListException("The list to be replaced is empty and can not be mapped.");
        }
        for (Object itemOfList : list) {
            if (itemOfList == null) {
                throw new NullItemException("This item" + itemOfList + " in the list is null and can not be mapped.");
            } else {
                listOfItemsToReturn.add(replacementItem);
            }
        }
        return listOfItemsToReturn;
    }
}

