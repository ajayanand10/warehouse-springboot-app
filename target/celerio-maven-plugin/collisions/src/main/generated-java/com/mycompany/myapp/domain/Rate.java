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

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.Instant;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.mycompany.myapp.audit.AuditContextHolder;

@Entity
@Table(name = "rate")
public class Rate implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(Rate.class.getName());

    // Raw attributes
    private Integer id;
    private String creationAuthor;
    private Instant creationDate;
    private String description;
    private Integer labor;
    private String lastModificationAuthor;
    private Instant lastModificationDate;
    private String loading;
    private String storage;
    private String unloading;
    private Integer version;

    // Many to one
    private Warehouse warehouse;

    @Override
    public String entityClassName() {
        return Rate.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "id", precision = 10)
    @GeneratedValue(strategy = IDENTITY)
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Rate id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [creationAuthor] ------------------------

    @Column(name = "creation_author", length = 200)
    public String getCreationAuthor() {
        return creationAuthor;
    }

    public void setCreationAuthor(String creationAuthor) {
        this.creationAuthor = creationAuthor;
    }

    public Rate creationAuthor(String creationAuthor) {
        setCreationAuthor(creationAuthor);
        return this;
    }
    // -- [creationDate] ------------------------

    @Column(name = "creation_date", length = 29)
    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Rate creationDate(Instant creationDate) {
        setCreationDate(creationDate);
        return this;
    }
    // -- [description] ------------------------

    @Size(max = 255)
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rate description(String description) {
        setDescription(description);
        return this;
    }
    // -- [labor] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "labor", precision = 10)
    public Integer getLabor() {
        return labor;
    }

    public void setLabor(Integer labor) {
        this.labor = labor;
    }

    public Rate labor(Integer labor) {
        setLabor(labor);
        return this;
    }
    // -- [lastModificationAuthor] ------------------------

    @Column(name = "last_modification_author", length = 200)
    public String getLastModificationAuthor() {
        return lastModificationAuthor;
    }

    public void setLastModificationAuthor(String lastModificationAuthor) {
        this.lastModificationAuthor = lastModificationAuthor;
    }

    public Rate lastModificationAuthor(String lastModificationAuthor) {
        setLastModificationAuthor(lastModificationAuthor);
        return this;
    }
    // -- [lastModificationDate] ------------------------

    @Column(name = "last_modification_date", length = 29)
    public Instant getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Instant lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public Rate lastModificationDate(Instant lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }
    // -- [loading] ------------------------

    @Size(max = 255)
    @Column(name = "loading")
    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public Rate loading(String loading) {
        setLoading(loading);
        return this;
    }
    // -- [storage] ------------------------

    @Size(max = 255)
    @Column(name = "\"storage\"")
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Rate storage(String storage) {
        setStorage(storage);
        return this;
    }
    // -- [unloading] ------------------------

    @Size(max = 255)
    @Column(name = "unloading")
    public String getUnloading() {
        return unloading;
    }

    public void setUnloading(String unloading) {
        this.unloading = unloading;
    }

    public Rate unloading(String unloading) {
        setUnloading(unloading);
        return this;
    }
    // -- [version] ------------------------

    @Column(name = "version", precision = 10)
    @Version
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Rate version(Integer version) {
        setVersion(version);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: Rate.warehouse ==> Warehouse.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "warehouse_id")
    @ManyToOne
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * Set the {@link #warehouse} without adding this Rate instance on the passed {@link #warehouse}
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Rate warehouse(Warehouse warehouse) {
        setWarehouse(warehouse);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Rate withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Rate && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Rate instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("creationAuthor", getCreationAuthor()) //
                .add("creationDate", getCreationDate()) //
                .add("description", getDescription()) //
                .add("labor", getLabor()) //
                .add("lastModificationAuthor", getLastModificationAuthor()) //
                .add("lastModificationDate", getLastModificationDate()) //
                .add("loading", getLoading()) //
                .add("storage", getStorage()) //
                .add("unloading", getUnloading()) //
                .add("version", getVersion()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        if (AuditContextHolder.audit()) {
            setCreationAuthor(AuditContextHolder.username());
            setCreationDate(Instant.now());

        }
    }

    @PreUpdate
    protected void preUpdate() {
        if (AuditContextHolder.audit()) {
            setLastModificationAuthor(AuditContextHolder.username());
            setLastModificationDate(Instant.now());
        }
    }
}