import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Country} from "../../country";
import {CountryService} from "../../shared-service/country.service";

@Component({
  selector: 'app-country-form',
  templateUrl: './country-form.component.html',
  styleUrls: ['./country-form.component.css']
})
export class CountryFormComponent implements OnInit {
  private country:Country;

  constructor(private _countryService:CountryService, private _router:Router) { }

  ngOnInit() {
    this.country=this._countryService.getter();
  }

  processFormCountry(){
    if(this.country.country_Id==undefined){
      this._countryService.createCountry(this.country).subscribe((country)=>{
        console.log(country);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }else {
      this._countryService.updateCountry(this.country).subscribe((country)=>{
        console.log(country);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }
  }
}
