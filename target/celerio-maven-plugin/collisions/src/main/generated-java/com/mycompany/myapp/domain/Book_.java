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

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Book.class)
public abstract class Book_ {

    // Raw attributes
    public static volatile SingularAttribute<Book, Integer> id;
    public static volatile SingularAttribute<Book, Boolean> bestSeller;
    public static volatile SingularAttribute<Book, Long> extractBinary;
    public static volatile SingularAttribute<Book, String> extractContentType;
    public static volatile SingularAttribute<Book, String> extractFileName;
    public static volatile SingularAttribute<Book, Long> extractSize;
    public static volatile SingularAttribute<Book, BigDecimal> price;
    public static volatile SingularAttribute<Book, LocalDate> publicationDate;
    public static volatile SingularAttribute<Book, String> summary;
    public static volatile SingularAttribute<Book, String> title;

    // Many to one
    public static volatile SingularAttribute<Book, Author> coAuthor;
    public static volatile SingularAttribute<Book, Author> author;
}