import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/interfaces';
import { AuthorService } from 'src/app/services/author.service';

@Component({
  selector: 'app-my-books',
  templateUrl: './my-books.component.html',
  styleUrls: ['./my-books.component.css']
})
export class MyBooksComponent implements OnInit {
  books!: Book[]
  constructor(private authorService: AuthorService) {
    authorService.getBooksByAuthor().subscribe((books) => {
      this.books = books;
    });
  }

  ngOnInit(): void {

  }
}
