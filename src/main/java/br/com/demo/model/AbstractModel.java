package br.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Project govnetrh
 * Criado por @author Vinny Parker
 * em 23/09/2019
 */
@MappedSuperclass
public abstract class AbstractModel<Long extends Serializable> implements Serializable {
    private static final long serialVersionUID = -6323358535657100144L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "version", length = 150, columnDefinition = "varchar(150) default '0'")
    private String version = "0";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractModel<?> other = (AbstractModel<?>) obj;
        if (id == null) {
            return other.id == null;
        } else return id.equals(other.id);
    }
}
