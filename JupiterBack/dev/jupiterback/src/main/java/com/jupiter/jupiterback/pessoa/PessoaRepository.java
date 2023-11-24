package com.jupiter.jupiterback.pessoa;

import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

   // ObservationFilter findAllByAtivoTrue(Pageable paginacao);
    Page<Pessoa> findAllByActivateTrue(Pageable paginacao);
}
