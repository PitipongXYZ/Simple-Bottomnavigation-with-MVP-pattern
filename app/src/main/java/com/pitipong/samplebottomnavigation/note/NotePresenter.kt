package com.pitipong.samplebottomnavigation.note

class NotePresenter(private val noteView: NoteContact.View): NoteContact.Presenter {

    init {
        noteView.presenter = this
    }

    override fun create() {

    }

    override fun start() {

    }

}