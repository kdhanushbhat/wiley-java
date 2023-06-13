import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthorRoutingModule } from './author-routing.module';
import { HomeComponent } from './components/home/home.component';
import { MyBooksComponent } from './components/my-books/my-books.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from './components/header/header.component';
import { AppointmentsComponent } from './components/appointments/appointments.component';
import { BookComponent } from './components/book/book.component';


@NgModule({
  declarations: [
    HomeComponent,
    MyBooksComponent,
    DashboardComponent,
    HeaderComponent,
    AppointmentsComponent,
    BookComponent
  ],
  imports: [
    CommonModule,
    AuthorRoutingModule
  ]
})
export class AuthorModule { }
