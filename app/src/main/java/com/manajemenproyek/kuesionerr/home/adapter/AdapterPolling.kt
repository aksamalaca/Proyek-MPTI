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

class AdapterPolling : RecyclerView.Adapter<PollingItemViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<Polling>() {
        override fun areItemsTheSame(oldItem: Polling, newItem: Polling): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Polling, newItem: Polling): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, differCallback)

    fun setData(data: List<Polling>) {
        differ.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PollingItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_polling, parent, false)
        return PollingItemViewHolder(itemView)
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: PollingItemViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}

class PollingItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Polling) {
        // Ganti dengan ID ImageView, TextView, dll. yang sesuai dengan tata letak Anda
        itemView.findViewById<ImageView>(R.id.iv_polling).load(item.imgUrl)
        itemView.findViewById<TextView>(R.id.tv_title_polling).text = item.title
        itemView.findViewById<TextView>(R.id.tv_deadline_polling).text = item.deadline
        itemView.findViewById<TextView>(R.id.tv_progress_polling).text = item.responded
    }
}