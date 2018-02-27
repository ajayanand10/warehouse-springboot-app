/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/CompositePk_.java.cpk.vm
 */
package com.mycompany.myapp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(WarehouseGoodsPk.class)
public abstract class WarehouseGoodsPk_ {
    // pk attributes
    public static volatile SingularAttribute<WarehouseGoodsPk, Integer> typeOfGoodsId;
    public static volatile SingularAttribute<WarehouseGoodsPk, Integer> warehouseId;
}
