//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/entities/entity.ts.e.vm
//

export class Author {
    // Raw attributes
    id : number;
    birthDate : Date;
    birthDateTime : Date;
    civility : string;
    email : string;
    firstName : string;
    lastName : string;
    favoriteAuthorId : number;


    constructor(json? : any) {
        if (json != null) {
            this.id = json.id;
            if (json.birthDate != null) {
                this.birthDate = new Date(json.birthDate);
            }
            if (json.birthDateTime != null) {
                this.birthDateTime = new Date(json.birthDateTime);
            }
            this.civility = json.civility;
            this.email = json.email;
            this.firstName = json.firstName;
            this.lastName = json.lastName;
            this.favoriteAuthorId = json.favoriteAuthorId;
        }
    }

    // Utils

    static toArray(jsons : any[]) : Author[] {
        let authors : Author[] = [];
        if (jsons != null) {
            for (let json of jsons) {
                authors.push(new Author(json));
            }
        }
        return authors;
    }
}