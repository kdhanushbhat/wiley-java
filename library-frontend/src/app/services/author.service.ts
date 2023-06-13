import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Author, Book } from '../interfaces';
const headerOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    "Access-Control-Allow-Origin": ""
  })
}
@Injectable({
  providedIn: 'root'
})
export class AuthorService {
  private apiUrl: string = "http://localhost:8081"
  private authorId: number = 103
  constructor(private httpClient: HttpClient) { }

  getBooksByAuthor(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(`${this.apiUrl}/books/id/${this.authorId}`);
  }

  setAuthorId(authorId: number) {
    this.authorId = authorId
  }

  getUserDetails(): Observable<Author> {
    return this.httpClient.get<Author>(`${this.apiUrl}/author/id/${this.authorId}`);
  }

  authenticateUser(credentials: any): Observable<any> {
    return this.httpClient.post<any>(`${this.apiUrl}/author/login`, credentials)
  }

}

