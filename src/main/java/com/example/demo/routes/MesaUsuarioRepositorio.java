package com.example.demo.routes;

import com.example.demo.model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaUsuarioRepositorio extends JpaRepository<Mesa,Long> {
}