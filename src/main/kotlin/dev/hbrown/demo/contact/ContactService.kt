package dev.hbrown.demo.contact

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

interface ContactService {

    fun findAll(): List<Contact>
}

@Service
class ContactServiceImpl(
    private val contactRepository: ContactRepository,
) : ContactService {

    private val log: Logger = LoggerFactory.getLogger(javaClass)

    override fun findAll(): List<Contact> = contactRepository
        .findAll()
        .map {
            log.info("Processing element ${it.id}")
            Thread.sleep(500) //pretend we have some important work to do
            it
        }
}
