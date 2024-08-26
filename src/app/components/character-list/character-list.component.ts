import { Component, OnInit } from '@angular/core';
import { MarvelService } from '../../services/marvel.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css']
})
export class CharacterListComponent  {
  //arreglo de personajes
  characters: any[] = [];

  constructor(
    private route: ActivatedRoute,
    private marvelService: MarvelService
  ) {}

  async ngOnInit(): Promise<void> {
    const observable = await this.marvelService.getCharacters();
    observable.subscribe((data: any) => {
      this.characters = data.data.results;
    });
  }
  
}

