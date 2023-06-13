import { Component, OnInit } from '@angular/core';
import { Author } from 'src/app/interfaces';
import { AuthorService } from 'src/app/services/author.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  authorDetails!: Author
  constructor(private authorService: AuthorService) {
    authorService.getUserDetails().subscribe(
      (author) => {
        this.authorDetails = author
      }
    );
  }

  ngOnInit(): void {

  }

}
