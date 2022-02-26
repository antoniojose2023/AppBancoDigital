package br.com.antoniojose.appbancodigital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import br.com.antoniojose.appbancodigital.adapter.ItemBancoAdapter
import br.com.antoniojose.appbancodigital.data.DataSource
import br.com.antoniojose.appbancodigital.databinding.ActivityMainBinding
import br.com.antoniojose.appbancodigital.model.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterBancoAdapter: ItemBancoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popularLista()
        listaDados()

    }

    private fun listaDados() {

        adapterBancoAdapter = ItemBancoAdapter(this)
        adapterBancoAdapter.listItem = DataSource.getLista()
        adapterBancoAdapter.notifyDataSetChanged()

        binding.rvItemBanco.apply {
            layoutManager = GridLayoutManager(baseContext, 2)
            adapter = adapterBancoAdapter
        }

    }

    fun popularLista(){

       DataSource.listaItem.add(Item("pagar conta", ""))
       DataSource.listaItem.add(Item("recarregar celular", ""))
       DataSource.listaItem.add(Item("detran .ce", ""))
       DataSource.listaItem.add(Item("fazer transferencia", ""))
       DataSource.listaItem.add(Item("ver saldo", ""))
       DataSource.listaItem.add(Item("ver extrato", ""))

    }

}