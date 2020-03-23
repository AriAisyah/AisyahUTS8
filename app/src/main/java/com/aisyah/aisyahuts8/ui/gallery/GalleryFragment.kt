package com.aisyah.aisyahuts8.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aisyah.aisyahuts8.Adapter
import com.aisyah.aisyahuts8.Model
import com.aisyah.aisyahuts8.R

class GalleryFragment : Fragment() {

    private lateinit var rv: RecyclerView
    private var list: ArrayList<Model> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        rv = root.findViewById<RecyclerView>(R.id.RV_Skincare)

        list.addAll(DataSkincare.listData)
        rv.layoutManager = LinearLayoutManager(root.context)

        val listAdapter = Adapter(list)
        rv.adapter = listAdapter

        return root
    }
}