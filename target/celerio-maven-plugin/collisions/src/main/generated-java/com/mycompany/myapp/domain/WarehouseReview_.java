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

@StaticMetamodel(WarehouseReview.class)
public abstract class WarehouseReview_ {

    // Raw attributes
    public static volatile SingularAttribute<WarehouseReview, Integer> id;
    public static volatile SingularAttribute<WarehouseReview, String> comments;
    public static volatile SingularAttribute<WarehouseReview, String> creationAuthor;
    public static volatile SingularAttribute<WarehouseReview, Instant> creationDate;
    public static volatile SingularAttribute<WarehouseReview, String> lastModificationAuthor;
    public static volatile SingularAttribute<WarehouseReview, Instant> lastModificationDate;
    public static volatile SingularAttribute<WarehouseReview, Double> overallRating;
    public static volatile SingularAttribute<WarehouseReview, String> responsiveness;
    public static volatile SingularAttribute<WarehouseReview, Double> turnaroundTime;
    public static volatile SingularAttribute<WarehouseReview, Integer> version;

    // Many to one
    public static volatile SingularAttribute<WarehouseReview, User> user;
}