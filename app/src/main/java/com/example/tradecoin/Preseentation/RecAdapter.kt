package com.example.tradecoin.Preseentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tradecoin.Domein.GameModel
import com.example.tradecoin.databinding.ItemrecyleBinding

class RecAdapter(var list: List<GameModel>, var onClick:(GameModel)->Unit):
    RecyclerView.Adapter<RecAdapter.VH>(){
    inner class VH( var itemRecyclerBinding: ItemrecyleBinding): RecyclerView.ViewHolder(itemRecyclerBinding.root){
        fun binding(gameModel: GameModel){
            itemRecyclerBinding.textcoin.text=gameModel.btc.toString()

            itemRecyclerBinding.textcoin.text=gameModel.miqdori.toString()

            itemRecyclerBinding.mainclick.setOnClickListener{
                onClick.invoke(gameModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemrecyleBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding(list[position])
    }

}