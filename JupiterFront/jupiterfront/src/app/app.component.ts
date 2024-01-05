import { Component, OnInit } from '@angular/core';
import { CadastroService } from './services/cadastro.service';
import { iCadastro } from './types/iCadastros';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent implements OnInit {
  
  title = 'jupiterfront';
  cadastro = {} as iCadastro;
  //cadastros: iCadastro[];
  cadastros: iCadastro[] | undefined ;
  
  constructor(private cadastroService: CadastroService) {
  }

  ngOnInit() {
    //this.obterCadastros();
   this.cadastroService.obterCadastros()
   //.subscribe(obterCadastros =>  this.cadastro = obterCadastros.body);
   // throw new Error('Method not implemented.');
  }

    // Chama o serviço para obtém todos os carros
    obterCadastros() {
      this.cadastroService.obterCadastros().subscribe((cadastros: iCadastro[]) => {
        this.cadastros = cadastros;
      });
    }

}
