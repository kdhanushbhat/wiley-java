import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Subscription } from 'rxjs';
import { Task } from 'src/app/Task';
import { UiService } from 'src/app/service/ui.service';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css'],
})
export class AddTaskComponent implements OnInit {
  @Output() onAddTask: EventEmitter<Task> = new EventEmitter();

  text: string = '';
  day: string = '';
  reminder: boolean = false;
  showAddTask?: boolean;
  subscription?: Subscription;
  textAlert: boolean = false;
  constructor(
    private uiService: UiService
  ) {
    this.subscription = this.uiService.onToggle().subscribe(
      (value) => { this.showAddTask = value }
    )
  }

  ngOnInit(): void {
  }

  alertOff() {
    this.textAlert = false;
  }

  onSubmit() {
    if (!this.text) {
      this.textAlert = true;
      return;
    }
    const newTask: Task = {
      text: this.text,
      day: this.day,
      reminder: this.reminder,
    };
    this.onAddTask.emit(newTask);
    this.text = '';
    this.day = '';
    this.reminder = false;
  }
}
