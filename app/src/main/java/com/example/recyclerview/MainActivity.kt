package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main2.view.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.view.*
import kotlinx.android.synthetic.main.item_list2.*
import kotlinx.android.synthetic.main.item_list2.view.*
import java.util.jar.Attributes

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var MainList = findViewById<RecyclerView>(R.id.listView)
        MainList.adapter = MainAdapter(itemList, listener = {
            itemList.get(it).Name
            itemList.get(it).Detail
            itemList.get(it).checked

            Toast.makeText(this, "${itemList.get(it).checked} Selected ", Toast.LENGTH_SHORT).show()

            Toast.makeText(this, "${itemList.get(it).Name} Clicked", Toast.LENGTH_SHORT).show()

//            val itemIntent = Intent(this, ThirdActivity::class.java)
//            startActivity(itemIntent)
        })
        val fab = findViewById<FloatingActionButton>(R.id.FAB)
        fab.setOnClickListener {

            Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
                .putExtra("Android", 0)
            startActivity(intent)
        }
        MainList.layoutManager = LinearLayoutManager(this)


        val AddIntent = intent
        val fileName = intent.getStringExtra("")
        val fileDetails = intent.getStringExtra("")

        var saved = findViewById<RecyclerView>(R.id.listView)

    }

    val itemList = listOf<itemListt>(
        itemListt("Tom", "New Message", false),
        itemListt("Sam", "Student", false),
        itemListt("Tim", "Student", false),
        itemListt("Alex", "Employee",false),
        itemListt("abc", "xyz", false),
        itemListt("def", "zyx", false),
        itemListt("ghi", "age",false),
        itemListt("jkl", "bbbbb", false),
        itemListt("bbbbb", "ccccc", false),
        itemListt("ccccc", "zzzzzzzz",false)
    )

    class itemListt(
        var Name: String,
        var Detail: String,
        var checked: Boolean
//        var Image: ImageView
    )

}


/*public class MyActivity extends Activity {
      protected void onCreate(Bundle icicle) {
          super.onCreate(icicle);

          setContentView(R.layout.content_layout_id);

          final CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_id);
          if (checkBox.isChecked()) {
              checkBox.setChecked(false);
          }
*/