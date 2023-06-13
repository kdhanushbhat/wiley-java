import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'removeSpecial'
})
export class RemoveSpecialPipe implements PipeTransform {
  str = ""
  transform(value: string): string {
    for (let s of value) {
      if (s.match(/[ a-z]/i)) {
        this.str = this.str + s.toUpperCase();
      }
    }
    return this.str;
  }

}
