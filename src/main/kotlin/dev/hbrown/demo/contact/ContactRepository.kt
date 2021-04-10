package dev.hbrown.demo.contact

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ContactRepository : ReactiveCrudRepository<Contact, Long>

