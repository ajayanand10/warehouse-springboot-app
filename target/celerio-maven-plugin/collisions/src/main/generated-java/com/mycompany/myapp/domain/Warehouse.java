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
import java.math.BigInteger;
import java.time.Instant;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.mycompany.myapp.audit.AuditContextHolder;
import com.mycompany.myapp.validation.FixedLength;

@Entity
@Table(name = "warehouse")
public class Warehouse implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(Warehouse.class.getName());

    // Raw attributes
    private Integer id;
    private String name;
    private BigInteger rating;
    private String type;
    private String description;
    private String address;
    private String phone1;
    private String phone2;
    private String fulfilmentType;
    private BigInteger storagePrice;
    private String storagePriceUom;
    private String minHirePeriod;
    private BigInteger deposit;
    private String depositUom;
    private Integer facilitySize;
    private String facilitySizeUom;
    private Integer storageSize;
    private String storageSizeUom;
    private String operatingDays;
    private String operatingHours;
    private Integer noOfReceivingDoors;
    private Integer noOfShippingDoors;
    private String wmsVendor;
    private String racking;
    private BigInteger maxStorageHeight;
    private String maxStorageHeightUom;
    private BigInteger maxStorageWeight;
    private String maxStorageWeightUom;
    private String handlingEquipment;
    private String temperatureRange;
    private String structureType;
    private Integer yearOfConstruction;
    private String fleetAccess;
    private String powerSanctioned;
    private String waterConnection;
    private String powerBackup;
    private String craneServices;
    private String fireSystems;
    private String security;
    private String lift;
    private String toilet;
    private String parking;
    private BigInteger distanceFromMainRoad;
    private String yard;
    private String facilityCertification;
    private String faciltiyInsurance;
    private String importExport;
    private String inboundServices;
    private String outboundServices;
    private String valueAddedServices;
    private String laborServices;
    private BigInteger totalLabor;
    private String distributionServices;
    private Instant creationDate;
    private String creationAuthor;
    private Instant lastModificationDate;
    private String lastModificationAuthor;
    private Integer version;

    @Override
    public String entityClassName() {
        return Warehouse.class.getSimpleName();
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

    public Warehouse id(Integer id) {
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

    public Warehouse name(String name) {
        setName(name);
        return this;
    }
    // -- [rating] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "rating", precision = 131089)
    public BigInteger getRating() {
        return rating;
    }

    public void setRating(BigInteger rating) {
        this.rating = rating;
    }

    public Warehouse rating(BigInteger rating) {
        setRating(rating);
        return this;
    }
    // -- [type] ------------------------

    @Size(max = 50)
    @Column(name = "\"type\"", length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Warehouse type(String type) {
        setType(type);
        return this;
    }
    // -- [description] ------------------------

    @Size(max = 1000)
    @Column(name = "description", length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Warehouse description(String description) {
        setDescription(description);
        return this;
    }
    // -- [address] ------------------------

    @Size(max = 255)
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Warehouse address(String address) {
        setAddress(address);
        return this;
    }
    // -- [phone1] ------------------------

    @FixedLength(length = 10)
    @Column(name = "phone1", length = 10)
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public Warehouse phone1(String phone1) {
        setPhone1(phone1);
        return this;
    }
    // -- [phone2] ------------------------

    @FixedLength(length = 10)
    @Column(name = "phone2", length = 10)
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Warehouse phone2(String phone2) {
        setPhone2(phone2);
        return this;
    }
    // -- [fulfilmentType] ------------------------

    @Size(max = 100)
    @Column(name = "fulfilment_type", length = 100)
    public String getFulfilmentType() {
        return fulfilmentType;
    }

    public void setFulfilmentType(String fulfilmentType) {
        this.fulfilmentType = fulfilmentType;
    }

    public Warehouse fulfilmentType(String fulfilmentType) {
        setFulfilmentType(fulfilmentType);
        return this;
    }
    // -- [storagePrice] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "storage_price", precision = 131089)
    public BigInteger getStoragePrice() {
        return storagePrice;
    }

    public void setStoragePrice(BigInteger storagePrice) {
        this.storagePrice = storagePrice;
    }

    public Warehouse storagePrice(BigInteger storagePrice) {
        setStoragePrice(storagePrice);
        return this;
    }
    // -- [storagePriceUom] ------------------------

    @Size(max = 50)
    @Column(name = "storage_price_uom", length = 50)
    public String getStoragePriceUom() {
        return storagePriceUom;
    }

    public void setStoragePriceUom(String storagePriceUom) {
        this.storagePriceUom = storagePriceUom;
    }

    public Warehouse storagePriceUom(String storagePriceUom) {
        setStoragePriceUom(storagePriceUom);
        return this;
    }
    // -- [minHirePeriod] ------------------------

    @Size(max = 20)
    @Column(name = "min_hire_period", length = 20)
    public String getMinHirePeriod() {
        return minHirePeriod;
    }

    public void setMinHirePeriod(String minHirePeriod) {
        this.minHirePeriod = minHirePeriod;
    }

    public Warehouse minHirePeriod(String minHirePeriod) {
        setMinHirePeriod(minHirePeriod);
        return this;
    }
    // -- [deposit] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "deposit", precision = 131089)
    public BigInteger getDeposit() {
        return deposit;
    }

    public void setDeposit(BigInteger deposit) {
        this.deposit = deposit;
    }

    public Warehouse deposit(BigInteger deposit) {
        setDeposit(deposit);
        return this;
    }
    // -- [depositUom] ------------------------

    @Size(max = 50)
    @Column(name = "deposit_uom", length = 50)
    public String getDepositUom() {
        return depositUom;
    }

    public void setDepositUom(String depositUom) {
        this.depositUom = depositUom;
    }

    public Warehouse depositUom(String depositUom) {
        setDepositUom(depositUom);
        return this;
    }
    // -- [facilitySize] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "facility_size", precision = 10)
    public Integer getFacilitySize() {
        return facilitySize;
    }

    public void setFacilitySize(Integer facilitySize) {
        this.facilitySize = facilitySize;
    }

    public Warehouse facilitySize(Integer facilitySize) {
        setFacilitySize(facilitySize);
        return this;
    }
    // -- [facilitySizeUom] ------------------------

    @Size(max = 50)
    @Column(name = "facility_size_uom", length = 50)
    public String getFacilitySizeUom() {
        return facilitySizeUom;
    }

    public void setFacilitySizeUom(String facilitySizeUom) {
        this.facilitySizeUom = facilitySizeUom;
    }

    public Warehouse facilitySizeUom(String facilitySizeUom) {
        setFacilitySizeUom(facilitySizeUom);
        return this;
    }
    // -- [storageSize] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "storage_size", precision = 10)
    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    public Warehouse storageSize(Integer storageSize) {
        setStorageSize(storageSize);
        return this;
    }
    // -- [storageSizeUom] ------------------------

    @Size(max = 50)
    @Column(name = "storage_size_uom", length = 50)
    public String getStorageSizeUom() {
        return storageSizeUom;
    }

    public void setStorageSizeUom(String storageSizeUom) {
        this.storageSizeUom = storageSizeUom;
    }

    public Warehouse storageSizeUom(String storageSizeUom) {
        setStorageSizeUom(storageSizeUom);
        return this;
    }
    // -- [operatingDays] ------------------------

    @Size(max = 255)
    @Column(name = "operating_days")
    public String getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(String operatingDays) {
        this.operatingDays = operatingDays;
    }

    public Warehouse operatingDays(String operatingDays) {
        setOperatingDays(operatingDays);
        return this;
    }
    // -- [operatingHours] ------------------------

    @Size(max = 255)
    @Column(name = "operating_hours")
    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public Warehouse operatingHours(String operatingHours) {
        setOperatingHours(operatingHours);
        return this;
    }
    // -- [noOfReceivingDoors] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "no_of_receiving_doors", precision = 10)
    public Integer getNoOfReceivingDoors() {
        return noOfReceivingDoors;
    }

    public void setNoOfReceivingDoors(Integer noOfReceivingDoors) {
        this.noOfReceivingDoors = noOfReceivingDoors;
    }

    public Warehouse noOfReceivingDoors(Integer noOfReceivingDoors) {
        setNoOfReceivingDoors(noOfReceivingDoors);
        return this;
    }
    // -- [noOfShippingDoors] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "no_of_shipping_doors", precision = 10)
    public Integer getNoOfShippingDoors() {
        return noOfShippingDoors;
    }

    public void setNoOfShippingDoors(Integer noOfShippingDoors) {
        this.noOfShippingDoors = noOfShippingDoors;
    }

    public Warehouse noOfShippingDoors(Integer noOfShippingDoors) {
        setNoOfShippingDoors(noOfShippingDoors);
        return this;
    }
    // -- [wmsVendor] ------------------------

    @Size(max = 255)
    @Column(name = "wms_vendor")
    public String getWmsVendor() {
        return wmsVendor;
    }

    public void setWmsVendor(String wmsVendor) {
        this.wmsVendor = wmsVendor;
    }

    public Warehouse wmsVendor(String wmsVendor) {
        setWmsVendor(wmsVendor);
        return this;
    }
    // -- [racking] ------------------------

    @Size(max = 50)
    @Column(name = "racking", length = 50)
    public String getRacking() {
        return racking;
    }

    public void setRacking(String racking) {
        this.racking = racking;
    }

    public Warehouse racking(String racking) {
        setRacking(racking);
        return this;
    }
    // -- [maxStorageHeight] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "max_storage_height", precision = 131089)
    public BigInteger getMaxStorageHeight() {
        return maxStorageHeight;
    }

    public void setMaxStorageHeight(BigInteger maxStorageHeight) {
        this.maxStorageHeight = maxStorageHeight;
    }

    public Warehouse maxStorageHeight(BigInteger maxStorageHeight) {
        setMaxStorageHeight(maxStorageHeight);
        return this;
    }
    // -- [maxStorageHeightUom] ------------------------

    @Size(max = 50)
    @Column(name = "max_storage_height_uom", length = 50)
    public String getMaxStorageHeightUom() {
        return maxStorageHeightUom;
    }

    public void setMaxStorageHeightUom(String maxStorageHeightUom) {
        this.maxStorageHeightUom = maxStorageHeightUom;
    }

    public Warehouse maxStorageHeightUom(String maxStorageHeightUom) {
        setMaxStorageHeightUom(maxStorageHeightUom);
        return this;
    }
    // -- [maxStorageWeight] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "max_storage_weight", precision = 131089)
    public BigInteger getMaxStorageWeight() {
        return maxStorageWeight;
    }

    public void setMaxStorageWeight(BigInteger maxStorageWeight) {
        this.maxStorageWeight = maxStorageWeight;
    }

    public Warehouse maxStorageWeight(BigInteger maxStorageWeight) {
        setMaxStorageWeight(maxStorageWeight);
        return this;
    }
    // -- [maxStorageWeightUom] ------------------------

    @Size(max = 50)
    @Column(name = "max_storage_weight_uom", length = 50)
    public String getMaxStorageWeightUom() {
        return maxStorageWeightUom;
    }

    public void setMaxStorageWeightUom(String maxStorageWeightUom) {
        this.maxStorageWeightUom = maxStorageWeightUom;
    }

    public Warehouse maxStorageWeightUom(String maxStorageWeightUom) {
        setMaxStorageWeightUom(maxStorageWeightUom);
        return this;
    }
    // -- [handlingEquipment] ------------------------

    @Size(max = 255)
    @Column(name = "handling_equipment")
    public String getHandlingEquipment() {
        return handlingEquipment;
    }

    public void setHandlingEquipment(String handlingEquipment) {
        this.handlingEquipment = handlingEquipment;
    }

    public Warehouse handlingEquipment(String handlingEquipment) {
        setHandlingEquipment(handlingEquipment);
        return this;
    }
    // -- [temperatureRange] ------------------------

    @Size(max = 255)
    @Column(name = "temperature_range")
    public String getTemperatureRange() {
        return temperatureRange;
    }

    public void setTemperatureRange(String temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    public Warehouse temperatureRange(String temperatureRange) {
        setTemperatureRange(temperatureRange);
        return this;
    }
    // -- [structureType] ------------------------

    @Size(max = 255)
    @Column(name = "structure_type")
    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    public Warehouse structureType(String structureType) {
        setStructureType(structureType);
        return this;
    }
    // -- [yearOfConstruction] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "year_of_construction", precision = 10)
    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Warehouse yearOfConstruction(Integer yearOfConstruction) {
        setYearOfConstruction(yearOfConstruction);
        return this;
    }
    // -- [fleetAccess] ------------------------

    @Size(max = 50)
    @Column(name = "fleet_access", length = 50)
    public String getFleetAccess() {
        return fleetAccess;
    }

    public void setFleetAccess(String fleetAccess) {
        this.fleetAccess = fleetAccess;
    }

    public Warehouse fleetAccess(String fleetAccess) {
        setFleetAccess(fleetAccess);
        return this;
    }
    // -- [powerSanctioned] ------------------------

    @Size(max = 50)
    @Column(name = "power_sanctioned", length = 50)
    public String getPowerSanctioned() {
        return powerSanctioned;
    }

    public void setPowerSanctioned(String powerSanctioned) {
        this.powerSanctioned = powerSanctioned;
    }

    public Warehouse powerSanctioned(String powerSanctioned) {
        setPowerSanctioned(powerSanctioned);
        return this;
    }
    // -- [waterConnection] ------------------------

    @Size(max = 50)
    @Column(name = "water_connection", length = 50)
    public String getWaterConnection() {
        return waterConnection;
    }

    public void setWaterConnection(String waterConnection) {
        this.waterConnection = waterConnection;
    }

    public Warehouse waterConnection(String waterConnection) {
        setWaterConnection(waterConnection);
        return this;
    }
    // -- [powerBackup] ------------------------

    @Size(max = 50)
    @Column(name = "power_backup", length = 50)
    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup;
    }

    public Warehouse powerBackup(String powerBackup) {
        setPowerBackup(powerBackup);
        return this;
    }
    // -- [craneServices] ------------------------

    @Size(max = 50)
    @Column(name = "crane_services", length = 50)
    public String getCraneServices() {
        return craneServices;
    }

    public void setCraneServices(String craneServices) {
        this.craneServices = craneServices;
    }

    public Warehouse craneServices(String craneServices) {
        setCraneServices(craneServices);
        return this;
    }
    // -- [fireSystems] ------------------------

    @Size(max = 50)
    @Column(name = "fire_systems", length = 50)
    public String getFireSystems() {
        return fireSystems;
    }

    public void setFireSystems(String fireSystems) {
        this.fireSystems = fireSystems;
    }

    public Warehouse fireSystems(String fireSystems) {
        setFireSystems(fireSystems);
        return this;
    }
    // -- [security] ------------------------

    @Size(max = 50)
    @Column(name = "security", length = 50)
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public Warehouse security(String security) {
        setSecurity(security);
        return this;
    }
    // -- [lift] ------------------------

    @Size(max = 50)
    @Column(name = "lift", length = 50)
    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public Warehouse lift(String lift) {
        setLift(lift);
        return this;
    }
    // -- [toilet] ------------------------

    @Size(max = 50)
    @Column(name = "toilet", length = 50)
    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public Warehouse toilet(String toilet) {
        setToilet(toilet);
        return this;
    }
    // -- [parking] ------------------------

    @Size(max = 50)
    @Column(name = "parking", length = 50)
    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public Warehouse parking(String parking) {
        setParking(parking);
        return this;
    }
    // -- [distanceFromMainRoad] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "distance_from_main_road", precision = 131089)
    public BigInteger getDistanceFromMainRoad() {
        return distanceFromMainRoad;
    }

    public void setDistanceFromMainRoad(BigInteger distanceFromMainRoad) {
        this.distanceFromMainRoad = distanceFromMainRoad;
    }

    public Warehouse distanceFromMainRoad(BigInteger distanceFromMainRoad) {
        setDistanceFromMainRoad(distanceFromMainRoad);
        return this;
    }
    // -- [yard] ------------------------

    @Size(max = 255)
    @Column(name = "yard")
    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public Warehouse yard(String yard) {
        setYard(yard);
        return this;
    }
    // -- [facilityCertification] ------------------------

    @Size(max = 255)
    @Column(name = "facility_certification")
    public String getFacilityCertification() {
        return facilityCertification;
    }

    public void setFacilityCertification(String facilityCertification) {
        this.facilityCertification = facilityCertification;
    }

    public Warehouse facilityCertification(String facilityCertification) {
        setFacilityCertification(facilityCertification);
        return this;
    }
    // -- [faciltiyInsurance] ------------------------

    @Size(max = 255)
    @Column(name = "faciltiy_insurance")
    public String getFaciltiyInsurance() {
        return faciltiyInsurance;
    }

    public void setFaciltiyInsurance(String faciltiyInsurance) {
        this.faciltiyInsurance = faciltiyInsurance;
    }

    public Warehouse faciltiyInsurance(String faciltiyInsurance) {
        setFaciltiyInsurance(faciltiyInsurance);
        return this;
    }
    // -- [importExport] ------------------------

    @Size(max = 255)
    @Column(name = "import_export")
    public String getImportExport() {
        return importExport;
    }

    public void setImportExport(String importExport) {
        this.importExport = importExport;
    }

    public Warehouse importExport(String importExport) {
        setImportExport(importExport);
        return this;
    }
    // -- [inboundServices] ------------------------

    @Size(max = 255)
    @Column(name = "inbound_services")
    public String getInboundServices() {
        return inboundServices;
    }

    public void setInboundServices(String inboundServices) {
        this.inboundServices = inboundServices;
    }

    public Warehouse inboundServices(String inboundServices) {
        setInboundServices(inboundServices);
        return this;
    }
    // -- [outboundServices] ------------------------

    @Size(max = 255)
    @Column(name = "outbound_services")
    public String getOutboundServices() {
        return outboundServices;
    }

    public void setOutboundServices(String outboundServices) {
        this.outboundServices = outboundServices;
    }

    public Warehouse outboundServices(String outboundServices) {
        setOutboundServices(outboundServices);
        return this;
    }
    // -- [valueAddedServices] ------------------------

    @Size(max = 255)
    @Column(name = "value_added_services")
    public String getValueAddedServices() {
        return valueAddedServices;
    }

    public void setValueAddedServices(String valueAddedServices) {
        this.valueAddedServices = valueAddedServices;
    }

    public Warehouse valueAddedServices(String valueAddedServices) {
        setValueAddedServices(valueAddedServices);
        return this;
    }
    // -- [laborServices] ------------------------

    @Size(max = 255)
    @Column(name = "labor_services")
    public String getLaborServices() {
        return laborServices;
    }

    public void setLaborServices(String laborServices) {
        this.laborServices = laborServices;
    }

    public Warehouse laborServices(String laborServices) {
        setLaborServices(laborServices);
        return this;
    }
    // -- [totalLabor] ------------------------

    @Digits(integer = 131089, fraction = 0)
    @Column(name = "total_labor", precision = 131089)
    public BigInteger getTotalLabor() {
        return totalLabor;
    }

    public void setTotalLabor(BigInteger totalLabor) {
        this.totalLabor = totalLabor;
    }

    public Warehouse totalLabor(BigInteger totalLabor) {
        setTotalLabor(totalLabor);
        return this;
    }
    // -- [distributionServices] ------------------------

    @Size(max = 255)
    @Column(name = "distribution_services")
    public String getDistributionServices() {
        return distributionServices;
    }

    public void setDistributionServices(String distributionServices) {
        this.distributionServices = distributionServices;
    }

    public Warehouse distributionServices(String distributionServices) {
        setDistributionServices(distributionServices);
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

    public Warehouse creationDate(Instant creationDate) {
        setCreationDate(creationDate);
        return this;
    }
    // -- [creationAuthor] ------------------------

    @Column(name = "creation_author", length = 200)
    public String getCreationAuthor() {
        return creationAuthor;
    }

    public void setCreationAuthor(String creationAuthor) {
        this.creationAuthor = creationAuthor;
    }

    public Warehouse creationAuthor(String creationAuthor) {
        setCreationAuthor(creationAuthor);
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

    public Warehouse lastModificationDate(Instant lastModificationDate) {
        setLastModificationDate(lastModificationDate);
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

    public Warehouse lastModificationAuthor(String lastModificationAuthor) {
        setLastModificationAuthor(lastModificationAuthor);
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

    public Warehouse version(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Warehouse withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Warehouse && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Warehouse instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("name", getName()) //
                .add("rating", getRating()) //
                .add("type", getType()) //
                .add("description", getDescription()) //
                .add("address", getAddress()) //
                .add("phone1", getPhone1()) //
                .add("phone2", getPhone2()) //
                .add("fulfilmentType", getFulfilmentType()) //
                .add("storagePrice", getStoragePrice()) //
                .add("storagePriceUom", getStoragePriceUom()) //
                .add("minHirePeriod", getMinHirePeriod()) //
                .add("deposit", getDeposit()) //
                .add("depositUom", getDepositUom()) //
                .add("facilitySize", getFacilitySize()) //
                .add("facilitySizeUom", getFacilitySizeUom()) //
                .add("storageSize", getStorageSize()) //
                .add("storageSizeUom", getStorageSizeUom()) //
                .add("operatingDays", getOperatingDays()) //
                .add("operatingHours", getOperatingHours()) //
                .add("noOfReceivingDoors", getNoOfReceivingDoors()) //
                .add("noOfShippingDoors", getNoOfShippingDoors()) //
                .add("wmsVendor", getWmsVendor()) //
                .add("racking", getRacking()) //
                .add("maxStorageHeight", getMaxStorageHeight()) //
                .add("maxStorageHeightUom", getMaxStorageHeightUom()) //
                .add("maxStorageWeight", getMaxStorageWeight()) //
                .add("maxStorageWeightUom", getMaxStorageWeightUom()) //
                .add("handlingEquipment", getHandlingEquipment()) //
                .add("temperatureRange", getTemperatureRange()) //
                .add("structureType", getStructureType()) //
                .add("yearOfConstruction", getYearOfConstruction()) //
                .add("fleetAccess", getFleetAccess()) //
                .add("powerSanctioned", getPowerSanctioned()) //
                .add("waterConnection", getWaterConnection()) //
                .add("powerBackup", getPowerBackup()) //
                .add("craneServices", getCraneServices()) //
                .add("fireSystems", getFireSystems()) //
                .add("security", getSecurity()) //
                .add("lift", getLift()) //
                .add("toilet", getToilet()) //
                .add("parking", getParking()) //
                .add("distanceFromMainRoad", getDistanceFromMainRoad()) //
                .add("yard", getYard()) //
                .add("facilityCertification", getFacilityCertification()) //
                .add("faciltiyInsurance", getFaciltiyInsurance()) //
                .add("importExport", getImportExport()) //
                .add("inboundServices", getInboundServices()) //
                .add("outboundServices", getOutboundServices()) //
                .add("valueAddedServices", getValueAddedServices()) //
                .add("laborServices", getLaborServices()) //
                .add("totalLabor", getTotalLabor()) //
                .add("distributionServices", getDistributionServices()) //
                .add("creationDate", getCreationDate()) //
                .add("creationAuthor", getCreationAuthor()) //
                .add("lastModificationDate", getLastModificationDate()) //
                .add("lastModificationAuthor", getLastModificationAuthor()) //
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