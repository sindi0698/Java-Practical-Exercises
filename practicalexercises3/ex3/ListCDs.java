package com.practicalexercises3.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ListCDs {
    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    List<CD> cdList = new ArrayList<CD>(Arrays.asList(
            new CD("Arcade Fire", "Funeral", 2004, 500.00),
            new CD( "Rufus", "Ask Rufus", 1977, 499.00),
            new CD("Suicide", "Suicide", 1977, 356),
            new CD( "Rufus", "Light", 1980, 300.00),
            new CD("Shakira", "Donde estan los Ladrones", 1998, 860)));

    public ArrayList<CD> printCDs(){
        logger.log(Level.INFO, "Printed the list of CDs...");
        return (ArrayList<CD>) cdList;
    }

    public void insertCd(CD cd){
        cdList.add(cd);
        logger.log(Level.INFO, "Program inserted the new CD in the CD list...");
    }

    public CD findCDByTitleName(String title){
        Optional<CD> foundCD =  cdList.stream().filter(cd -> cd.getTitle() == title).findFirst();
        logger.log(Level.INFO, "Program found the CD title in the CD list...");
        return foundCD.orElse(null);
    }

    public void deleteCd(String cdName) {
        CD cdToBeDeleted = findCDByTitleName(cdName);
        try {
            if (cdToBeDeleted == null) {
                logger.log(Level.WARNING, "Program can not find the CD title in the CD list as it does not exist...");
                throw new CDException("This cd is null, so it can't be deleted!");
            }
            logger.log(Level.WARNING, "Program deleted the CD title in the CD list...");
            cdList.remove(cdToBeDeleted);
        } catch (CDException e) {
            System.out.println("Exception occured: " + e);
        }
    }

   public double calculateTotalPriceOfCDs(){
        double totalPrice = 0;
        for(CD cd : cdList){
           totalPrice += cd.getPrice();
       }
       logger.log(Level.INFO, "Program calculated the total price of CDs...");
       return totalPrice;
   }

   public List listOfCDsForAuthor(String authorName){
        List<CD> listOfCDsForAuthor = new ArrayList<>();
       for(CD cd : cdList){
           if(cd.getAuthor().equals(authorName)){
               listOfCDsForAuthor.add(cd);
           }
       }
       logger.log(Level.INFO, "Program found the list of CDs for the given author...");
       return listOfCDsForAuthor;
   }

}

