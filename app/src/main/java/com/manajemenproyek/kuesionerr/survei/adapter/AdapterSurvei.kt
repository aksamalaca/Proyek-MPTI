package com.manajemenproyek.kuesionerr.survei.adapter

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
import com.manajemenproyek.kuesionerr.model.Survei

class AdapterSurvei(private val listener: OnItemClickListener) : RecyclerView.Adapter<SurveiItemViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<Survei>() {
        override fun areItemsTheSame(oldItem: Survei, newItem: Survei): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Survei, newItem: Survei): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, differCallback)

    fun setData(data: List<Survei>) {
        differ.submitList(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurveiItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_survei_near, parent, false)
        return SurveiItemViewHolder(itemView, listener)
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: SurveiItemViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}

class SurveiItemViewHolder(itemView: View, private val listener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Survei) {
        itemView.findViewById<ImageView>(R.id.iv_survei_list).load(item.imgUrl)
        itemView.findViewById<TextView>(R.id.tv_title_survei).text = item.title
        itemView.findViewById<TextView>(R.id.tv_deadline_survei).text = item.deadline
        itemView.findViewById<TextView>(R.id.tv_keterangan_survei).text = item.description

        itemView.setOnClickListener {
            listener.onItemClick(item)
        }
    }
}
