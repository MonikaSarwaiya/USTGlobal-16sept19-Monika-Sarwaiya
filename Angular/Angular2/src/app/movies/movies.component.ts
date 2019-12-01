import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  selectedMovie;
   Movies = [
     {
        name : 'Adventure',
        imgUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
        rating : '5/10',
        description : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
     },
     {
      name : 'Charlie Chaplin',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      rating : '6/10',
       description : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
     },
       {
    name : 'Captain America',
     imgUrl : 'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
     rating : '10/10',
    description : 'After Steve Rogers decides to volunteer as a guinea pig in an experiment, his weak body is fully enhanced. A secret Nazi organisation tries to exploit the technology and he must stand against them.'
      },
     {
  name : 'Ironman',
  imgUrl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
  rating : '9/10',
  description : 'When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.'
    },
   ];
  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }
}
