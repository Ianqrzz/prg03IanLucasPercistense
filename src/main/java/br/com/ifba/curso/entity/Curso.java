/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.curso.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Entity; 
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ianep
 */
@Entity 
@Table( name = "cursos")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Curso extends PersistenceEntity implements Serializable {


    
    private String nome;

    /**
     * Campo 'codigoCurso'. O JPA irá criar uma coluna chamada 'codigoCurso' no
     * banco. (É uma boa prática adicionar @Column(unique = true) aqui para
     * garantir que não haja dois cursos com o mesmo código).
     */
    private String codigoCurso;

    /**
     * Campo 'ativo'. O JPA irá criar uma coluna 'ativo' no banco, geralmente do
     * tipo 'boolean' ou 'TINYINT(1)' no MySQL.
     */
    private boolean ativo;


    

}
