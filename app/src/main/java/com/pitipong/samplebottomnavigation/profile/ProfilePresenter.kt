package com.pitipong.samplebottomnavigation.profile

class ProfilePresenter(private val profileContact: ProfileContact.View): ProfileContact.Presenter {

    init {
        profileContact.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }
}