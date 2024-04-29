package grace.demos

class Organization {

    String name
    String email
    String phone
    String address
    String city
    String region
    String country
    String postalCode

    static constraints = {
        name(blank: false, nullable: false, maxSize: 100)
        email(blank: false, nullable: true, maxSize: 50)
        phone(blank: false, nullable: true, maxSize: 50)
        address(blank: false, nullable: true, maxSize: 150)
        city(blank: false, nullable: true, maxSize: 50)
        region(blank: false, nullable: true, maxSize: 50)
        country(blank: false, nullable: true, maxSize: 2)
        postalCode(blank: false, nullable: true, maxSize: 25)
    }

}
