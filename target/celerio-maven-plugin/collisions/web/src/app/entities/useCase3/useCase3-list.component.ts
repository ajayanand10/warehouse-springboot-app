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
import { UseCase3 } from './useCase3';
import { UseCase3DetailComponent } from './useCase3-detail.component';
import { UseCase3Service } from './useCase3.service';

@Component({
    moduleId: module.id,
	templateUrl: 'useCase3-list.component.html',
	selector: 'useCase3-list'
})
export class UseCase3ListComponent {

    @Input() header = "UseCase3s...";

    // When 'sub' is true, it means this list is used as a one-to-many list.
    // It belongs to a parent entity, as a result the addNew operation
    // must prefill the parent entity. The prefill is not done here, instead we
    // emit an event.
    // When 'sub' is false, we display basic search criterias
    @Input() sub : boolean;
    @Output() onAddNewClicked = new EventEmitter();

    useCase3ToDelete : UseCase3;

    // basic search criterias (visible if not in 'sub' mode)
    example : UseCase3 = new UseCase3();

    // list is paginated
    currentPage : PageResponse<UseCase3> = new PageResponse<UseCase3>(0,0,[]);


    constructor(private router : Router,
        private useCase3Service : UseCase3Service,
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
        this.useCase3Service.getPage(this.example, event).
            subscribe(
                pageResponse => this.currentPage = pageResponse,
                error => this.messageService.error('Could not get the results', error)
            );
    }

    onRowSelect(event : any) {
        let id = event.data.id.id1.toISOString().substring(0,19) + '_' + 
event.data.id.id2;
        this.router.navigate(['/useCase3', id]);
    }

    addNew() {
        if (this.sub) {
            this.onAddNewClicked.emit("addNew");
        } else {
            this.router.navigate(['/useCase3', 'new']);
        }
    }

    showDeleteDialog(rowData : any) {
        let useCase3ToDelete : UseCase3 = <UseCase3> rowData;

        let dialogRef = this.confirmDeleteDialog.open(ConfirmDeleteDialogComponent);
        dialogRef.afterClosed().subscribe(result => {
            if (result === 'delete') {
                this.delete(useCase3ToDelete);
            }
        });
    }

    private delete(useCase3ToDelete : UseCase3) {
        let id = useCase3ToDelete.id.id1.toISOString().substring(0,19) + '_' + useCase3ToDelete.id.id2;

        this.useCase3Service.delete(id).
            subscribe(
                response => {
                    this.currentPage.remove(useCase3ToDelete);
                    this.messageService.info('Deleted OK', 'Angular Rocks!');
                },
                error => this.messageService.error('Could not delete!', error)
            );
    }
}