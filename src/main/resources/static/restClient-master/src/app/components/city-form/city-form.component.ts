import { Component, OnInit } from '@angular/core';
import {CityService} from "../../shared-service/city.service";
import {City} from "../../city";
import {Router} from "@angular/router";

@Component({
  selector: 'app-city-form',
  templateUrl: './city-form.component.html',
  styleUrls: ['./city-form.component.css']
})
export class CityFormComponent implements OnInit {
  private city:City;

  constructor(private _cityService:CityService, private _router:Router) { }

  ngOnInit() {
    this.city=this._cityService.getter();
  }

  processFormCity(){
    if(this.city.city_Id==undefined){
      this._cityService.createCity(this.city).subscribe((city)=>{
        console.log(city);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }else {
      this._cityService.updateCity(this.city).subscribe((city)=>{
        console.log(city);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }
  }
}
