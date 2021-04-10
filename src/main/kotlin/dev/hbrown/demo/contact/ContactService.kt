package dev.hbrown.demo.contact

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration.ofMillis

interface ContactService {

    fun findAll(): Flux<Contact>
}

@Service
class ContactServiceImpl(
    private val contactRepository: ContactRepository,
) : ContactService {

    private val log: Logger = LoggerFactory.getLogger(javaClass)

    override fun findAll(): Flux<Contact> = contactRepository
        .findAll()
        .delayElements(ofMillis(500)) //pretend we have some important work to do
        .doOnNext { log.info("Processing element ${it.id}") }
}
