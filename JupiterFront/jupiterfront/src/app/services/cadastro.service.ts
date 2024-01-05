import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { iCadastro } from '../types/iCadastros';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';


@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  private apiUrl: string = environment.apiUrl;

  constructor(
    private httpClient: HttpClient
    ) { }
  
      // Headers
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }
  
    obterCadastros() : Observable<iCadastro[]> {
   // return this.httpClient.get<iCadastro[]>('${ this.apiUrl }/cadastrarpessoa')
    return this.httpClient.get<iCadastro[]>('http://localhost:8081/cadastrarpessoa')
              
  }
}
