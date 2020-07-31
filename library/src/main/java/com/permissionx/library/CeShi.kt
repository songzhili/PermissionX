package com.permissionx.library

import java.lang.StringBuilder

fun StringBuilder.aaa(block:StringBuilder.()->Unit){
    block()
}