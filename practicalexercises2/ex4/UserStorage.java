package com.practicalexercises2.ex4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class UserStorage {
      ArrayList<User> usersList = new ArrayList<>(Arrays.asList(
                new User( "Sindi", "Dhima", 23, AppConstants.TRAINEE),
                new User( "Keidi", "Gjika", 22, AppConstants.TRAINEE),
                new User( "Juela", "Zeneli", 28, AppConstants.PRODUCT_OWNER),
                new User( "Dorrit", "Riemenschneider", 45, AppConstants.PRODUCT_OWNER)
        ));

        public void save(User newUser) {
                usersList.add(newUser);
        }

        public ArrayList<User> findAll(){
                    return usersList;
        }

        public User find(int id){
               Optional<User> foundUser =  usersList.stream().filter(user -> user.getId() == id).findFirst();
                return foundUser.orElse(null);
        }

        public void delete(int userId){
                User userToBeDeleted = find(userId);
               try{
                       if(userToBeDeleted == null){
                               throw new ServiceException("This user is not found, so it can't be deleted!");
                       }
                       usersList.remove(userToBeDeleted);
               }catch (ServiceException e){
                       System.out.println("Exception occured: " + e);
               }
        }

}
