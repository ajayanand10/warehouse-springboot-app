//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity-line.component.ts.e.vm
//
import {Component, Input} from '@angular/core';
import {Enquiry} from './enquiry';

@Component({
	template: `
        {{ enquiry?.description }} {{ enquiry?.creationAuthor }} {{ enquiry?.lastModificationAuthor }} 	`,
	selector: 'enquiry-line',
})
export class EnquiryLineComponent {
    @Input() enquiry : Enquiry;
}
