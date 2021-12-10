package app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
@CrossOrigin
public class ServiceCController {


    @GetMapping("/getData")
    public String getData() throws ClassNotFoundException, SQLException {
        return "Hi deploy";
    }
}
