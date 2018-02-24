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
import { WarehousePhoto } from './warehousePhoto';
import { Observable } from 'rxjs/Rx';
import { catchError, map } from 'rxjs/operators';
import 'rxjs/add/observable/throw';

@Injectable()
export class WarehousePhotoService {

    constructor(private http: HttpClient, private messageService : MessageService) {}

    /**
     * Get a WarehousePhoto by id.
     */
    getWarehousePhoto(id : any) : Observable<WarehousePhoto> {
        return this.http.get('/api/warehousePhotos/' + id)
            .pipe(
                map(response => new WarehousePhoto(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Update the passed warehousePhoto.
     */
    update(warehousePhoto : WarehousePhoto) : Observable<WarehousePhoto> {
        let body = warehousePhoto;

        return this.http.put('/api/warehousePhotos/', body)
            .pipe(
                map(response => new WarehousePhoto(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Load a page (for paginated datatable) of WarehousePhoto using the passed
     * warehousePhoto as an example for the search by example facility.
     */
    getPage(warehousePhoto : WarehousePhoto, event : LazyLoadEvent) : Observable<PageResponse<WarehousePhoto>> {
        let req = new PageRequestByExample(warehousePhoto, event);
        let body = req;

        return this.http.post<PageResponse<any>>('/api/warehousePhotos/page', body)
            .pipe(
                map(pr =>  new PageResponse<WarehousePhoto>(pr.totalPages, pr.totalElements, WarehousePhoto.toArray(pr.content))),
                catchError(this.handleError)
            );
    }

    /**
     * Performs a search by example on 1 attribute (defined on server side) and returns at most 10 results.
     * Used by WarehousePhotoCompleteComponent.
     */
    complete(query : string) : Observable<WarehousePhoto[]> {
        let body = {'query': query, 'maxResults': 10};
        return this.http.post<any[]>('/api/warehousePhotos/complete', body)
            .pipe(
                map(response => WarehousePhoto.toArray(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Delete an WarehousePhoto by id.
     */
    delete(id : any) {
        return this.http.delete('/api/warehousePhotos/' + id)
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
