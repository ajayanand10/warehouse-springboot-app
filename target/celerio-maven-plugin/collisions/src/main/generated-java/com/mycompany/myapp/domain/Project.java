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
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Entity
@Table(name = "project")
public class Project implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(Project.class.getName());

    // Raw attributes
    private Integer id;
    private String name;
    private Boolean openSource;
    private String url;
    private Integer authorId;

    @Override
    public String entityClassName() {
        return Project.class.getSimpleName();
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

    public Project id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [name] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project name(String name) {
        setName(name);
        return this;
    }
    // -- [openSource] ------------------------

    @Column(name = "open_source", length = 1)
    public Boolean getOpenSource() {
        return openSource;
    }

    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public Project openSource(Boolean openSource) {
        setOpenSource(openSource);
        return this;
    }
    // -- [url] ------------------------

    @Size(max = 100)
    @URL
    @Column(name = "url", length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Project url(String url) {
        setUrl(url);
        return this;
    }
    // -- [authorId] ------------------------

    @Digits(integer = 10, fraction = 0)
    @NotNull
    @Column(name = "author_id", nullable = false, precision = 10)
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Project authorId(Integer authorId) {
        setAuthorId(authorId);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Project withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Project && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Project instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("name", getName()) //
                .add("openSource", getOpenSource()) //
                .add("url", getUrl()) //
                .add("authorId", getAuthorId()) //
                .toString();
    }
}