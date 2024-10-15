import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  // URL da API
  private url:string = "http://localhost:8080"

  // Constructor
  constructor(private http:HttpClient) { }
}
