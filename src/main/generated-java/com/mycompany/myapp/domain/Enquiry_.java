/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/EntityMeta_.java.e.vm
 */
package com.mycompany.myapp.domain;

import java.time.Instant;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Enquiry.class)
public abstract class Enquiry_ {

    // Raw attributes
    public static volatile SingularAttribute<Enquiry, Integer> id;
    public static volatile SingularAttribute<Enquiry, String> description;
    public static volatile SingularAttribute<Enquiry, Instant> creationDate;
    public static volatile SingularAttribute<Enquiry, String> creationAuthor;
    public static volatile SingularAttribute<Enquiry, Instant> lastModificationDate;
    public static volatile SingularAttribute<Enquiry, String> lastModificationAuthor;
    public static volatile SingularAttribute<Enquiry, Integer> version;

    // Many to one
    public static volatile SingularAttribute<Enquiry, User> user;
    public static volatile SingularAttribute<Enquiry, Warehouse> warehouse;
}