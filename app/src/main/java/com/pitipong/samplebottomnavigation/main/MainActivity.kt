package com.pitipong.samplebottomnavigation.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.pitipong.samplebottomnavigation.R
import com.pitipong.samplebottomnavigation.adapter.ViewPagerAdapter
import com.pitipong.samplebottomnavigation.history.HistoryFragment
import com.pitipong.samplebottomnavigation.note.NoteFragment
import com.pitipong.samplebottomnavigation.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var noteFragment: NoteFragment? = null
    private var historyFragment: HistoryFragment? = null
    private var profileFragment: ProfileFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        initFragments()

        pass_data.setOnClickListener {
            TODO("This's a method of NoteFragment. The name of a method is OnDataFetched it's mean data already fetch")
            noteFragment!!.OnDataFetched(edittext_data.text.toString())
        }
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_note -> {
                viewpager.setCurrentItem(0, true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_history -> {
                viewpager.setCurrentItem(1, true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                viewpager.setCurrentItem(2, true)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun initFragments() {
        noteFragment = NoteFragment.newInstance()
        historyFragment = HistoryFragment.newInstance()
        profileFragment = ProfileFragment.newInstance()

        initViewPager()
    }

    private fun initViewPager() {
        setupViewPager(viewpager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(noteFragment!!, "Note")
        adapter.addFragment(historyFragment!!, "History")
        adapter.addFragment(profileFragment!!, "Profile")
        viewPager.adapter = adapter
    }
}
