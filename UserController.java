ackage com.geeksforgeeks.jdbl9.restapi;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserContoller {

    public static HashMap<Integer, User> userInfo = new HashMap<>();
    @GetMapping("/users")
    public User getUser(@RequestParam(value = "userID", defaultValue = "1") int userID){
        return userInfo.get(userID);
    }
    
    @RequestMapping(value = "/userinfo", method = RequestMethod.POST)
    public void insertUser(@RequestBody User myUser){
        if(userInfo.containsKey(myUser.getUserID())){
            return;
        }
        userInfo.put(myUser.getUserID(), myUser);
    }

    @GetMapping("/get_users")
    public Map<Integer, User> getAllUsers(){
        return userInfo;
    }

    @DeleteMapping("/delete_user/{userId}")
    public void deleteUser(@RequestParam(value = "userId") int userId){
        if(userInfo.containsKey(userId)){
            userInfo.remove(userId);
        }
    }
}
