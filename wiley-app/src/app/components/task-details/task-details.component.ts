import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { Task } from 'src/app/Task';
import { TaskService } from 'src/app/service/task.service';
@Component({
  selector: 'app-task-details',
  templateUrl: './task-details.component.html',
  styleUrls: ['./task-details.component.css']
})
export class TaskDetailsComponent implements OnInit {
  task!: Task
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private taskService: TaskService
  ) {
    const taskId: string = this.route.snapshot.paramMap.get('id')!;
    this.taskService.getTaskById(taskId).subscribe((task) => {
      this.task = task
    });
  }

  ngOnInit(): void {

  }

}
