//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity.service.ts.e.vm
//
import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { LazyLoadEvent } from 'primeng/primeng';
import { MessageService } from '../../service/message.service';
import { PageResponse, PageRequestByExample } from '../../support/paging';
import { Warehouse } from './warehouse';
import { Observable } from 'rxjs/Rx';
import { catchError, map } from 'rxjs/operators';
import 'rxjs/add/observable/throw';

@Injectable()
export class WarehouseService {

    constructor(private http: HttpClient, private messageService : MessageService) {}

    /**
     * Get a Warehouse by id.
     */
    getWarehouse(id : any) : Observable<Warehouse> {
        return this.http.get('/api/warehouses/' + id)
            .pipe(
                map(response => new Warehouse(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Update the passed warehouse.
     */
    update(warehouse : Warehouse) : Observable<Warehouse> {
        let body = warehouse;

        return this.http.put('/api/warehouses/', body)
            .pipe(
                map(response => new Warehouse(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Load a page (for paginated datatable) of Warehouse using the passed
     * warehouse as an example for the search by example facility.
     */
    getPage(warehouse : Warehouse, event : LazyLoadEvent) : Observable<PageResponse<Warehouse>> {
        let req = new PageRequestByExample(warehouse, event);
        let body = req;

        return this.http.post<PageResponse<any>>('/api/warehouses/page', body)
            .pipe(
                map(pr =>  new PageResponse<Warehouse>(pr.totalPages, pr.totalElements, Warehouse.toArray(pr.content))),
                catchError(this.handleError)
            );
    }

    /**
     * Performs a search by example on 1 attribute (defined on server side) and returns at most 10 results.
     * Used by WarehouseCompleteComponent.
     */
    complete(query : string) : Observable<Warehouse[]> {
        let body = {'query': query, 'maxResults': 10};
        return this.http.post<any[]>('/api/warehouses/complete', body)
            .pipe(
                map(response => Warehouse.toArray(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Delete an Warehouse by id.
     */
    delete(id : any) {
        return this.http.delete('/api/warehouses/' + id)
            .pipe(catchError(this.handleError));
    }

    // sample method from angular doc
    private handleError (error: HttpErrorResponse) {
        // TODO: seems we cannot use messageService from here...
        let errMsg = (error.message) ? error.message : 'Server error';
        console.error(errMsg);
        if (error.status === 401 ) {
            window.location.href = '/';
        }
        return Observable.throw(errMsg);
    }
}