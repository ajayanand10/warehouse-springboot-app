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
import { Book } from './book';
import { Observable } from 'rxjs/Rx';
import { catchError, map } from 'rxjs/operators';
import 'rxjs/add/observable/throw';

@Injectable()
export class BookService {

    constructor(private http: HttpClient, private messageService : MessageService) {}

    /**
     * Get a Book by id.
     */
    getBook(id : any) : Observable<Book> {
        return this.http.get('/api/books/' + id)
            .pipe(
                map(response => new Book(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Update the passed book.
     */
    update(book : Book) : Observable<Book> {
        let body = book;

        return this.http.put('/api/books/', body)
            .pipe(
                map(response => new Book(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Load a page (for paginated datatable) of Book using the passed
     * book as an example for the search by example facility.
     */
    getPage(book : Book, event : LazyLoadEvent) : Observable<PageResponse<Book>> {
        let req = new PageRequestByExample(book, event);
        let body = req;

        return this.http.post<PageResponse<any>>('/api/books/page', body)
            .pipe(
                map(pr =>  new PageResponse<Book>(pr.totalPages, pr.totalElements, Book.toArray(pr.content))),
                catchError(this.handleError)
            );
    }

    /**
     * Performs a search by example on 1 attribute (defined on server side) and returns at most 10 results.
     * Used by BookCompleteComponent.
     */
    complete(query : string) : Observable<Book[]> {
        let body = {'query': query, 'maxResults': 10};
        return this.http.post<any[]>('/api/books/complete', body)
            .pipe(
                map(response => Book.toArray(response)),
                catchError(this.handleError)
            );
    }

    /**
     * Delete an Book by id.
     */
    delete(id : any) {
        return this.http.delete('/api/books/' + id)
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
