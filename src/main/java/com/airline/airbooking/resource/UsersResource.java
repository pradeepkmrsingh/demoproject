package com.airline.airbooking.resource;
import com.airline.airbooking.document.Users;
import com.airline.airbooking.document.Booking;
import com.airline.airbooking.document.Email;
import com.airline.airbooking.document.Login;
import com.airline.airbooking.document.Message;
import com.airline.airbooking.document.Role;
import com.airline.airbooking.document.UserArray;
import com.airline.airbooking.document.Userbooking;
import com.airline.airbooking.repository.Saveuserdata;
import com.airline.airbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Saveuserdata usersavedata;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/signup")
    @ResponseBody
    public Message Signup(@RequestBody Users payload) {
        Optional<Users> u = userRepository.findById(payload.getEmail());
        if (!u.isPresent()) {
            userRepository.save(payload);
            return new Message("successfull");
        } else
            return new Message("Invalid");   
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    @ResponseBody
    public Role Login(@RequestBody Login payload) {
        Optional<Users> y = userRepository.findById(payload.getEmail());
        if (y.isPresent() == true) {
            String a = y.get().getEmail();
            String b = payload.getEmail();
            String x = y.get().getPassword();
            String w = payload.getPassword();
            String r = y.get().getRole();
            if (a.contentEquals(b) && x.contentEquals(w)) {
                return new Role(r, "authorized", y.get().getName());
            } else
                return new Role("none", "unauthorized", "none");
        } else {
            return new Role("none", "unauthorized", "none");
        }
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/booking")
    @ResponseBody
    public Message Book(@RequestBody Booking book) {
        System.out.println(book.getLoginemail() + " " + book.getFlightName() + " " + "hello");
        if (book.getLoginemail() != null) {
            ArrayList<UserArray> lst = new ArrayList<UserArray>();
            UserArray x = new UserArray(book.getFlightName(), book.getFlightnumber(), book.getDeparturedate(),
                    book.getReturndate(), book.getPrice(), book.getClas());
            Optional<Userbooking> y = usersavedata.findById(book.getLoginemail());
            if (y.isPresent() == false) {
                lst.add(x);
                usersavedata.save(new Userbooking(book.getLoginemail(), lst));
                return new Message("booked");
            } else {
                ArrayList<UserArray> z = y.get().getUserdata();
                z.add(x);
                usersavedata.save(new Userbooking(book.getLoginemail(), z));
                return new Message("booked");
            }
        }
        return new Message("not booked");
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/userlist")
    @ResponseBody
    public Optional<Userbooking> UserList(@RequestBody Email m) {
        System.out.println(m.getEmail());
        Optional<Userbooking> lst = usersavedata.findById(m.getEmail());
        if (!lst.isEmpty()) {
            return lst;
        }
        return null;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/alluserlist")
    public List<Users> Allusersdata()
    {
        List<Users> lst = userRepository.findAll();
        if(!lst.isEmpty())
        {
          return lst;
        }
        return null;
    }

}
