/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.mycompany.myapp.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.mycompany.myapp.domain.Warehouse;
import com.mycompany.myapp.dto.WarehouseDTO;
import com.mycompany.myapp.dto.WarehouseDTOService;
import com.mycompany.myapp.dto.support.PageRequestByExample;
import com.mycompany.myapp.dto.support.PageResponse;
import com.mycompany.myapp.repository.WarehouseRepository;
import com.mycompany.myapp.rest.support.AutoCompleteQuery;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseResource {

    private final Logger log = LoggerFactory.getLogger(WarehouseResource.class);

    @Inject
    private WarehouseRepository warehouseRepository;
    @Inject
    private WarehouseDTOService warehouseDTOService;

    /**
     * Create a new Warehouse.
     */
    @RequestMapping(value = "/", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehouseDTO> create(@RequestBody WarehouseDTO warehouseDTO) throws URISyntaxException {

        log.debug("Create WarehouseDTO : {}", warehouseDTO);

        if (warehouseDTO.isIdSet()) {
            return ResponseEntity.badRequest().header("Failure", "Cannot create Warehouse with existing ID").body(null);
        }

        WarehouseDTO result = warehouseDTOService.save(warehouseDTO);

        return ResponseEntity.created(new URI("/api/warehouses/" + result.id)).body(result);
    }

    /**
    * Find by id Warehouse.
    */
    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehouseDTO> findById(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Find by id Warehouse : {}", id);

        return Optional.ofNullable(warehouseDTOService.findOne(id)).map(warehouseDTO -> new ResponseEntity<>(warehouseDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Update Warehouse.
     */
    @RequestMapping(value = "/", method = PUT, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehouseDTO> update(@RequestBody WarehouseDTO warehouseDTO) throws URISyntaxException {

        log.debug("Update WarehouseDTO : {}", warehouseDTO);

        if (!warehouseDTO.isIdSet()) {
            return create(warehouseDTO);
        }

        WarehouseDTO result = warehouseDTOService.save(warehouseDTO);

        return ResponseEntity.ok().body(result);
    }

    /**
     * Find a Page of Warehouse using query by example.
     */
    @RequestMapping(value = "/page", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<PageResponse<WarehouseDTO>> findAll(@RequestBody PageRequestByExample<WarehouseDTO> prbe) throws URISyntaxException {
        PageResponse<WarehouseDTO> pageResponse = warehouseDTOService.findAll(prbe);
        return new ResponseEntity<>(pageResponse, new HttpHeaders(), HttpStatus.OK);
    }

    /**
    * Auto complete support.
    */
    @RequestMapping(value = "/complete", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WarehouseDTO>> complete(@RequestBody AutoCompleteQuery acq) throws URISyntaxException {

        List<WarehouseDTO> results = warehouseDTOService.complete(acq.query, acq.maxResults);

        return new ResponseEntity<>(results, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * Delete by id Warehouse.
     */
    @RequestMapping(value = "/{id}", method = DELETE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Delete by id Warehouse : {}", id);

        try {
            warehouseRepository.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception x) {
            // todo: dig exception, most likely org.hibernate.exception.ConstraintViolationException
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}