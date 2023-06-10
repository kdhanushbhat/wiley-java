import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-productdetails',
  templateUrl: './productdetails.component.html',
  styleUrls: ['./productdetails.component.css']
})
export class ProductdetailsComponent {
  @Input() productDetails = ""
  @Input() details = {
    name: "",
    type: "",
    legalAge: 0,
    rate: ""
  }
  @Output() event = new EventEmitter
  message = "Okay mate!!"


  callEvent() {
    this.event.emit(this.message);
  }

}
