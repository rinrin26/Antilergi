package com.capstone.antilergi.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.capstone.antilergi.MainActivity
import com.capstone.antilergi.R
import com.capstone.antilergi.databinding.ActivityFragmentRiwayatBinding

class RiwayatFragment  : Fragment(R.layout.activity_fragment_riwayat) {

    private lateinit var riwayatFragment: RiwayatFragment
    private lateinit var riwayatBinding: ActivityFragmentRiwayatBinding
    private lateinit var riwayatViewModel: RiwayatViewModel

    lateinit var riwayatListRV: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        riwayatViewModel =
            ViewModelProvider(this).get(RiwayatViewModel::class.java)
        riwayatBinding = ActivityFragmentRiwayatBinding.inflate(layoutInflater)

        riwayatListRV = riwayatBinding.riwayatListView

        return  riwayatBinding.root
    }
}
