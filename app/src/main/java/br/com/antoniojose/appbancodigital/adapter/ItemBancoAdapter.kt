package br.com.antoniojose.appbancodigital.adapter

import android.content.Context
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.antoniojose.appbancodigital.databinding.ItemBancoBinding
import br.com.antoniojose.appbancodigital.model.Item

class ItemBancoAdapter(val context: Context): RecyclerView.Adapter<ItemBancoAdapter.ViewHolderItem>() {

    var listItem: MutableList<Item> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
           val layout_inflate = LayoutInflater.from(parent.context)
           val binding = ItemBancoBinding.inflate(layout_inflate, parent, false)
           return ViewHolderItem( binding )
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        var item = listItem[position]

        holder.binding.tvTitutloItem.text = item.nome
    }

    override fun getItemCount() = listItem.size

    class ViewHolderItem(binding: ItemBancoBinding): RecyclerView.ViewHolder(binding.root){
            var binding = binding
    }
}