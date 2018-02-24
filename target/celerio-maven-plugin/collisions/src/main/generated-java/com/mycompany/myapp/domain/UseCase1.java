/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/Entity.java.e.vm
 */
package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Entity
@Table(name = "use_case_1", uniqueConstraints = { @UniqueConstraint(name = "use_case_1_pkey", columnNames = { "id1", "id2" }) })
public class UseCase1 implements Identifiable<UseCase1Pk>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(UseCase1.class.getName());

    // Composite primary key
    private UseCase1Pk id = new UseCase1Pk();

    // Raw attributes
    private String dummy;

    @Override
    public String entityClassName() {
        return UseCase1.class.getSimpleName();
    }

    // -----------------------
    // Composite Primary Key
    // -----------------------

    /**
     * Returns the composite primary key.
     */
    @Override
    @EmbeddedId
    public UseCase1Pk getId() {
        return id;
    }

    /**
     * Set the composite primary key.
     * @param id the composite primary key.
     */
    @Override
    public void setId(UseCase1Pk id) {
        this.id = id;
    }

    public UseCase1 id(UseCase1Pk id) {
        setId(id);
        return this;
    }

    /**
     * Tells whether or not this instance has a non empty composite primary key set.
     * @return true if a non empty primary key is set, false otherwise
     */
    @Override
    @Transient
    public boolean isIdSet() {
        return getId() != null && getId().areFieldsSet();
    }
    // -- [dummy] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "dummy", nullable = false, length = 100)
    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public UseCase1 dummy(String dummy) {
        setDummy(dummy);
        return this;
    }

    /**
     * Apply the default values.
     */
    public UseCase1 withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof UseCase1 && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this UseCase1 instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("dummy", getDummy()) //
                .toString();
    }
}