/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/domain/CompositePk.java.cpk.vm
 */
package com.mycompany.myapp.domain;

import static org.apache.commons.lang.StringUtils.isNotEmpty;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.google.common.base.Objects;

@Embeddable

public class WarehouseServiceProviderPk implements Comparable<WarehouseServiceProviderPk>, Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer warehouseId;

    public WarehouseServiceProviderPk() {
    }

    public WarehouseServiceProviderPk(Integer userId, Integer warehouseId) {
        this.userId = userId;
        this.warehouseId = warehouseId;
    }

    /**
     * Helper to determine if this composite primary key is fully set.
     */
    @Transient
    public boolean areFieldsSet() {
        return isUserIdSet() && isWarehouseIdSet();
    }

    /**
     * Helper method to determine if this instance is considered empty, that is,
     * if all the non primary key columns are null.
     */
    @Transient
    public boolean isEmpty() {
        return !isUserIdSet() && !isWarehouseIdSet();
    }

    //-- [userId] ------------------------------

    @Column(name = "user_id", nullable = false, precision = 10)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public WarehouseServiceProviderPk userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    /**
     * Helper that determines if this attribute is set or not.
     */
    @Transient
    public boolean isUserIdSet() {
        return getUserId() != null;
    }

    //-- [warehouseId] ------------------------------

    @Column(name = "warehouse_id", nullable = false, precision = 10)
    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public WarehouseServiceProviderPk warehouseId(Integer warehouseId) {
        setWarehouseId(warehouseId);
        return this;
    }

    /**
     * Helper that determines if this attribute is set or not.
     */
    @Transient
    public boolean isWarehouseIdSet() {
        return getWarehouseId() != null;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof WarehouseServiceProviderPk && hashCode() == other.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUserId(), //
                getWarehouseId());
    }

    @Override
    public int compareTo(WarehouseServiceProviderPk other) {
        return other == null ? -1 : hashCode() - other.hashCode();
    }

    /**
    * Return the string representation of the composite primary key, it should be reversable by version produced by the {@link #String()} method
    */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (isUserIdSet()) {
            result.append(getUserId());
        }
        result.append("_");
        if (isWarehouseIdSet()) {
            result.append(getWarehouseId());
        }

        return result.toString();
    }

    /**
     * Build an instance from a string version produced by the {@link #toString()} method
     */
    public static WarehouseServiceProviderPk fromString(String string) {
        WarehouseServiceProviderPk result = new WarehouseServiceProviderPk();
        String[] values = string.split("_");
        if (isNotEmpty(values[0])) {
            result.setUserId(Integer.valueOf(values[0]));
        }
        if (isNotEmpty(values[1])) {
            result.setWarehouseId(Integer.valueOf(values[1]));
        }

        return result;
    }
}
