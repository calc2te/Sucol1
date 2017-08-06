package idiotlabs.sucol1

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val galleryFragment : GalleryFragment = GalleryFragment()
    var youtubeFragment : YoutubeFragment = YoutubeFragment()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //message.setText(R.string.title_home)
                //setContentFragment(R.id.framelayout, galleryFragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                //message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                //message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentFragment(R.id.framelayout, galleryFragment)

        //fragmentManager.beginTransaction().replace(R.id.framelayout, galleryFragment).commit()
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, youtubeFragment).commit()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
