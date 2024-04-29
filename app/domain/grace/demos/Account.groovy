package grace.demos

class Account {

    String name

    static constraints = {
        name(blank: false, nullable: false, maxSize: 50)
    }

}
