package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDashboardBinding
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.model.Post
import com.example.myapplication.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)

        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root












        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val root: View = binding.root

        val posts: ArrayList<Post> = ArrayList()
        for (i in 1..200) {
            posts.add(Post("danielmalone_" + i, "asdf asdf text here",
                "https://picsum.photos/600/300?random&$i"
            ))
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = context?.let { PostsAdapter(posts, it) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}