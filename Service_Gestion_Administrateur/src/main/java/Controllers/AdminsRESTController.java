package Controllers;

import Entitys.Admins;
import Services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
@RequiredArgsConstructor
public class AdminsRESTController {

    private final AdminService adminService;

    @GetMapping("/getAdmins")
    public List<Admins> getAdmins(@RequestParam Long id) {
        return adminService.getAdminById(id);
    }

    @PostMapping("/addAdmin")
    public Admins addAdmin(@RequestBody Admins admin) {
        return adminService.addAdmin(admin);
    }

}
