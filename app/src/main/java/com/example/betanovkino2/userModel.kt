package com.example.betanovkino2

class userModel(val phone:String?="",val pass:String?="", val status:String?="") {

    companion object{
        var currentuser:userModel?=null
    }
}