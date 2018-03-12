import {Component} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  param_a: number;
  param_b: number;
  operation: string;
  result: any;

  types = ['+', '-', '*', '/'];
  order = {
    type: '+'
  };

  callType(value) {
    this.order.type = value;
    this.operation = value;
  }

  headers = new HttpHeaders(
    {'Content-Type': 'application/json; charset=utf-8'});

  constructor(private http: HttpClient) {
    this.operation = '+';
  }

  submit() {
    var json = {'param_a': this.param_a, 'param_b': this.param_b, 'operation': this.operation};
    this.http.post<any>('http://localhost:8080/api/post', json, {headers: this.headers}).subscribe(
      data => {
        this.result = data.result;
      },
    error => {
      console.error(error);
    }
  )
    ;
  }
}
