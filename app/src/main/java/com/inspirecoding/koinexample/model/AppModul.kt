package com.inspirecoding.koinexample.model

import com.inspirecoding.koinexample.model.Burger
import com.inspirecoding.koinexample.model.Drink
import com.inspirecoding.koinexample.model.Guest
import com.inspirecoding.koinexample.model.Order
import org.koin.dsl.module

/*
This module consists of a module block after the = sign. This block is the container in which you will
map out the services that this module provides, like in the code below, the data module provides
a Guest, a Burger, a Drink and an Order.
 */

var appModul = module {
    factory { Guest(get()) }
    factory { Burger(get()) }
    factory { Drink() }
    factory { Order(get(), get(), get()) }
}