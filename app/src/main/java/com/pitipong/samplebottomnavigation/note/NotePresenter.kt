package com.pitipong.samplebottomnavigation.note

class NotePresenter(private val noteContact: NoteContact.View): NoteContact.Presenter {

    init {
        noteContact.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }
}