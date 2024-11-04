package com.m3.m4hw1

import java.io.Serializable

data class User(
    val name : String ="",
    val email : String= "",
    val password : Int

) : Serializable
