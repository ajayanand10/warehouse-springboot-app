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

import java.time.LocalDate;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MyTest.class)
public abstract class MyTest_ {

    // Raw attributes
    public static volatile SingularAttribute<MyTest, Integer> id;
    public static volatile SingularAttribute<MyTest, LocalDate> dateOfJoining;
    public static volatile SingularAttribute<MyTest, String> firstName;
    public static volatile SingularAttribute<MyTest, String> lastName;
}