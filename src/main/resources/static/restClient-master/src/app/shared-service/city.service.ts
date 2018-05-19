import { Injectable } from '@angular/core';
import{Http, Response, Headers, RequestOptions} from '@angular/http';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {City} from '../city';
import {log} from "util";

@Injectable()
export class CityService {

  private baseUrl:string='http://localhost:8080/api';
  private headers = new Headers({'Content-Type': 'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private city:City;

  constructor(private _http:Http) { }

  getCities(){
    return this._http.get(this.baseUrl + '/cities' , this.options ).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }

  getCity(city_Id:Number){
    return this._http.get(this.baseUrl+'/city/'+ city_Id, this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }

  deleteCity(Id:Number){
    return this._http.delete(this.baseUrl+'/city/'+ Id, this.options).map((response:Response)=>response.json());

  }

  createCity(city:City){
    return this._http.post(this.baseUrl+'/city', JSON.stringify(city), this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }

  updateCity(city:City){
    return this._http.put(this.baseUrl+'/city', JSON.stringify(city), this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }

  errorHandler(error:Response){
      return Observable.throw (error||"SERVER ERROR");

  }

  setter(city:City){
    this.city=city;
  }

  getter(){
    return this.city;
  }


}
