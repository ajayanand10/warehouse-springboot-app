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

@StaticMetamodel(WarehouseGoods.class)
public abstract class WarehouseGoods_ {
    // Composite primary key
    public static volatile SingularAttribute<WarehouseGoods, WarehouseGoodsPk> id;

    // Raw attributes
    public static volatile SingularAttribute<WarehouseGoods, String> creationAuthor;
    public static volatile SingularAttribute<WarehouseGoods, Instant> creationDate;
    public static volatile SingularAttribute<WarehouseGoods, String> lastModificationAuthor;
    public static volatile SingularAttribute<WarehouseGoods, Instant> lastModificationDate;
    public static volatile SingularAttribute<WarehouseGoods, Integer> version;

    // Many to one
    public static volatile SingularAttribute<WarehouseGoods, Goods> typeOfGoods;
    public static volatile SingularAttribute<WarehouseGoods, Warehouse> warehouse;
}