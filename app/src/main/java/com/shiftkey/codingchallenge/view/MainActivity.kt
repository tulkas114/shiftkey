package com.shiftkey.codingchallenge.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shiftkey.codingchallenge.R
import com.shiftkey.codingchallenge.databinding.ActivityMainBinding
import com.shiftkey.codingchallenge.model.ShiftItem
import com.shiftkey.codingchallenge.model.StageRepository
import com.shiftkey.codingchallenge.model.data.Shifts
import com.shiftkey.codingchallenge.utils.Status
import com.shiftkey.codingchallenge.viewmodel.MainActivityViewModel


class MainActivity : AppCompatActivity() {
    companion object{
         val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.progressCircular.visibility = View.VISIBLE
        initRecyclerView()
        getShifts()

    }

    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager



    }

    private fun getShifts() {
        viewModel.list.observe(this, Observer {
            if (it.status != Status.SUCCESS || it.data == null) {
                Log.e(TAG, " resource data is null")
            }
            binding.progressCircular.visibility = View.GONE
            binding.recyclerView.adapter = RecyclerViewAdapter(it.data as MutableList<ShiftItem>)

        })

    }
}


