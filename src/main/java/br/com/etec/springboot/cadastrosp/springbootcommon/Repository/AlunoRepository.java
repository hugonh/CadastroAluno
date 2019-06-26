package br.com.etec.springboot.cadastrosp.springbootcommon.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.springboot.cadastrosp.springbootcommon.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {}

