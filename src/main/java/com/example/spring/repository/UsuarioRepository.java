package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
