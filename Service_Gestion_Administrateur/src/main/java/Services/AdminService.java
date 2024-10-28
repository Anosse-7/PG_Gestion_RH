package Services;

import Entitys.Admins;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    public Admins addAdmin(Admins admin);
    public void deleteAdmin(Long id);
    Admins updateAdmin(Admins admin);
    public List<Admins> getAdmins();
    public List<Admins> getAdminById(Long id);
    public Admins getAdminByEmail(String email);
}
