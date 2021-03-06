//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-list.component.ts.e.vm
//
import { Component, Input, Output, OnChanges, EventEmitter, SimpleChanges} from '@angular/core';
import { Router } from '@angular/router';
import { DataTable, LazyLoadEvent } from 'primeng/primeng';
import { PageResponse } from "../../support/paging";
import { MessageService } from '../../service/message.service';
import { MatDialog } from '@angular/material';
import { ConfirmDeleteDialogComponent } from "../../support/confirm-delete-dialog.component";
import { Bookmark } from './bookmark';
import { BookmarkDetailComponent } from './bookmark-detail.component';
import { BookmarkService } from './bookmark.service';
import { User } from '../user/user';
import { UserLineComponent } from '../user/user-line.component';
import { Warehouse } from '../warehouse/warehouse';
import { WarehouseLineComponent } from '../warehouse/warehouse-line.component';

@Component({
    moduleId: module.id,
	templateUrl: 'bookmark-list.component.html',
	selector: 'bookmark-list'
})
export class BookmarkListComponent {

    @Input() header = "Bookmarks...";

    // When 'sub' is true, it means this list is used as a one-to-many list.
    // It belongs to a parent entity, as a result the addNew operation
    // must prefill the parent entity. The prefill is not done here, instead we
    // emit an event.
    // When 'sub' is false, we display basic search criterias
    @Input() sub : boolean;
    @Output() onAddNewClicked = new EventEmitter();

    bookmarkToDelete : Bookmark;

    // basic search criterias (visible if not in 'sub' mode)
    example : Bookmark = new Bookmark();

    // list is paginated
    currentPage : PageResponse<Bookmark> = new PageResponse<Bookmark>(0,0,[]);

    // X to one: input param is used to filter the list when displayed
    // as a one-to-many list by the other side.
    private _user : User;
    private _warehouse : Warehouse;

    constructor(private router : Router,
        private bookmarkService : BookmarkService,
        private messageService : MessageService,
        private confirmDeleteDialog: MatDialog) {
    }

    /**
     * When used as a 'sub' component (to display one-to-many list), refreshes the table
     * content when the input changes.
     */
    ngOnChanges(changes: SimpleChanges) {
        this.loadPage({ first: 0, rows: 10, sortField: null, sortOrder: null, filters: null, multiSortMeta: null });
    }

    /**
     * Invoked when user presses the search button.
     */
    search(dt : DataTable) {
        if (!this.sub) {
            dt.reset();
            this.loadPage({ first: 0, rows: dt.rows, sortField: dt.sortField, sortOrder: dt.sortOrder, filters: null, multiSortMeta: dt.multiSortMeta });
        }
    }

    /**
     * Invoked automatically by primeng datatable.
     */
    loadPage(event : LazyLoadEvent) {
        this.bookmarkService.getPage(this.example, event).
            subscribe(
                pageResponse => this.currentPage = pageResponse,
                error => this.messageService.error('Could not get the results', error)
            );
    }

    // X to one: input param is used to filter the list when displayed
    // as a one-to-many list by the other side.
    @Input()
    set user(user : User) {
        if (user == null) {
            return;
        }
        this._user = user;

        this.example = new Bookmark();
        this.example.user = new User();
        this.example.user.id = this._user.id;
    }

    @Input()
    set warehouse(warehouse : Warehouse) {
        if (warehouse == null) {
            return;
        }
        this._warehouse = warehouse;

        this.example = new Bookmark();
        this.example.warehouse = new Warehouse();
        this.example.warehouse.id = this._warehouse.id;
    }


    onRowSelect(event : any) {
        let id =  event.data.id;
        this.router.navigate(['/bookmark', id]);
    }

    addNew() {
        if (this.sub) {
            this.onAddNewClicked.emit("addNew");
        } else {
            this.router.navigate(['/bookmark', 'new']);
        }
    }

    showDeleteDialog(rowData : any) {
        let bookmarkToDelete : Bookmark = <Bookmark> rowData;

        let dialogRef = this.confirmDeleteDialog.open(ConfirmDeleteDialogComponent);
        dialogRef.afterClosed().subscribe(result => {
            if (result === 'delete') {
                this.delete(bookmarkToDelete);
            }
        });
    }

    private delete(bookmarkToDelete : Bookmark) {
        let id =  bookmarkToDelete.id;

        this.bookmarkService.delete(id).
            subscribe(
                response => {
                    this.currentPage.remove(bookmarkToDelete);
                    this.messageService.info('Deleted OK', 'Angular Rocks!');
                },
                error => this.messageService.error('Could not delete!', error)
            );
    }
}