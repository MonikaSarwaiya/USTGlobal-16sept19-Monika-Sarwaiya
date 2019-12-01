import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  newsArray:any[] = []
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  searchMovies(movie){
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=us&apiKey=aceea67c7c894f028dac1a3d07863702`)
    .subscribe(resData => {
      this.newsArray = resData.Search;
      console.log(this.newsArray);
    })
  }
}
}