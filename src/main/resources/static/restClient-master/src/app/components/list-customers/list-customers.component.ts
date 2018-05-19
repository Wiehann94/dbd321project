import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {CustomerService} from "../../shared-service/customer.service";
import {Customer} from "../../customer";

@Component({
  selector: 'app-list-customers',
  templateUrl: './list-customers.component.html',
  styleUrls: ['./list-customers.component.css']
})
export class ListCustomersComponent implements OnInit {

  private customer:Customer[];

  constructor(private _customerService:CustomerService, private _router:Router) { }

  ngOnInit() {
    this._customerService.getCustomers().subscribe((customer)=>{
      console.log(customer);
      this.customer= customer;
    },(error)=>{
      console.log(error);
    })
  }

  deleteACustomer(customer){
    this._customerService.deleteCustomer(customer.customer_Id).subscribe((data)=>{
      this.customer.splice(this.customer.indexOf(data),1);
    },(error)=>{
      console.log(error);
    });
  }

  updatCustomer(customer){
    this._customerService.setter(customer);
    this._router.navigate(['/customer']);


  }
  newCustomer(){
    let customer = new Customer();
    this._customerService.setter(customer);
    this._router.navigate(['/customer']);

  }

}
