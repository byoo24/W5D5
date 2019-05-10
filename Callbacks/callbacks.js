

class Clock {
    constructor() {
        // 1. Create a Date object.
        // 2. Store the hours, minutes, and seconds.
        // 3. Call printTime.
        // 4. Schedule the tick at 1 second intervals.  
        this.date = new Date();
        this.hours = this.date.getHours();
        this.minutes = this.date.getMinutes();
        this.seconds = this.date.getSeconds();

        setInterval(function () { 
            this._tick(); 
            this.printTime();
        }.bind(this), 1000);

    } // constructor()


    printTime() {
        // Format the time in HH:MM:SS
        // Use console.log to print it.
        let hours, minutes, seconds;

        if(this.seconds < 10) {
            seconds = "0" + this.seconds.toString();
        } else {
            seconds = this.seconds.toString();
        }

        if (this.minutes < 10) {
            minutes = "0" + this.minutes.toString();
        } else {
            minutes = this.minutes.toString();
        }

        if (this.hours < 10) {
            hours = "0" + this.hours.toString();
        } else {
            hours = this.hours.toString();
        }

        console.log(`${hours}:${minutes}:${seconds}`);
    } // printTime()


    _tick() {
        this.seconds++;

        if (this.seconds === 60) {
            this.minutes++;
            this.seconds = 0;
        }

        if (this.minutes === 60) {
            this.hours++;
            this.minutes = 0;
        }

        if (this.hours === 24) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    } // _tick()
} // class Clock



    






