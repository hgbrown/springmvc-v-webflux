package dev.hbrown.demo.contact

import org.springframework.data.annotation.Id

class Contact(
    @Id
    val id: Long? = null,
    val name: String,
    val mobileNumber: String,
) {

    override fun toString(): String {
        return "Contact(id=[$id] name=[$name] mobileNumber=[$mobileNumber])"
    }

}
