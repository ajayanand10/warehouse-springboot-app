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

import { BookmarkListComponent } from './entities/bookmark/bookmark-list.component';
import { BookmarkDetailComponent } from './entities/bookmark/bookmark-detail.component';

import { EnquiryListComponent } from './entities/enquiry/enquiry-list.component';
import { EnquiryDetailComponent } from './entities/enquiry/enquiry-detail.component';

import { GoodsListComponent } from './entities/goods/goods-list.component';
import { GoodsDetailComponent } from './entities/goods/goods-detail.component';

import { GuestListComponent } from './entities/guest/guest-list.component';
import { GuestDetailComponent } from './entities/guest/guest-detail.component';

import { OrderListComponent } from './entities/order/order-list.component';
import { OrderDetailComponent } from './entities/order/order-detail.component';

import { RateListComponent } from './entities/rate/rate-list.component';
import { RateDetailComponent } from './entities/rate/rate-detail.component';

import { RoleListComponent } from './entities/role/role-list.component';
import { RoleDetailComponent } from './entities/role/role-detail.component';

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
    {path: 'bookmark-list', component: BookmarkListComponent },
    {path: 'bookmark/:id', component: BookmarkDetailComponent }
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
    {path: 'order-list', component: OrderListComponent },
    {path: 'order/:id', component: OrderDetailComponent }
    ,
    {path: 'rate-list', component: RateListComponent },
    {path: 'rate/:id', component: RateDetailComponent }
    ,
    {path: 'role-list', component: RoleListComponent },
    {path: 'role/:id', component: RoleDetailComponent }
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
