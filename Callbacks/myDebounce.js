Function.prototype.myDebounce = function(interval) {
    let tooSoon = false;

    let timer = setTimeout(function () {
        tooSoon = false;
    }, interval);

    return (...args) => {

        if (!tooSoon) {
            this(...args);
            tooSoon = true;

            timer = setTimeout(function () {
                tooSoon = false;
            }, interval); 

        } else {
            clearTimeout(timer);
            timer = setTimeout(function () {
                tooSoon = false;
            }, interval);
        }
    };
};

class SearchBar {
    constructor() {
        this.query = "";

        this.type = this.type.bind(this);
        this.search = this.search.bind(this);
    }

    type(letter) {
        this.query += letter;
        this.search();
    }

    search() {
        console.log(`searching for ${this.query}`);
    }
}

const searchBar = new SearchBar;
searchBar.search = searchBar.search.myDebounce(500);

const queryForHelloWorld = () => {
    searchBar.type("h");
    searchBar.type("e");
    searchBar.type("l");
    searchBar.type("l");
    searchBar.type("o");
    searchBar.type(" ");
    searchBar.type("w");
    searchBar.type("o");
    searchBar.type("r");
    searchBar.type("l");
    searchBar.type("d");
}

queryForHelloWorld();