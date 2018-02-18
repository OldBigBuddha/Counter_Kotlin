package kyoto.freeprojects.oldbigbuddha.counter_kotlin

import kotlinx.android.synthetic.main.activity_counter.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CounterActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        tv_count.text = count.toString()

        bt_add.setOnClickListener{   tv_count.text = count++.toString() }
        bt_minus.setOnClickListener{ tv_count.text = count--.toString() }


    }
}

