package com.pitipong.samplebottomnavigation.history

class HistoryPresenter(private val profileView: HistoryContact.View): HistoryContact.Presenter {

    init {
        profileView.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }
}