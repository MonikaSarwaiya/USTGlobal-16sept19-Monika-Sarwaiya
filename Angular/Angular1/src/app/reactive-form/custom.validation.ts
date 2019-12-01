import { AbstractControl, ValidationErrors } from '@angular/forms';







export class CustomValidation {
    constructor() {}
    static unique(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'deepeshkhandelwal05@gmail.com') {
            return { unique: true };
        } else {
            return null;
        }
    }
    static match(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'password.value') {
            return { match: true};
        } else {
            return null;
        }
    }
}