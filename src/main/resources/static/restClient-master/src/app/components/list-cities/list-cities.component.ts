import { Component, OnInit } from '@angular/core';
import {CityService} from "../../shared-service/city.service";
import{City} from '../../city';
import {Router} from "@angular/router";


@Component({
  selector: 'app-list-cities',
  templateUrl: './list-cities.component.html',
  styleUrls: ['./list-cities.component.css']
})
export class ListCitiesComponent implements OnInit {


private city:City[];

constructor(private _cityService:CityService, private _router:Router) { }

ngOnInit() {
  this._cityService.getCities().subscribe((addresses)=>{
    console.log(addresses);
    this.city= addresses;
  },(error)=>{
    console.log(error);
  })
}

deleteCity(address){
  this._cityService.deleteCity(address.id).subscribe((data)=>{
    this.city.splice(this.city.indexOf(address),1);
  },(error)=>{
    console.log(error);
  });
}

updateCity(city){
  this._cityService.setter(city);
  this._router.navigate(['/op']);


}
newCity(){
  let cities = new City();
  this._cityService.setter(cities);
  this._router.navigate(['/op']);

}

}

