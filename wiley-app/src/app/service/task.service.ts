import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Task } from "../../app/Task"
const headerOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private url = "http://localhost:5000/tasks"
  constructor(private http: HttpClient) {
    this.getTasks()
  }

  getTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(this.url);
  }
}
