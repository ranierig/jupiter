import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PostService {
 private url = 'http://localhost:8081/cadastrarpessoa';
  constructor(private httpClient: HttpClient) { }
getPosts(){
  return this.httpClient.get(this.url);
}

}
