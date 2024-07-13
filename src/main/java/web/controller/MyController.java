package web.controller;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserDao userDAO;

    @GetMapping(value ="/")
    public String showAllUsers(Model model) {

        List<User> users = userDAO.getAllUsers();
        model.addAttribute("users", users);

        return "users";
    }
}
