package com.pitipong.samplebottomnavigation.history

class HistoryPresenter(private val profileContact: HistoryContact.View): HistoryContact.Presenter {

    init {
        profileContact.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }
}