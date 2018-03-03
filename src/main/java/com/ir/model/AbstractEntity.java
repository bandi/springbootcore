package com.ir.model;

import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    @Column(nullable = false, updatable = false)
    @CreatedBy
    private Date createdBy;

    @Column(nullable = false)
    @LastModifiedBy
    private Date updatedBy;
}
