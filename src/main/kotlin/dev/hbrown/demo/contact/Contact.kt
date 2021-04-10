package dev.hbrown.demo.contact

import javax.persistence.*

@Entity
@Table(name = "contact")
@SequenceGenerator(name = "contact_generator", sequenceName = "contact_sequence", allocationSize = 1)
class Contact(

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_generator")
    val id: Long? = null,

    @Column(name = "name", nullable = false, length = 255)
    val name: String,

    @Column(name = "mobile_number", nullable = false, length = 20)
    val mobileNumber: String,
) {

    override fun toString(): String {
        return "Contact(id=[$id] name=[$name] mobileNumber=[$mobileNumber])"
    }

}
