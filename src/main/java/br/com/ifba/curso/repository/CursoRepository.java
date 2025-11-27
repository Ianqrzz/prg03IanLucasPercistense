/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ianep
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
    /* agora o CursoRepository é uma interface que extende o JpaRepository
    que tem todos os metodos de CRUD para o banco de dados */
    public List<Curso> findByNome(String nome);
    
    
}
