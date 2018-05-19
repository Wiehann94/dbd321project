import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {CustomerService} from "../../shared-service/customer.service";
import {Customer} from "../../customer";

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  private customer:Customer;

  constructor(private _customerService:CustomerService, private _router:Router) { }

  ngOnInit() {
    this.customer=this._customerService.getter();
  }

  processFormCustomer(){
    if(this.customer.address_Id==undefined){
      this._customerService.createCustomer(this.customer).subscribe((customer)=>{
        console.log(customer);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }else {
      this._customerService.updateCustomer(this.customer).subscribe((customer)=>{
        console.log(customer);
        this._router.navigate(['/']);
      },(error)=>{
        console.log(error);
      });
    }
  }
}
