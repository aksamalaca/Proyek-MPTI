package com.manajemenproyek.kuesionerr.riwayat.adapter

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
import com.manajemenproyek.kuesionerr.model.Riwayat

class AdapterRiwayat : RecyclerView.Adapter<RiwayatItemViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<Riwayat>() {
        override fun areItemsTheSame(oldItem: Riwayat, newItem: Riwayat): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Riwayat, newItem: Riwayat): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, differCallback)

    fun setData(data: List<Riwayat>) {
        differ.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiwayatItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_riwayat_near, parent, false)
        return RiwayatItemViewHolder(itemView)
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: RiwayatItemViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}

class RiwayatItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Riwayat) {
        // Ganti dengan ID ImageView, TextView, dll. yang sesuai dengan tata letak Anda
        itemView.findViewById<ImageView>(R.id.iv_riwayat).load(item.imgUrl)
        itemView.findViewById<TextView>(R.id.tv_title_riwayat).text = item.title
        itemView.findViewById<TextView>(R.id.tv_deadline_riwayat).text = item.deadline
        itemView.findViewById<TextView>(R.id.tv_progress_riwayat).text = item.responded
    }
}