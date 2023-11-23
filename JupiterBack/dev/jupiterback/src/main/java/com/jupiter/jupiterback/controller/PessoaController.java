package com.jupiter.jupiterback.controller;

import com.jupiter.jupiterback.pessoa.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("cadastrarpessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarPessoa(@RequestBody @Valid DadosCadastros dados) {
        repository.save(new Pessoa(dados));
        //System.out.println(dados);
    }

    @GetMapping
    public Page<DadosListaPessoa> listarPessoa(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListaPessoa::new);
    }

    /*
    @GetMapping
    public List<DadosListaPessoa> listar() {
        return repository.findAll().stream().map(DadosListaPessoa::new).toList();
    } */

    @PutMapping
    @Transactional
    public void atualizarPessoa(@RequestBody @Valid DadosAtualizacao dados) {
        var pessoa = repository.getReferenceById(dados.id());
        pessoa.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable int id) {
        repository.deleteById(id);
    }

}
