package qotd

class QuoteController {

    static defaultAction = "home"
    def home() {
        render "<h1>Real Programmers do not eat Quiche</h1>"
    }
}
