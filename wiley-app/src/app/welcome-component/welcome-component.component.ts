import { Component } from '@angular/core';
import { guest, guestList } from './guests';

@Component({
  selector: 'app-welcome-component',
  templateUrl: './welcome-component.component.html',
  styleUrls: ['./welcome-component.component.css']
})
export class WelcomeComponentComponent {
  message = "Welcome to wiley app!!"
  guests = guestList;

  selectedGuest?: guest;
  onClick(guest: guest){
    this.selectedGuest = guest;
  }
}
