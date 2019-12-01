import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
news;
  constructor(private http: HttpClient) { 
    this.getNews();
  }
getNews() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=aceea67c7c894f028dac1a3d07863702').subscribe( data => {
    console.log(data)
    this.news=data.articles
  }, err => {
  console.log(err)
  }, () => {
    console.log("News got successfully")
  })
}
  ngOnInit() {
  }

}
