import { Component } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
  constructor() {
  }

  childMessage = ""
  product = {
    name: "vimal",
    type: "pan-masala",
    rate: "10Rs",
    legalAge: 18,
  }

  productInfo = " this is the info for the product "

  receiveEvent(message: string) {
    this.childMessage = message;
  }

}
