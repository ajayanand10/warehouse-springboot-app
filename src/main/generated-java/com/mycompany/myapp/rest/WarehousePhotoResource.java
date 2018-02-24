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

import com.mycompany.myapp.domain.WarehousePhoto;
import com.mycompany.myapp.dto.WarehousePhotoDTO;
import com.mycompany.myapp.dto.WarehousePhotoDTOService;
import com.mycompany.myapp.dto.support.PageRequestByExample;
import com.mycompany.myapp.dto.support.PageResponse;
import com.mycompany.myapp.repository.WarehousePhotoRepository;
import com.mycompany.myapp.rest.support.AutoCompleteQuery;

@RestController
@RequestMapping("/api/warehousePhotos")
public class WarehousePhotoResource {

    private final Logger log = LoggerFactory.getLogger(WarehousePhotoResource.class);

    @Inject
    private WarehousePhotoRepository warehousePhotoRepository;
    @Inject
    private WarehousePhotoDTOService warehousePhotoDTOService;

    /**
     * Create a new WarehousePhoto.
     */
    @RequestMapping(value = "/", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehousePhotoDTO> create(@RequestBody WarehousePhotoDTO warehousePhotoDTO) throws URISyntaxException {

        log.debug("Create WarehousePhotoDTO : {}", warehousePhotoDTO);

        if (warehousePhotoDTO.isIdSet()) {
            return ResponseEntity.badRequest().header("Failure", "Cannot create WarehousePhoto with existing ID").body(null);
        }

        WarehousePhotoDTO result = warehousePhotoDTOService.save(warehousePhotoDTO);

        return ResponseEntity.created(new URI("/api/warehousePhotos/" + result.id)).body(result);
    }

    /**
    * Find by id WarehousePhoto.
    */
    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehousePhotoDTO> findById(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Find by id WarehousePhoto : {}", id);

        return Optional.ofNullable(warehousePhotoDTOService.findOne(id)).map(warehousePhotoDTO -> new ResponseEntity<>(warehousePhotoDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Update WarehousePhoto.
     */
    @RequestMapping(value = "/", method = PUT, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<WarehousePhotoDTO> update(@RequestBody WarehousePhotoDTO warehousePhotoDTO) throws URISyntaxException {

        log.debug("Update WarehousePhotoDTO : {}", warehousePhotoDTO);

        if (!warehousePhotoDTO.isIdSet()) {
            return create(warehousePhotoDTO);
        }

        WarehousePhotoDTO result = warehousePhotoDTOService.save(warehousePhotoDTO);

        return ResponseEntity.ok().body(result);
    }

    /**
     * Find a Page of WarehousePhoto using query by example.
     */
    @RequestMapping(value = "/page", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<PageResponse<WarehousePhotoDTO>> findAll(@RequestBody PageRequestByExample<WarehousePhotoDTO> prbe) throws URISyntaxException {
        PageResponse<WarehousePhotoDTO> pageResponse = warehousePhotoDTOService.findAll(prbe);
        return new ResponseEntity<>(pageResponse, new HttpHeaders(), HttpStatus.OK);
    }

    /**
    * Auto complete support.
    */
    @RequestMapping(value = "/complete", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WarehousePhotoDTO>> complete(@RequestBody AutoCompleteQuery acq) throws URISyntaxException {

        List<WarehousePhotoDTO> results = warehousePhotoDTOService.complete(acq.query, acq.maxResults);

        return new ResponseEntity<>(results, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * Delete by id WarehousePhoto.
     */
    @RequestMapping(value = "/{id}", method = DELETE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Delete by id WarehousePhoto : {}", id);

        try {
            warehousePhotoRepository.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception x) {
            // todo: dig exception, most likely org.hibernate.exception.ConstraintViolationException
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}