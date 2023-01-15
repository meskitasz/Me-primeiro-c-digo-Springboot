package com.treina.recife.service;

import com.treina.recife.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoService extends JpaRepository<Contato, Long> {

}
