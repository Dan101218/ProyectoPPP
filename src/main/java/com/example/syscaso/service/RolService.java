package com.example.syscaso.service;


import java.util.List;

import com.example.syscaso.entity.Rol;

public interface RolService {
      Rol create(Rol r);
      Rol update(Rol r);
      void delete(Long id);
      Rol read(Long id);
      List<Rol> readAll();
}
