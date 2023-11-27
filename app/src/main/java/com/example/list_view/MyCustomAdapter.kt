package com.example.list_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MyCustomAdapter(var ctx: Context,
                      var ourResources: Int,
                      var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResources, Items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResources, null)

        val name = view.findViewById<TextView>(R.id.idName)
        val extra = view.findViewById<TextView>(R.id.idExtraTxt)
        val img = view.findViewById<ImageView>(R.id.idImage1)

        name.text = Items[position].Name
        extra.text = Items[position].extraText
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))



        return view
    }
}