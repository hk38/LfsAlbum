package lit.amida.lfsalbum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        textView.text = intent.getStringExtra("text")
        imageView.setImageResource(intent.getIntExtra("resId", R.drawable.cat_image))
        button.setOnClickListener { finish() }
    }
}