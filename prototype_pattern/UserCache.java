package prototype_pattern;

import java.util.HashMap;

public class UserCache {
	
   private static HashMap<String, User> userCache  = new HashMap<>();

   public static User getUser(String role) {
	   User cachedShape = userCache.get(role);
      return (User) cachedShape.clone();
   }

   // For each User run database query and create the respective user
   
   public static void loadCache() {
      AdminUser admin = new AdminUser();
      userCache.put(admin.getRole(),admin);
      
      GuestUser guest = new GuestUser();
      userCache.put(guest.getRole(),guest);
      
      OtherUser others = new OtherUser();
      userCache.put(others.getRole(),others);
   }
}