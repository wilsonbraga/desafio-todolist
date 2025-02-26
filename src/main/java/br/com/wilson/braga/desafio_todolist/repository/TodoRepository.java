package br.com.wilson.braga.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilson.braga.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
