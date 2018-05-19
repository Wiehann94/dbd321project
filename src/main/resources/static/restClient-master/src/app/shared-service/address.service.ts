import { Injectable } from '@angular/core';
import{Http, Response, Headers, RequestOptions} from '@angular/http';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {Address} from "../Address";

@Injectable()
export class AddressService {
  private baseUrl:string='http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private address:Address;


  constructor(private _http:Http) { }

  getAddresses(){
    return this._http.get(this.baseUrl+'/addresses',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getAddress(id:Number){
    return this._http.get(this.baseUrl+'/address/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  deleteAddress(id:Number){
    return this._http.delete(this.baseUrl+'/address/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  createAddress(address:Address){
    return this._http.post(this.baseUrl+'/address',JSON.stringify(address),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  updateAddress(address:Address){
    return this._http.put(this.baseUrl+'/address',JSON.stringify(address),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  errorHandler(error:Response){

    return Observable.throw(error||"SERVER ERROR");
  }

  setter(address:Address){
    this.address=address;
  }

  getter(){
    return this.address;
  }
}
