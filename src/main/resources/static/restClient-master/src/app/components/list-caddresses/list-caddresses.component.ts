import { Component, OnInit } from '@angular/core';
import {AddressService} from "../../shared-service/address.service";
import {Address} from "../../address";
import {Router} from "@angular/router";

@Component({
  selector: 'app-list-caddresses',
  templateUrl: './list-caddresses.component.html',
  styleUrls: ['./list-caddresses.component.css']
})
export class ListCAddressesComponent implements OnInit {

  private address:Address[];

  constructor(private _addressService:AddressService, private _router:Router) { }

  ngOnInit() {
    this._addressService.getAddresses().subscribe((addresses)=>{
      console.log(addresses);
      this.address= addresses;
    },(error)=>{
      console.log(error);
    })
  }

  deleteAddress(address){
    this._addressService.deleteAddress(address.id).subscribe((data)=>{
      this.address.splice(this.address.indexOf(address),1);
    },(error)=>{
      console.log(error);
    });
  }

  updatAddress(address){
    this._addressService.setter(address);
    this._router.navigate(['/op']);


  }
  newAddress(){
    let adresses = new Address();
    this._addressService.setter(adresses);
    this._router.navigate(['/op']);

  }

}
