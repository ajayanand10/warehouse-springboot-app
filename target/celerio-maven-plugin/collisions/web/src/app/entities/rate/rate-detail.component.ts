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
import {Rate} from './rate';
import {RateService} from './rate.service';
import {Warehouse} from '../warehouse/warehouse';

@Component({
    moduleId: module.id,
	templateUrl: 'rate-detail.component.html',
	selector: 'rate-detail',
})
export class RateDetailComponent implements OnInit, OnDestroy {
    rate : Rate;

    private params_subscription: any;


    @Input() sub : boolean = false;
    @Input() // used to pass the parent when creating a new Rate
    set warehouse(warehouse : Warehouse) {
        this.rate = new Rate();
        this.rate.warehouse = warehouse;
    }

    @Output() onSaveClicked = new EventEmitter<Rate>();
    @Output() onCancelClicked = new EventEmitter();

    constructor(private route: ActivatedRoute, private router: Router, private messageService: MessageService, private rateService: RateService) {
    }

    ngOnInit() {
        if (this.sub) {
            return;
        }

        this.params_subscription = this.route.params.subscribe(params => {
            let id = params['id'];
            console.log('ngOnInit for rate-detail ' + id);

            if (id === 'new') {
                this.rate = new Rate();
            } else {
                this.rateService.getRate(id)
                    .subscribe(rate => {
                            this.rate = rate;
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

    gotoWarehouse() {
        this.router.navigate(['/warehouse', this.rate.warehouse.id]);
    }

    clearWarehouse() {
        this.rate.warehouse = null;
    }

    onSave() {
        this.rateService.update(this.rate).
            subscribe(
                rate => {
                    this.rate = rate;
                    if (this.sub) {
                        this.onSaveClicked.emit(this.rate);
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