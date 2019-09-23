package br.com.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Project govnetrh
 * Criado por @author Vinny Parker
 * em 23/09/2019
 */
@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
public class Car extends AbstractModel<Long> {

    @Column(name = "nome")
    private @NonNull String nome;
}
