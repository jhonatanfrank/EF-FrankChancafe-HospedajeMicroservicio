package com.idat.EC4HospedajeMicroservicio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC4HospedajeMicroservicio.dto.HospedajeDTO;
import com.idat.EC4HospedajeMicroservicio.models.Hospedaje;
import com.idat.EC4HospedajeMicroservicio.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {

  @Autowired
  private HospedajeRepository repository;
  

  @Override
  public List<HospedajeDTO> listar() {
    List<HospedajeDTO> lista = new ArrayList<>();
    HospedajeDTO dto = null;

    for (Hospedaje hospedaje : repository.findAll()) {
      dto = new HospedajeDTO();
      dto.setCodigo(hospedaje.getIdHospedaje());
      dto.setNombre(hospedaje.getNombre());
      lista.add(dto);
    }

    return lista;
  }

  @Override
  public void guardar(HospedajeDTO hospedaje) {
    Hospedaje obj = new Hospedaje();
    obj.setIdHospedaje(obj.getIdHospedaje());
    obj.setNombre(obj.getNombre());
    repository.save(obj);
    
  }
  
}
