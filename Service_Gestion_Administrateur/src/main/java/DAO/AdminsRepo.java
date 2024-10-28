package DAO;

import Entitys.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepo extends JpaRepository<Admins, Long> {

    Admins findByEmail(String email);
}
