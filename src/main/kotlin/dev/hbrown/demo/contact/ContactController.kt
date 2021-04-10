package dev.hbrown.demo.contact

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contact")
class ContactController(
    private val contactService: ContactService,
) {

    @GetMapping(
        produces = [ MediaType.APPLICATION_JSON_VALUE]
    )
    fun list(): List<Contact> = contactService.findAll()
}
