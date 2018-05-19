import { Injectable } from '@angular/core';
import{Http, Response, Headers, RequestOptions} from '@angular/http';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {Country} from "../country";

@Injectable()
export class CountryService {

  private baseUrl:string='http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private country:Country;

  constructor(private _http:Http) { }

  getCountries(){
    return this._http.get(this.baseUrl+'/countries',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getCountry(id:Number){
    return this._http.get(this.baseUrl+'/country/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  deleteCountry(id:Number){
    return this._http.delete(this.baseUrl+'/country/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  createCountry(country:Country){
    return this._http.post(this.baseUrl+'/country',JSON.stringify(country),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  updateCountry(country:Country){
    return this._http.put(this.baseUrl+'/country',JSON.stringify(country),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  errorHandler(error:Response){

    return Observable.throw(error||"SERVER ERROR");
  }

  setter(country:Country){
    this.country=country;
  }

  getter(){
    return this.country;
  }
}
