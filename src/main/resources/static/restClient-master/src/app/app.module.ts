import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{RouterModule, Routes}   from '@angular/router';
import{HttpModule}   from '@angular/http';
import{FormsModule}   from '@angular/forms';
import { AppComponent } from './app.component';
import { ListuserComponent } from './components/listuser/listuser.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import{UserService}   from './shared-service/user.service';

import { ListCitiesComponent } from './components/list-cities/list-cities.component';
import { ListCountriesComponent } from './components/list-countries/list-countries.component';
import { ListCustomersComponent } from './components/list-customers/list-customers.component';
import { ListCAddressesComponent } from './components/list-caddresses/list-caddresses.component';
import { CityFormComponent } from './components/city-form/city-form.component';
import { CountryFormComponent } from './components/country-form/country-form.component';
import { CustomerFormComponent } from './components/customer-form/customer-form.component';
import { AddressFormComponent } from './components/address-form/address-form.component';
import {CityService} from "./shared-service/city.service";
import {AddressService} from './shared-service/address.service';
import {CountryService} from './shared-service/country.service';
import {CustomerService} from './shared-service/customer.service';

const appRoutes:Routes=[
  //{path:'', component:ListuserComponent},
  //{path:'op', component:UserFormComponent},
  {path: 'cities', component:ListCitiesComponent},
  {path: 'customers', component:ListCustomersComponent},
  {path: 'countries', component:ListCountriesComponent},
  {path: 'addresses', component:ListCAddressesComponent},
  {path: 'citiesform', component:CityFormComponent},
  {path: 'countriesform', component:CountryFormComponent},
  {path: 'custoemrsfrom', component:CustomerFormComponent},
  {path: 'addressform', component:AddressFormComponent},
  {path: 'customer', component:CustomerFormComponent},
  {path: 'city', component:CityFormComponent},
  {path: 'country', component:CountryFormComponent},
  {path: 'address', component:AddressFormComponent}
  // {path: '',}
];

@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    UserFormComponent,
    ListCitiesComponent,
    ListCountriesComponent,
    ListCustomersComponent,
    ListCAddressesComponent,
    CityFormComponent,
    CountryFormComponent,
    CustomerFormComponent,
    AddressFormComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [UserService,CityService,AddressService,CountryService,CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
