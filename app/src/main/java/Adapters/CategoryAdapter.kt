package Adapters

import Model.Category
import Services.DataService.categories
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R

class CategoryAdapter (context: Context, categories:List<Category>) : BaseAdapter() {

    val context= context
    val cateories= categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val categoryView: View
       val holder: ViewHolder

        if (convertView == null) {
            categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder= ViewHolder()
            holder.categoryImage= categoryView.findViewById(R.id.categoryListimage)
            holder.categoryName= categoryView.findViewById(R.id.categoryListTitle)
            println("I exist for the first Time")
            categoryView.tag = holder
        } else{
            holder= convertView.tag as ViewHolder
            categoryView= convertView
            println("Go green, Recycle!")

        }


        val category = categories[position]

        val resourcesId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourcesId)
        holder.categoryName?.text = category.title
        return categoryView

    }

    override fun getItem(position: Int): Any {
       return cateories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return cateories.count()
    }

    private class ViewHolder{
        var categoryImage: ImageView?= null
        var categoryName: TextView?= null

    }

}