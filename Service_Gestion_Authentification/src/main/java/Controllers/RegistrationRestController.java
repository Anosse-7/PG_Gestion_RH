package Controllers;

import Entitys.Admins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/registration")
public class RegistrationRestController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/registerAdmin")
    public void register(@RequestParam Admins admin) {
        String url = "http://localhost:8081/api/admins/addAdmin";
        restTemplate.postForObject(url,admin ,Admins.class);

    }
}
