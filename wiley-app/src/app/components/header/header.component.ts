import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { UiService } from 'src/app/service/ui.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  title = "Task Management"
  showAddTask: boolean = false;
  subscription?: Subscription;
  constructor(
    private router: Router,
    private uiService: UiService
  ) {
    this.subscription = this.uiService
      .onToggle()
      .subscribe(
        (value) => { this.showAddTask = value }
      )
  }

  ngOnInit(): void {

  }

  toggleTask() {
    console.log("toggle from header component");
    this.uiService.toggleAddTask();
  }

  hasRoute(route: string) {
    return this.router.url === route
  }
}

