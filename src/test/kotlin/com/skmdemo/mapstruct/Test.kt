package com.skmdemo.mapstruct

import com.skmdemo.mapstruct.service.KUserService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest()
@RunWith(value=SpringRunner::class)
@ContextConfiguration(classes = [MapstructKotlinDemoApplication::class])
class Tests (
){
    @Autowired lateinit var service:KUserService

    @Test
    fun contextLoads() {
        val kUser = service.get()
        Assert.assertEquals("David",kUser.username?:"")
    }
}