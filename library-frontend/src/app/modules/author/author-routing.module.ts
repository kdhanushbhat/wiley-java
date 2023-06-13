import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { MyBooksComponent } from './components/my-books/my-books.component';
import { AppointmentsComponent } from './components/appointments/appointments.component';

const routes: Routes = [
  {
    path: "", component: DashboardComponent, children: [
      { path: 'home', component: HomeComponent },
      { path: 'my-books', component: MyBooksComponent },
      { path: 'appointments', component: AppointmentsComponent },
      { path: '', redirectTo: '/author/home', pathMatch: 'full' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthorRoutingModule { }
