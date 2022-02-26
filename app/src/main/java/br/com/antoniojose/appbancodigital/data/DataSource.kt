package br.com.antoniojose.appbancodigital.data

import br.com.antoniojose.appbancodigital.model.Item

object DataSource {

    var listaItem: MutableList<Item> = mutableListOf()

    fun getLista() = listaItem
}