package com.github.dhodja.expensesmgmt.domain.model.shared;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    protected BaseEntity() {
    }

    protected BaseEntity(UUID id) {
        Objects.requireNonNull(id, "id must not be null");
        this.id = id;
    }

    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((!getClass().isInstance(obj))) {
            return false;
        }
        BaseEntity that = (BaseEntity) obj;
        boolean equals = getId().equals(that.getId());
        return equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
