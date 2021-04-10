package dev.hbrown.demo.contact

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/contact")
class ContactController(
    private val contactService: ContactService,
) {

    @GetMapping(
        produces = [ MediaType.TEXT_EVENT_STREAM_VALUE]
    )
    fun stream(): Flux<Contact> = contactService.findAll()
}
