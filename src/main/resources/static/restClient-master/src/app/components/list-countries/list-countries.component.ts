import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Country} from "../../country";
import {CountryService} from "../../shared-service/country.service";

@Component({
  selector: 'app-list-countries',
  templateUrl: './list-countries.component.html',
  styleUrls: ['./list-countries.component.css']
})
export class ListCountriesComponent implements OnInit {

  private countriesList:Country[];

  constructor(private _countryService:CountryService, private _router:Router) { }

  ngOnInit() {
    this._countryService.getCountries().subscribe((countries)=>{
      console.log(countries);
      this.countriesList= countries;
    },(error)=>{
      console.log(error);
    })
  }

  deleteCountry(country){
    this._countryService.deleteCountry(country.country_Id).subscribe((data)=>{
      this.countriesList.splice(this.countriesList.indexOf(country),1);
      this.ngOnInit();
    },(error)=>{
      console.log(error);
    });
  }

  updatCountry(country){
    this._countryService.setter(country);
    this._router.navigate(['/country']);


  }
  newCountry(){
    let countries = new Country();
    this._countryService.setter(countries);
    this._router.navigate(['/country']);

  }
}
