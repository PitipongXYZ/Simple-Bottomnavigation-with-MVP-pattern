package com.pitipong.samplebottomnavigation.history

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pitipong.samplebottomnavigation.R


class HistoryFragment : Fragment(), HistoryContact.View{

    override var presenter: HistoryContact.Presenter = HistoryPresenter(this)

    companion object {
        fun newInstance(): HistoryFragment {
            val fragment = HistoryFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.history_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.create()
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }
}