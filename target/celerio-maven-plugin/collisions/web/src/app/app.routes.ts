//
// Project home: https://github.com/jaxio/celerio-angular-quickstart
// 
// Source code generated by Celerio, an Open Source code generator by Jaxio.
// Documentation: http://www.jaxio.com/documentation/celerio/
// Source code: https://github.com/jaxio/celerio/
// Follow us on twitter: @jaxiosoft
// This header can be customized in Celerio conf...
// Template pack-angular:web/src/app/app.routes.ts.p.vm
//
import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home.component';

import { AuthorListComponent } from './entities/author/author-list.component';
import { AuthorDetailComponent } from './entities/author/author-detail.component';

import { BookListComponent } from './entities/book/book-list.component';
import { BookDetailComponent } from './entities/book/book-detail.component';

import { BookmarkListComponent } from './entities/bookmark/bookmark-list.component';
import { BookmarkDetailComponent } from './entities/bookmark/bookmark-detail.component';

import { DatabasechangelogListComponent } from './entities/databasechangelog/databasechangelog-list.component';
import { DatabasechangelogDetailComponent } from './entities/databasechangelog/databasechangelog-detail.component';

import { DatabasechangeloglockListComponent } from './entities/databasechangeloglock/databasechangeloglock-list.component';
import { DatabasechangeloglockDetailComponent } from './entities/databasechangeloglock/databasechangeloglock-detail.component';

import { EnquiryListComponent } from './entities/enquiry/enquiry-list.component';
import { EnquiryDetailComponent } from './entities/enquiry/enquiry-detail.component';

import { GoodsListComponent } from './entities/goods/goods-list.component';
import { GoodsDetailComponent } from './entities/goods/goods-detail.component';

import { GuestListComponent } from './entities/guest/guest-list.component';
import { GuestDetailComponent } from './entities/guest/guest-detail.component';

import { MyTestListComponent } from './entities/myTest/myTest-list.component';
import { MyTestDetailComponent } from './entities/myTest/myTest-detail.component';

import { OrderListComponent } from './entities/order/order-list.component';
import { OrderDetailComponent } from './entities/order/order-detail.component';

import { PassportListComponent } from './entities/passport/passport-list.component';
import { PassportDetailComponent } from './entities/passport/passport-detail.component';

import { ProjectListComponent } from './entities/project/project-list.component';
import { ProjectDetailComponent } from './entities/project/project-detail.component';

import { RateListComponent } from './entities/rate/rate-list.component';
import { RateDetailComponent } from './entities/rate/rate-detail.component';

import { RecordListComponent } from './entities/record/record-list.component';
import { RecordDetailComponent } from './entities/record/record-detail.component';

import { RoleListComponent } from './entities/role/role-list.component';
import { RoleDetailComponent } from './entities/role/role-detail.component';

import { UseCase1ListComponent } from './entities/useCase1/useCase1-list.component';
import { UseCase1DetailComponent } from './entities/useCase1/useCase1-detail.component';

import { UseCase2ListComponent } from './entities/useCase2/useCase2-list.component';
import { UseCase2DetailComponent } from './entities/useCase2/useCase2-detail.component';

import { UseCase3ListComponent } from './entities/useCase3/useCase3-list.component';
import { UseCase3DetailComponent } from './entities/useCase3/useCase3-detail.component';

import { UserListComponent } from './entities/user/user-list.component';
import { UserDetailComponent } from './entities/user/user-detail.component';

import { WarehouseListComponent } from './entities/warehouse/warehouse-list.component';
import { WarehouseDetailComponent } from './entities/warehouse/warehouse-detail.component';

import { WarehouseGoodsListComponent } from './entities/warehouseGoods/warehouseGoods-list.component';
import { WarehouseGoodsDetailComponent } from './entities/warehouseGoods/warehouseGoods-detail.component';

import { WarehousePhotoListComponent } from './entities/warehousePhoto/warehousePhoto-list.component';
import { WarehousePhotoDetailComponent } from './entities/warehousePhoto/warehousePhoto-detail.component';

import { WarehouseReviewListComponent } from './entities/warehouseReview/warehouseReview-list.component';
import { WarehouseReviewDetailComponent } from './entities/warehouseReview/warehouseReview-detail.component';

import { WarehouseServiceProviderListComponent } from './entities/warehouseServiceProvider/warehouseServiceProvider-list.component';
import { WarehouseServiceProviderDetailComponent } from './entities/warehouseServiceProvider/warehouseServiceProvider-detail.component';

export const routes: Routes = [
    { path : '',  component: HomeComponent }
    ,
    {path: 'author-list', component: AuthorListComponent },
    {path: 'author/:id', component: AuthorDetailComponent }
    ,
    {path: 'book-list', component: BookListComponent },
    {path: 'book/:id', component: BookDetailComponent }
    ,
    {path: 'bookmark-list', component: BookmarkListComponent },
    {path: 'bookmark/:id', component: BookmarkDetailComponent }
    ,
    {path: 'databasechangelog-list', component: DatabasechangelogListComponent },
    {path: 'databasechangelog/:id', component: DatabasechangelogDetailComponent }
    ,
    {path: 'databasechangeloglock-list', component: DatabasechangeloglockListComponent },
    {path: 'databasechangeloglock/:id', component: DatabasechangeloglockDetailComponent }
    ,
    {path: 'enquiry-list', component: EnquiryListComponent },
    {path: 'enquiry/:id', component: EnquiryDetailComponent }
    ,
    {path: 'goods-list', component: GoodsListComponent },
    {path: 'goods/:id', component: GoodsDetailComponent }
    ,
    {path: 'guest-list', component: GuestListComponent },
    {path: 'guest/:id', component: GuestDetailComponent }
    ,
    {path: 'myTest-list', component: MyTestListComponent },
    {path: 'myTest/:id', component: MyTestDetailComponent }
    ,
    {path: 'order-list', component: OrderListComponent },
    {path: 'order/:id', component: OrderDetailComponent }
    ,
    {path: 'passport-list', component: PassportListComponent },
    {path: 'passport/:id', component: PassportDetailComponent }
    ,
    {path: 'project-list', component: ProjectListComponent },
    {path: 'project/:id', component: ProjectDetailComponent }
    ,
    {path: 'rate-list', component: RateListComponent },
    {path: 'rate/:id', component: RateDetailComponent }
    ,
    {path: 'record-list', component: RecordListComponent },
    {path: 'record/:id', component: RecordDetailComponent }
    ,
    {path: 'role-list', component: RoleListComponent },
    {path: 'role/:id', component: RoleDetailComponent }
    ,
    {path: 'useCase1-list', component: UseCase1ListComponent },
    {path: 'useCase1/:id', component: UseCase1DetailComponent }
    ,
    {path: 'useCase2-list', component: UseCase2ListComponent },
    {path: 'useCase2/:id', component: UseCase2DetailComponent }
    ,
    {path: 'useCase3-list', component: UseCase3ListComponent },
    {path: 'useCase3/:id', component: UseCase3DetailComponent }
    ,
    {path: 'user-list', component: UserListComponent },
    {path: 'user/:id', component: UserDetailComponent }
    ,
    {path: 'warehouse-list', component: WarehouseListComponent },
    {path: 'warehouse/:id', component: WarehouseDetailComponent }
    ,
    {path: 'warehouseGoods-list', component: WarehouseGoodsListComponent },
    {path: 'warehouseGoods/:id', component: WarehouseGoodsDetailComponent }
    ,
    {path: 'warehousePhoto-list', component: WarehousePhotoListComponent },
    {path: 'warehousePhoto/:id', component: WarehousePhotoDetailComponent }
    ,
    {path: 'warehouseReview-list', component: WarehouseReviewListComponent },
    {path: 'warehouseReview/:id', component: WarehouseReviewDetailComponent }
    ,
    {path: 'warehouseServiceProvider-list', component: WarehouseServiceProviderListComponent },
    {path: 'warehouseServiceProvider/:id', component: WarehouseServiceProviderDetailComponent }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
