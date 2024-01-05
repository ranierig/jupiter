import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { PostService } from './services/post.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'jupiterfront';
  posts: any;

  constructor(private service:PostService) {}
  
  ngOnInit() {
    this.service.getPosts()
      .subscribe(response => {
        this.posts = response;
      });
  }
}
