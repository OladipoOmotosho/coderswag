package Adapters

import Model.Category
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

        categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView= categoryView.findViewById((R.id.categoryListimage))
        val categoryName: TextView=categoryView.findViewById(R.id.categoryListTitle)


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

}