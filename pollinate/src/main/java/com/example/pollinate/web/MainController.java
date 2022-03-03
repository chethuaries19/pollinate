package com.example.pollinate.web;

import com.example.pollinate.model.Product;
import com.example.pollinate.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path="/app") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam Integer id
            , @RequestParam String timeStamp) throws ParseException {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Product n = new Product();
        n.setId(id);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        n.setProductTime(formatter.parse(timeStamp));
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Product> getAllUsers() {
        // This returns a JSON or XML with the product details
        return userRepository.findAll();
    }
}