package com.manajemenproyek.kuesionerr.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.model.Polling
import com.manajemenproyek.kuesionerr.model.Survey

class AdapterSurvey : RecyclerView.Adapter<SurveyItemViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<Survey>() {
        override fun areItemsTheSame(oldItem: Survey, newItem: Survey): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Survey, newItem: Survey): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, differCallback)

    fun setData(data: List<Survey>) {
        differ.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurveyItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_survei, parent, false)
        return SurveyItemViewHolder(itemView)
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: SurveyItemViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}

class SurveyItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Survey) {
        // Ganti dengan ID ImageView, TextView, dll. yang sesuai dengan tata letak Anda
        itemView.findViewById<ImageView>(R.id.iv_survei).load(item.imgUrl)
        itemView.findViewById<TextView>(R.id.tv_title).text = item.title
        itemView.findViewById<TextView>(R.id.tv_deadline).text = item.deadline
        itemView.findViewById<TextView>(R.id.tv_progress).text = item.responded
    }

    fun bind(item: Polling?) {
        // Ganti dengan ID ImageView, TextView, dll. yang sesuai dengan tata letak Anda
        itemView.findViewById<ImageView>(R.id.iv_survei).load(item?.imgUrl)
        itemView.findViewById<TextView>(R.id.tv_title).text = item?.title
        itemView.findViewById<TextView>(R.id.tv_deadline).text = item?.deadline
        itemView.findViewById<TextView>(R.id.tv_progress).text = item?.responded
    }
}
