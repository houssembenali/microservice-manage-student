import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-stu',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  listTrainings;
  listStudents;
  currentTraining={id:-1};

  constructor(private hhtpClient:HttpClient) { }

  ngOnInit() {
  this.hhtpClient.get("http://localhost:8080/trainings")
  .subscribe(data=>{
    this.listTrainings=data;
  },err=>{
    console.log(err);
  });

  }

  onGetStudents(f){
    this.currentTraining=f;
    this.hhtpClient.get("http://localhost:8080/trainings/"+f.id+"/students")
  .subscribe(data=>{
    this.listStudents=data;
  },err=>{
    console.log(err);
  });
  }

}
