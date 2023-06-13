import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthorService } from 'src/app/services/author.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email!: string
  password!: string
  authorId!: number
  constructor(private authorService: AuthorService, private router: Router) { }

  ngOnInit(): void {

  }

  onSubmit() {
    const credentials = {
      email: this.email,
      password: this.password
    }
    this.authorService.authenticateUser(credentials).subscribe((response) => {
      if (response.authorId === null) {
        alert("Invalid credentails");
        return;
      }
      this.authorService.setAuthorId(response.authorId);
      this.router.navigateByUrl("/author/home")
    });
  }

}
