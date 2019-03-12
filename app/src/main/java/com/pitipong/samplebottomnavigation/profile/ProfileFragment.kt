package com.pitipong.samplebottomnavigation.profile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pitipong.samplebottomnavigation.R


class ProfileFragment : Fragment(), ProfileContact.View{

    override var presenter: ProfileContact.Presenter = ProfilePresenter(this)

    companion object {
        fun newInstance(): ProfileFragment {
            val fragment = ProfileFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.profile_frag, container, false)
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