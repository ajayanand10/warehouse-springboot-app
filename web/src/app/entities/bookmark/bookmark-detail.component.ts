//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-detail.component.ts.e.vm
//
import {Component, OnInit, OnDestroy, Input, Output, EventEmitter} from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { SelectItem } from 'primeng/primeng';
import { MessageService} from '../../service/message.service';
import {Bookmark} from './bookmark';
import {BookmarkService} from './bookmark.service';
import {User} from '../user/user';
import {Warehouse} from '../warehouse/warehouse';

@Component({
    moduleId: module.id,
	templateUrl: 'bookmark-detail.component.html',
	selector: 'bookmark-detail',
})
export class BookmarkDetailComponent implements OnInit, OnDestroy {
    bookmark : Bookmark;

    private params_subscription: any;


    @Input() sub : boolean = false;
    @Input() // used to pass the parent when creating a new Bookmark
    set user(user : User) {
        this.bookmark = new Bookmark();
        this.bookmark.user = user;
    }

    @Input() // used to pass the parent when creating a new Bookmark
    set warehouse(warehouse : Warehouse) {
        this.bookmark = new Bookmark();
        this.bookmark.warehouse = warehouse;
    }

    @Output() onSaveClicked = new EventEmitter<Bookmark>();
    @Output() onCancelClicked = new EventEmitter();

    constructor(private route: ActivatedRoute, private router: Router, private messageService: MessageService, private bookmarkService: BookmarkService) {
    }

    ngOnInit() {
        if (this.sub) {
            return;
        }

        this.params_subscription = this.route.params.subscribe(params => {
            let id = params['id'];
            console.log('ngOnInit for bookmark-detail ' + id);

            if (id === 'new') {
                this.bookmark = new Bookmark();
            } else {
                this.bookmarkService.getBookmark(id)
                    .subscribe(bookmark => {
                            this.bookmark = bookmark;
                        },
                        error =>  this.messageService.error('ngOnInit error', error)
                    );
            }
        });
    }

    ngOnDestroy() {
        if (!this.sub) {
            this.params_subscription.unsubscribe();
        }
    }

    gotoUser() {
        this.router.navigate(['/user', this.bookmark.user.id]);
    }

    clearUser() {
        this.bookmark.user = null;
    }

    gotoWarehouse() {
        this.router.navigate(['/warehouse', this.bookmark.warehouse.id]);
    }

    clearWarehouse() {
        this.bookmark.warehouse = null;
    }

    onSave() {
        this.bookmarkService.update(this.bookmark).
            subscribe(
                bookmark => {
                    this.bookmark = bookmark;
                    if (this.sub) {
                        this.onSaveClicked.emit(this.bookmark);
                        this.messageService.info('Saved OK and msg emitted', 'Angular Rocks!')
                    } else {
                        this.messageService.info('Saved OK', 'Angular Rocks!')
                    }
                },
                error =>  this.messageService.error('Could not save', error)
            );
    }

    onCancel() {
        if (this.sub) {
            this.onCancelClicked.emit("cancel");
            this.messageService.info('Cancel clicked and msg emitted', 'Angular Rocks!')
        }
    }

}