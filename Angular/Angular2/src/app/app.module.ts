import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { MoviesComponent } from './movies/movies.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { RouterModule } from '@angular/router';
import { BikeschildComponent } from './bikeschild/bikeschild.component';
import { CarschildComponent } from './carschild/carschild.component';
import { LaptopschildComponent } from './laptopschild/laptopschild.component';
import { MobileschildComponent } from './mobileschild/mobileschild.component';
import { MovieschildComponent } from './movieschild/movieschild.component';
import { NewsComponent } from './news/news.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    BikesComponent,
    MoviesComponent,
    LaptopsComponent,
    MobilesComponent,
    BikeschildComponent,
    CarschildComponent,
    LaptopschildComponent,
    MobileschildComponent,
    MovieschildComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent},
      {path : 'cars' , component : CarsComponent},
      {path : 'bikes' , component : BikesComponent},
      {path : 'movies' , component : MoviesComponent},
      {path : 'laptops' , component : LaptopsComponent},
      {path : 'mobiles' , component : MobilesComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
