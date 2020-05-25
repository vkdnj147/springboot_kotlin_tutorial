package com.example.blog


import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import javax.persistence.Entity

import javax.persistence.GeneratedValue
import javax.persistence.ManyToOne

@Entity
class Article(

        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @javax.persistence.Id @Id @GeneratedValue var id: Long? = null)


@Entity
class User(
        var login: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null,
        @javax.persistence.Id @Id @GeneratedValue var id: Long? = null)