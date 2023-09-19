package com.example.clubapp.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clubapp.R
import com.example.clubapp.const.Layout
import com.example.clubapp.data.DataSource
import com.example.clubapp.model.Club

class CardAdapter(
    private val context: Context?,
    private val layout: Int,
    private val onlyMyClubs: Boolean
): RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    // Initialize the data using the List found in data/DataSource

    private var clubList = when(onlyMyClubs){
        true -> DataSource.clubs.filter {it.myClub == true}
        else -> DataSource.clubs
    }



    /**
     * Initialize view elements
     */
    class CardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        // Declare and initialize all of the list item UI components
        val clubImageView: ImageView? = view?.findViewById(R.id.clubImage)
        val clubNameText : TextView? = view?.findViewById(R.id.clubName)
        val dayText : TextView? = view?.findViewById(R.id.clubDays)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        // Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        Log.v("myActivity", "Testing1")

        val adapterLayout = when(layout){
            Layout.GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }


        // Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.
        return CardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return clubList.size
    } // return the size of the data set instead of 0

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val resources = context?.resources

        val clubData = clubList[position]
        holder.clubImageView?.setImageResource(clubData.imageResourceId)
        holder.clubNameText?.text = clubData.name
        holder.dayText?.text = "Days of Week: " + clubData.daysOfWeek

    }
}