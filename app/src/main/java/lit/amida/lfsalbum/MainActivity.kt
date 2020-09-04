package lit.amida.lfsalbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageCat.setOnClickListener{ move("猫", R.drawable.cat_image) }
        imageCake.setOnClickListener { move("ケーキ", R.drawable.cake_image) }
        imageDog.setOnClickListener { move("子犬", R.drawable.dog_image) }
        imageFlower.setOnClickListener { move("花", R.drawable.flower_image) }
        imageNight.setOnClickListener { move("夜景", R.drawable.night_image) }
        imageSea.setOnClickListener { move("海", R.drawable.sea_image) }
    }


    fun move(text:String, resId:Int){
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("resId", resId)
        intent.putExtra("text", text)
        startActivity(intent)
    }
}