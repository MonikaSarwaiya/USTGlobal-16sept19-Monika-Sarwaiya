import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive ({
    selector: '[custDir]'
})


export class CustomDirective {
    constructor(private el: ElementRef) {
   this.el.nativeElement.style.color='blue'
    }

     @HostBinding('style.backgroundColor') backgroundColor='red';

     @HostListener('mouseenter') mouseEnterEvent() {
         this.el.nativeElement.style.backgroundColor='gray';
     }

     @HostListener('mouseleave') mouseLeaveEvent() {
        this.el.nativeElement.style.backgroundColor='brown';
    }
}