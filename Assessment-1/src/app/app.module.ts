import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {  ReactiveFormsModule, FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { AddMoviesComponent } from './add-movies/add-movies.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    LoginComponent,
    AddMoviesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
     RouterModule.forRoot([
       {path: 'movies', component: MoviesComponent},
       {path: 'login', component: LoginComponent},
       {path: 'add', component: AddMoviesComponent}
     ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
