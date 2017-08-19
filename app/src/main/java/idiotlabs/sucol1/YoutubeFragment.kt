package idiotlabs.sucol1


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.fragment_youtube.*

/**
 * 3ZGXn2_EjAw
 * */

/**
 * A simple [Fragment] subclass.
 */
//class YoutubeFragment : Fragment() {
//class YoutubeFragment : YouTubePlayerSupportFragment(), YouTubePlayer.OnInitializedListener {
class YoutubeFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView : View = inflater!!.inflate(R.layout.fragment_youtube, container, false)

        recyclerView = rootView!!.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(context)

        val users = ArrayList<User>()

        users.add(User("Belal Khan", "Ranchi Jharkhand"))
        users.add(User("Belal Khan2", "Ranchi Jharkhand2"))
        users.add(User("Belal Khan3", "Ranchi Jharkhand3"))

        recyclerView!!.adapter = YoutubeAdapter(users)

        return rootView
    }

//    fun newInstance() : YoutubeFragment {
//        val youtubeFragment : YoutubeFragment = YoutubeFragment()
//        youtubeFragment.initialize("", this)
//
//        return youtubeFragment
//    }

//    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//        p1?.cuePlaylist("3ZGXn2_EjAw")
//    }
//
//    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//        System.out.println("error" + p1.toString())
//    }


}// Required empty public constructor
