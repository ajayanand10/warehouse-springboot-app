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

import com.mycompany.myapp.domain.Guest;
import com.mycompany.myapp.dto.GuestDTO;
import com.mycompany.myapp.dto.GuestDTOService;
import com.mycompany.myapp.dto.support.PageRequestByExample;
import com.mycompany.myapp.dto.support.PageResponse;
import com.mycompany.myapp.repository.GuestRepository;
import com.mycompany.myapp.rest.support.AutoCompleteQuery;

@RestController
@RequestMapping("/api/guests")
public class GuestResource {

    private final Logger log = LoggerFactory.getLogger(GuestResource.class);

    @Inject
    private GuestRepository guestRepository;
    @Inject
    private GuestDTOService guestDTOService;

    /**
     * Create a new Guest.
     */
    @RequestMapping(value = "/", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GuestDTO> create(@RequestBody GuestDTO guestDTO) throws URISyntaxException {

        log.debug("Create GuestDTO : {}", guestDTO);

        if (guestDTO.isIdSet()) {
            return ResponseEntity.badRequest().header("Failure", "Cannot create Guest with existing ID").body(null);
        }

        GuestDTO result = guestDTOService.save(guestDTO);

        return ResponseEntity.created(new URI("/api/guests/" + result.id)).body(result);
    }

    /**
    * Find by id Guest.
    */
    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GuestDTO> findById(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Find by id Guest : {}", id);

        return Optional.ofNullable(guestDTOService.findOne(id)).map(guestDTO -> new ResponseEntity<>(guestDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Update Guest.
     */
    @RequestMapping(value = "/", method = PUT, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GuestDTO> update(@RequestBody GuestDTO guestDTO) throws URISyntaxException {

        log.debug("Update GuestDTO : {}", guestDTO);

        if (!guestDTO.isIdSet()) {
            return create(guestDTO);
        }

        GuestDTO result = guestDTOService.save(guestDTO);

        return ResponseEntity.ok().body(result);
    }

    /**
     * Find a Page of Guest using query by example.
     */
    @RequestMapping(value = "/page", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<PageResponse<GuestDTO>> findAll(@RequestBody PageRequestByExample<GuestDTO> prbe) throws URISyntaxException {
        PageResponse<GuestDTO> pageResponse = guestDTOService.findAll(prbe);
        return new ResponseEntity<>(pageResponse, new HttpHeaders(), HttpStatus.OK);
    }

    /**
    * Auto complete support.
    */
    @RequestMapping(value = "/complete", method = POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GuestDTO>> complete(@RequestBody AutoCompleteQuery acq) throws URISyntaxException {

        List<GuestDTO> results = guestDTOService.complete(acq.query, acq.maxResults);

        return new ResponseEntity<>(results, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * Delete by id Guest.
     */
    @RequestMapping(value = "/{id}", method = DELETE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws URISyntaxException {

        log.debug("Delete by id Guest : {}", id);

        try {
            guestRepository.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception x) {
            // todo: dig exception, most likely org.hibernate.exception.ConstraintViolationException
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}