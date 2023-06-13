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
  private apiUrl = "http://localhost:5000/tasks"
  constructor(private http: HttpClient) {
  }

  getTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(this.apiUrl);
  }

  getTaskById(id: string): Observable<Task> {
    return this.http.get<Task>(this.apiUrl + "/" + id)
  }

  deleteTask(task: Task): Observable<Task> {
    const url = `${this.apiUrl}/${task.id}`
    return this.http.delete<Task>(url);
  }
  //update Task Reminder
  updateTaskReminder(task: Task): Observable<Task> {
    const url = `${this.apiUrl}/${task.id}`;
    return this.http.put<Task>(url, task, headerOptions)
  }
  //Add Task
  addTask(task: Task): Observable<Task> {
    return this.http.post<Task>(this.apiUrl, task, headerOptions)
  }
}




