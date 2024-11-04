package com.example.service_gestion_administrateur.Services;

import com.example.service_gestion_administrateur.DAO.AdminsRepo;
import com.example.service_gestion_administrateur.Entitys.Admins;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

    private final AdminsRepo adminsRepo;

    @Override
    public Admins addAdmin(Admins admin) {
        return adminsRepo.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminsRepo.deleteById(id);
    }

    @Override
    public Admins updateAdmin(Admins admin) {
        return adminsRepo.save(admin);
    }

    @Override
    public List<Admins> getAdmins() {
        return adminsRepo.findAll();
    }

    @Override
    public List<Admins> getAdminById(Long id) {
        return adminsRepo.findAllById(Collections.singleton(id));
    }

    @Override
    public Admins getAdminByEmail(String email) {
        return adminsRepo.findByEmail(email);
    }
}
