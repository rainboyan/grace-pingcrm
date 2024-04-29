package grace.demos

class Contact {

    String firstName
    String lastName
    String email
    String phone
    String address
    String city
    String region
    String country
    String postalCode

    static constraints = {
        firstName(blank: false, nullable: false, maxSize: 25)
        lastName(blank: false, nullable: false, maxSize: 25)
        email(blank: false, nullable: true, maxSize: 50)
        phone(blank: false, nullable: true, maxSize: 50)
        address(blank: false, nullable: true, maxSize: 150)
        city(blank: false, nullable: true, maxSize: 50)
        region(blank: false, nullable: true, maxSize: 50)
        country(blank: false, nullable: true, maxSize: 2)
        postalCode(blank: false, nullable: true, maxSize: 25)
    }

}
