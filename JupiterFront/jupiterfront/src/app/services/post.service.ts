import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';


interface Comment { content: Comment[] }

@Injectable({
  providedIn: 'root'
})
export class PostService {
 private url = 'http://localhost:8081/cadastrarpessoa';
  constructor(private httpClient: HttpClient) { }
getPosts(): Observable<Comment[]>{
  return this.httpClient.get<Comment>(this.url)
  .pipe(map(i => i.content));
}

}
