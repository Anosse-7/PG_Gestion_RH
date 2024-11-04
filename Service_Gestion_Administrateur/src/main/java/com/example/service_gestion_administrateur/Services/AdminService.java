package com.example.service_gestion_administrateur.Services;

import com.example.service_gestion_administrateur.Entitys.Admins;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

     Admins addAdmin(Admins admin);
     void deleteAdmin(Long id);
     Admins updateAdmin(Admins admin);
     List<Admins> getAdmins();
     List<Admins> getAdminById(Long id);
     Admins getAdminByEmail(String email);

}
