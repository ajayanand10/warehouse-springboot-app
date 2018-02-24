/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/repository/EntityRepository.java.e.vm
 */
package com.mycompany.myapp.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.*;

import com.mycompany.myapp.domain.Databasechangeloglock;
import com.mycompany.myapp.domain.Databasechangeloglock_;

public interface DatabasechangeloglockRepository extends JpaRepository<Databasechangeloglock, Integer> {

    default List<Databasechangeloglock> complete(String query, int maxResults) {
        Databasechangeloglock probe = new Databasechangeloglock();
        probe.setLockedby(query);

        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(Databasechangeloglock_.lockedby.getName(), match -> match.ignoreCase().startsWith());

        Page<Databasechangeloglock> page = findAll(Example.of(probe, matcher), new PageRequest(0, maxResults));
        return page.getContent();
    }
}