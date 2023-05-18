package com.example.airbnb

class Booking {

    var name:String = ""
    var email:String = ""
    var age:String = ""
    var time_id:String = ""
    var phone:String = ""
    var residence:String = ""

    constructor(
        name: String,
        email: String,
        age: String,
        time_id: String,
        phone: String,
        residence: String,
    ) {
        this.name = name
        this.email = email
        this.age = age
        this.time_id = time_id
        this.phone = phone
        this.residence = residence
    }

    constructor()
}