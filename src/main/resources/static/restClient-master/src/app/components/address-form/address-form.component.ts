import { Component, OnInit } from '@angular/core';
import {AddressService} from "../../shared-service/address.service";
import {Address} from "../../address";
import {Router} from "@angular/router";


@Component({
  selector: 'app-address-form',
  templateUrl: './address-form.component.html',
  styleUrls: ['./address-form.component.css']
})
export class AddressFormComponent implements OnInit {

  private address:Address;

  constructor(private _addressService:AddressService, private _router:Router) { }

  ngOnInit() {
    this.address=this._addressService.getter();
    }

  processFormAddress(){
    if(this.address.address_Id==undefined){
      this._addressService.createAddress(this.address).subscribe((address)=>{
        console.log(address);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }else {
      this._addressService.updateAddress(this.address).subscribe((address)=>{
        console.log(address);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }
    }
}
