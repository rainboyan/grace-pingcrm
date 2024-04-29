package grace.demos

class User {

    String firstName
    String lastName
    String email
    String password
    Boolean owner = false

    static constraints = {
        firstName(blank: false, nullable: false, maxSize: 25)
        lastName(blank: false, nullable: false, maxSize: 25)
        email(blank: false, nullable: true, maxSize: 50)
        password(blank: false, nullable: false, maxSize: 100)
    }

    static mapping = {
        table 'users'
    }

}
