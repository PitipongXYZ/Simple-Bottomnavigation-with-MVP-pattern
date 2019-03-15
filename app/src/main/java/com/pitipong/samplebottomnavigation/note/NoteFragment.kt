package com.pitipong.samplebottomnavigation.note

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pitipong.samplebottomnavigation.R
import kotlinx.android.synthetic.main.note_frag.*

class NoteFragment : Fragment(), NoteContact.View{

    override var presenter: NoteContact.Presenter = NotePresenter(this)

    companion object {
        fun newInstance(): NoteFragment {
            val fragment = NoteFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.note_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.create()
    }

    fun OnDataFatched(msg: String){
        textview_note_title.text = msg
    }
}