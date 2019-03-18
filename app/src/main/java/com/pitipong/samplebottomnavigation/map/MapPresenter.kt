package com.pitipong.samplebottomnavigation.map

class MapPresenter(private val mapView: MapContact.View): MapContact.Presenter {

    init {
        mapView.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }
}