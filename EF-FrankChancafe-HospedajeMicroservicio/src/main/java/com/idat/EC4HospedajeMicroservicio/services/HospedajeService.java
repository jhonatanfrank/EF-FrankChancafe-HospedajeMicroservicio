package com.idat.EC4HospedajeMicroservicio.services;

import java.util.List;

import com.idat.EC4HospedajeMicroservicio.dto.HospedajeDTO;

public interface HospedajeService {
  List<HospedajeDTO> listar();
  void guardar(HospedajeDTO hospedaje);
}
